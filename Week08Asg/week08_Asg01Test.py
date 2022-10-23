# yes24 인터넷 서점에서 국내소설 판매량이 높은 책 정보를 웹 크롤링 하는 프로그램
# 모든 페이지 정보를 추출하고 추출한 도서들의 가격 합계를 구해주는 프로그램
# 추출할 키워드: 도서명(div class="goods_name"), 저자(span class="goods_auth"), 출판사(span class="goods_pub"), 출간일(span class="goods_date"), 가격(em class="yes_b")

import bs4 # HTML에서 필요한 내용 추출
import urllib.request # HTML 파일에 접근 
import csv # Comma Separated Values 파일 기록

csvName = 'csv/bookInfo.csv' # 정보를 저장할 csv파일명과 위치

with open(csvName, 'w', newline='') as csvFp: # Write로 csv파일 open
    # Windows의 경우 csv 모듈에서 데이터를 쓸 때 각 라인 뒤에 빈 라인이 추가되는 문제가 있으므로 
    # 이를 없애기 위헤 Python3에서는 newline='' 옵션을 지정한다.
    csvWriter = csv.writer(csvFp) # 파일 객체를 csv.writer에 넣어서 파일 쓰기
    csvWriter.writerow(['도서명', '저자', '출판사', '출간일', '가격']) # 데이터 1라인 작성
 
# 함수 정의
def getBookInfo(book_tag): # C언어 --> int getBookInfo(int book_tag) {  }
    name = book_tag.find("div", {"class":"goods_name"}) # goods_name 클래스에 해당하는 div 태그를 찾는다.
    bookName = name.find("a").text # div 태그 안의 a 태그에 있는 도서명 정보를 text 형식으로 가져온다.
    auths = book_tag.find("span", {"class":"goods_auth"})
    bookAuth = auths.find("a").text
    bookPub = book_tag.find("span", {"class":"goods_pub"}).text
    bookDate = book_tag.find("span", {"class":"goods_date"}).text
    bookPrice = book_tag.find("em", {"class":"yes_b"}).text
    
    bookList = [bookName, bookAuth, bookPub, bookDate, bookPrice] # csv 파일에 기록할 리스트 생성
    with open(csvName, 'a', newline='') as csvFp: # 쓰기(a)로 csv파일에 기록
        csvWriter = csv.writer(csvFp) # .writer를 사용하여 csv 파일에 위에서 가져온 내용을 기록한다.
        csvWriter.writerow(bookList)
    return [bookName, bookAuth, bookPub, bookDate, bookPrice]

def totalPrice(totbook): # 가격을 가져와서 int 형식으로 바꿔주는 함수 선언
    bookPrice = totbook.find("em", {"class":"yes_b"}).text # em태그로 가격을 찾는다.
    bookPrice = int(bookPrice.replace(',','')) # 리스트의 각 요소 문자열에서 콤마 제거
    return bookPrice # 콤마를 없애고 int 형으로 바꾼 bookPrice값 return
 
# 전역 변수 선언
url = "http://www.yes24.com/24/Category/Display/001001046001?ParamSortTp=05&PageNumber="
pageNumber = 1 # 모든 페이지의 값을 가져오기 위해 1페이지부터 url을 가져옴

# 가격 합계를 저장할 리스트 선언 --> while문으로 리스트에 요소가 계속 추가되어야 하므로 전역으로 선언
# 모든 책 가격을 한 리스트에 몰아넣으면 리스트가 너무 커지므로 각 페이지마다의 책 합계를 리스트에 저장한다.
total_list = [] 

#메인 코드  
while True:
    try:
        bookUrl = url + str(pageNumber) # url에 페이지 번호를 추가하여 첫페이지부터 값을 받아오기 위해 선언
        pageNumber += 1 # 페이지 1씩 늘림
        htmlObject = urllib.request.urlopen(bookUrl) # url을 열어 값을 가져오기 위해 선언
        webPage = htmlObject.read() # .read()로 HTML을 앍어온다. 
        bsObject = bs4.BeautifulSoup(webPage, 'html.parser') # 문자열 형식의 webPage를 BeautifulSoup 객체 형식(HTML)으로 변환한다.
        tag = bsObject.find('ul', {'class':'clearfix'}) # 책의 모든 정보가 나와있는 ul 태그를 찾는다.
        all_books = tag.findAll('div', {'class':'goods_info'}) # 원하는 항목이 있는 div 태그를 찾는다.
        price_list = [] # 가격을 저장할 리스트 선언 --> 각 페이지마다 리스트를 새로 만들 것이므로 while문 안에 선언
     
        for book in all_books:
            print(getBookInfo(book)) # 책 정보를 모두 출력
            
        for price in all_books:
            price_list.append(totalPrice(price)) # for문을 통해 책의 개수만큼 list에 가격을 저장한다.
        
        int_list = list(map(int, price_list)) # 리스트의 요소들을 각각 int 형으로 변환
        tot_price = sum(int_list) # 한 페이지의 책 가격 합계를 tot_price에 저장
        
        total_list.append(tot_price) # 한 페이지의 책 가격 총합을 리스트의 끝에 저장한다.
        # print(total_list)
        
    except:
        break

total_sum = sum(total_list) # 리스트의 모든 값을 더하여 총합을 total_sum에 저장한다.
# 가격의 총합을 csv 파일에 기록하도록 한다. --> 콤마를 숫자 사이에 넣어서 가격을 출력한다.
csv_list = ['Total Price: ', "￦" + "{:,}".format(total_sum)] # 리스트에 저장하여 csv파일에 작성
with open(csvName, 'a', newline='') as csvFp: # 쓰기(a)로 csv파일에 기록
        csvWriter = csv.writer(csvFp) # .writer를 사용하여 csv 파일에 위에서 가져온 내용을 기록한다.
        csvWriter.writerow(csv_list)

print("Total Price: ￦", "{:,}".format(total_sum)) # 콤마를 숫자 형식으로 넣어서 출력한다.
