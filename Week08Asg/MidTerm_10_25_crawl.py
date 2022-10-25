import bs4 # html 데이터를 추출함
import urllib.request # html 데이터에 접근함
import csv # csv 파일에 기록함
import sqlite3 # DB를 사용하기 위함

# YES24 WebPage에서 도서명, 저자, 출판사, 출간일, 가격 등의 전보를 크롤링함

''' 추출할 클래스 이름
  1. 페이지 전체 정보가 있는 태그: ul class = "clearfix"
  2. 한 도서의 정보가 있는 태그: div class="goods_info"
  3. 도서명: div class="goods_name" --> <a href="#">도서명</a>
  4. 저자: span class="goods_auth"  --> <a href="#" target="_blank">저자</a>
  5. 출판사: span class="goods_pub"
  6. 출간일: span class="goods_date"
  7. 가격: em class="yes_b" '''

''' 1. DB명: bookInfo.db
    2. Table명: BookList
    3. 필드명: CREATE TABLE BookList (Book_name char(50), Book_auth char(20), Book_pub char(20), Book_date char(20), Book_price char(20)); '''
  
csvName = 'csv/bookInfo.csv' # 크롤링한 정보를 저장할 csv 파일의 경로와 이름 선언
con = sqlite3.connect('./bookInfo.db') # sqlite.connect를 사용하여 DB를 연결시키는 것을 con으로 선언한다.
cur = con.cursor() # SQL 쿼리를 동작시키기 위해 선언

# csv 파일에 머리글을 작성하기 위해 선언
with open(csvName, 'w', newline='') as csvFile: # 각 라인 뒤에 빈칸이 생기는 windows의 문제를 해결하기 위해 newline='' 추가
    csvWriter = csv.writer(csvFile) # .writer를 사용하여 csv 파일에 작성한다.
    csvWriter.writerow(['도서명', '저자', '출판사', '출간일', '가격']) # 리스트 형식으로 csv 파일에 머리글 작성

def getBookInfo(book_tag): # 웹페이지에서 정보를 가져온 후 csv 파일에 해당 정보를 기록하는 함수 선언
    names = book_tag.find("div", {"class":"goods_name"}) # 해당 태그의 클래스 이름으로 값을 가져옴 --> 딕셔너리 타입 사용
    bookNames = names.find("a").text # 도서명과 저자는 링크가 걸려있으므로 a 태드에서 text를 찾아서 가져온다.
    auths = book_tag.find("span", {"class":"goods_auth"})
    bookAuths = auths.find("a").text
    bookPubs = book_tag.find("span", {"class":"goods_pub"}).text
    bookDates = book_tag.find("span", {"class":"goods_pub"}).text
    bookPrices = book_tag.find("em", {"class":"yes_b"}).text
    
    book_list =  [bookNames, bookAuths, bookPubs, bookDates, bookPrices] # csv 파일에 기록하기 위해 리스트 선언
    with open(csvName, 'a', newline='') as csvFile: # 쓰기(a)로 csv파일에 기록
        csvWriter = csv.writer(csvFile) # .writer를 사용하여 csv 파일에 작성한다.
        csvWriter.writerow(book_list) # 위에서 크롤링하여 리스트에 저장한 정보를 csv 파일에 작성한다.
    sql = "insert into BookList values('"+bookNames+"', '"+bookAuths+"', '"+bookPubs+"', '"+bookDates+"', '"+bookPrices+"')"
    # insert into를 사용하여 BookList 테이블에 위에서 가져온 정보들을 넣어준다.
    # print(sql)
    cur.execute(sql) # 쿼리문 실행
    return [bookNames, bookAuths, bookPubs, bookDates, bookPrices] # 가져온 정보들을 리턴한다.
                                  
# 전역 변수 선언                                  
# url 끝에 페이지 번호를 넣어서 페이지별로 정보를 가져올 수 있도록 한다.
bookUrl = "http://www.yes24.com/24/Category/Display/001001047010?ParamSortTp=05&PageNumber=" 
pageNumber = 1 # 페이지별로 정보를 가져오기 위해 선언


while True:
    try:
         # 주소창에 입력되는 url이므로 pageNum을 넣을 때 str로 형변환을 시킨다.
        mainUrl = bookUrl + str(pageNumber) # 두 변수를 더할 때 오류가 나지 않도록 같은 str 타입으로 맞춰준다.
        pageNumber += 1 # 반복이 될 때마다 페이지 번호를 1 더하여 다음 페이지로 넘어가도록 한다.
        htmlObject = urllib.request.urlopen(mainUrl) # urllib을 사용하여 url을 열어 값을 거져온다.
        webPage = htmlObject.read() # .read로 html을 읽어오는 webPage 변수 선언
        bsObject = bs4.BeautifulSoup(webPage, 'html.parser') # webPage에서 가져온 데이터를 beautifulsoup 형식으로 바꿔준다.
        tag = bsObject.find('ul', {"class":"clearfix"}) # 한 페이지의 모든 책 정보가 나와있는 clearfix 태그를 사용하여 책들의 정보를 가져온다.
        all_books = tag.findAll('div', {'class':'goods_info'}) # 책 한귄의 정보가 있는 goods_info를 사용하여 정보들을 가져온다.

        for book in all_books:
            print(getBookInfo(book)) # 모든 책들의 모든 정보 출력
            
    except:
        break

con.commit() # 데이터 저장을 위해 commit을 해준다.
con.close() # DB 접속 종료