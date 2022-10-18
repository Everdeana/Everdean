#날씨 정보 웹 크로링 프로젝트
import csv # Comma Separated Values 파일 기록
import time # 프로세스 일시 중지
import datetime # 현재 시간 확인
import bs4 # HTML에서 필요한 내용 추출
import urllib.request # HTML 파일에 접근 
from urllib.request import Request, urlopen

csvName = 'csv/seoul_weather.csv' # 정보를 저장할 csv파일명과 위치
with open(csvName, 'w', newline='') as csvFp: # Write로 csv파일 open
    # Windows의 경우 csv 모듈에서 데이터를 쓸 때 각 라인 뒤에 빈 라인이 추가되는 문제가 있으므로 
    # 이를 없애기 위헤 Python3에서는 newline='' 옵션을 지정한다.
    csvWriter = csv.writer(csvFp) # 파일 객체를 csv.writer에 넣어서 파일 쓰기
    csvWriter.writerow(['연월일', '시분초', '지역', '날씨', '온도', '습도', '강수확률', '풍속']) # 데이터 1라인 작성
   
googleUrl = "https://www.google.co.kr/search?q=%EC%84%9C%EC%9A%B8+%EB%82%A0%EC%94%A8&newwindow=1&biw=661&bih=618&sxsrf=ALiCzsZ0cWCkIdwCi4XOuw2-VomWB0q2vw%3A1665318686595&ei=Hr9CY-PyI_fL2roPxfOy6A0&ved=0ahUKEwjj-YHGk9P6AhX3pVYBHcW5DN0Q4dUDCA8&uact=5&oq=%EC%84%9C%EC%9A%B8+%EB%82%A0%EC%94%A8&gs_lcp=Cgdnd3Mtd2l6EAMyCggAELEDEIMBEEMyBQgAEIAEMggIABCABBCxAzIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQyBQgAEIAEMgUIABCABDIFCAAQgAQ6BAgAEEM6BAgAEAM6CwgAEIAEELEDEIMBSgQIQRgASgQIRhgAUABYsApgxA1oAHABeACAAZADiAGjDpIBCTAuMi4yLjIuMZgBAKABAcABAQ&sclient=gws-wiz"
# HTML을 가져올 URL 선언
while True:
    # python의 urllib을 사용해서 접근을 하면 서버 시큐리티가 쉽게 감지를 하여 블록시킨다.
    # 따라서 브라우저 유저 에이전트를 사용하여 접근한다.
    htmlObject = Request(googleUrl, headers = {'user-agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.116 Safari/537.36'})
    webPage = urlopen(htmlObject).read() # .read()로 HTML을 앍어온다. 
    bsObject = bs4.BeautifulSoup(webPage, 'html.parser') # 문자열 형식의 webPage를 BeautifulSoup 객체 형식(HTML)으로 변환한다.
    # print(bsObject)
    loc = bsObject.find('div', {'id': 'wob_loc'}) # .find를 사용하여 해당 태그의 class나 id에서 값을 찾는다.
    loc = loc.string if loc else loc # .string을 사용하여 태그 안에 내용이 없다면 None을 출력시킨다.
    # print(loc)
    wea = bsObject.find('span', {'id': 'wob_dc'})
    wea = wea.string if wea else wea
    # print(wea)
    temper = bsObject.find('span', {'id': 'wob_tm'})
    temper = temper.string if temper else temper
    # print(temper)
    humi = bsObject.find('span', {'id': 'wob_hm'})
    humi = humi.string if humi else humi
    # print(humi)
    rain = bsObject.find('span', {'id': 'wob_pp'})
    rain = rain.string if rain else rain
    # print(rain)
    wind = bsObject.find('span', {'id': 'wob_ws'})
    wind = wind.string if wind else wind
    # print(wind)
    

    now = datetime.datetime.now() # 현재 시간과 날짜를 가져옴
    yymmdd = now.strftime('%Y-%m-%d') # strftime으로 날짜를 문자열로 변환한다.
    hhmmss = now.strftime('%H:%M:%S') # strftime으로 시간을 문자열로 변환한다.

    weather_list = [yymmdd, hhmmss, loc, wea, temper, humi, rain, wind] # csv 파일에 기록할 리스트 생성
    with open(csvName, 'a', newline='') as csvFp: # 쓰기(a)로 csv파일에 기록
        csvWriter = csv.writer(csvFp) # .writer를 사용하여 csv 파일에 위에서 가져온 내용을 기록한다.
        csvWriter.writerow(weather_list)
        print(weather_list)
        
    time.sleep(10) # 2시간 간격으로 정보 추출