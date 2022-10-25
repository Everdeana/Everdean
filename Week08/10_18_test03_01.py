# yes24 인터넷 서점에서 국내소설 판매량이 높은 책 정보를 웹 크롤링 하는 프로그램
# 추출할 키워드: 도서명(div class="goods_name"), 저자(span class="goods_auth"), 출판사(span class="goods_pub"), 출간일(span class="goods_date"), 가격(em class="yes_b")
 
import bs4
import urllib.request
 
# 함수 정의
def getBookInfo(book_tag): # C언어 --> int getBookInfo(int book_tag) {  }
    name = book_tag.find("div", {"class":"goods_name"})
    bookName = name.find("a").text
    auths = book_tag.find("span", {"class":"goods_auth"})
    bookAuth = auths.find("a").text
    bookPub = book_tag.find("span", {"class":"goods_pub"}).text
    bookDate = book_tag.find("span", {"class":"goods_date"}).text
    bookPrice = book_tag.find("em", {"class":"yes_b"}).text
    return [bookName, bookAuth, bookPub, bookDate, bookPrice] # 리스트 형식으로 리턴
 
# 전역 변수 선언
url = "http://www.yes24.com/24/Category/Display/001001046001?ParamSortTp=05&PageNumber="
pageNumber = 1 # 페이지 이동을 위한 변수 선언
 
#메인 코드  
while True:
    try:
        bookUrl = url + str(pageNumber) # url 맨 끝에 페이지 번호 추가
        pageNumber += 1 #  페이지 번호 하나 올림
        htmlObject = urllib.request.urlopen(bookUrl)
        webPage = htmlObject.read()
        bsObject = bs4.BeautifulSoup(webPage, 'html.parser') # html 형식으로 변환
        tag = bsObject.find('ul', {'class':'clearfix'})
        all_books = tag.findAll('div', {'class':'goods_info'})
 
        for book in all_books:
            print(getBookInfo(book)) # 책 정보 모두 출력
           
    except:
        break