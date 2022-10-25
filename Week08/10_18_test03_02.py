# yes24 인터넷 서점에서 국내소설 판매량이 높은 책 정보를 웹 크롤링 하는 프로그램
# 추출할 키워드: 도서명(div class="goods_name"), 저자(span class="goods_auth"), 출판사(span class="goods_pub"), 출간일(span class="goods_date"), 가격(em class="yes_b")
 
import bs4
import urllib.request
import csv # Comma Separated Values 파일 기록
 
 
csvName = 'csv/bookInfo.csv' # 정보를 저장할 csv파일명과 위치

with open(csvName, 'w', newline='') as csvFp: # Write로 csv파일 open
    # Windows의 경우 csv 모듈에서 데이터를 쓸 때 각 라인 뒤에 빈 라인이 추가되는 문제가 있으므로 
    # 이를 없애기 위헤 Python3에서는 newline='' 옵션을 지정한다.
    csvWriter = csv.writer(csvFp) # 파일 객체를 csv.writer에 넣어서 파일 쓰기
    csvWriter.writerow(['도서명', '저자', '출판사', '출간일', '가격']) # 데이터 1라인 작성
# 함수 정의
def getBookInfo(book_tag): # C언어 --> int getBookInfo(int book_tag) {  }
    name = book_tag.find("div", {"class":"goods_name"})
    bookName = name.find("a").text
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

def totalPrice(totbook):
    bookPrice = totbook.find("em", {"class":"yes_b"}).text
    bookPrice = int(bookPrice.replace(',','')) # 리스트의 각 요소 문자열에서 콤마 제거
    # print(bookPrice)
    return bookPrice

# 전역 변수 선언
bookUrl = "http://www.yes24.com/24/Category/Display/001001046001?ParamSortTp=05"
 
#메인 코드  
htmlObject = urllib.request.urlopen(bookUrl)
webPage = htmlObject.read()
bsObject = bs4.BeautifulSoup(webPage, 'html.parser')
tag = bsObject.find('ul', {'class':'clearfix'})
all_books = tag.findAll('div', {'class':'goods_info'})

 
for book in all_books:
    print(getBookInfo(book)) # 책 정보를 모두 출력

price_list = [] # 가격을 저장할 리스트 선언
for price in all_books:
    price_list.append(totalPrice(price)) # for문을 통해 책의 개수만큼 list에 가격을 저장한다.
    #print(totalPrice(price))
    
int_list = list(map(int, price_list)) # 리스트의 요소들을 각각 int 형으로 변환
tot_price = sum(int_list)
# print(int_list)

# 가격의 총합을 csv 파일에 기록하도록 한다. --> 콤마를 숫자 사이에 넣어서 가격을 출력한다.
totP_list = ['Total Price: ', "￦" + "{:,}".format(tot_price)] # 리스트에 저장하여 csv파일에 작성
with open(csvName, 'a', newline='') as csvFp: # 쓰기(a)로 csv파일에 기록
        csvWriter = csv.writer(csvFp) # .writer를 사용하여 csv 파일에 위에서 가져온 내용을 기록한다.
        csvWriter.writerow(totP_list) #

print("Total Price: ￦", "{:,}".format(tot_price)) # 콤마를 숫자 형식으로 넣어서 출력한다.