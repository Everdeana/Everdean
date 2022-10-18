
#날씨 정보 웹 크로링 프로젝트
import csv
import time
import datetime
import bs4
import urllib.request
from urllib.request import Request, urlopen

from matplotlib.pyplot import text

csvName = 'csv/seoul_weather.csv'
with open(csvName, 'w', newline='') as csvFp:
    csvWriter = csv.writer(csvFp)
    csvWriter.writerow(['연월일', '시분초', '지역',  '온도', '습도', '강수량', '풍향'])
   
googleUrl = "https://www.google.co.kr/search?q=%EB%82%A0%EC%94%A8&newwindow=1&sxsrf=ALiCzsY1TkZXAcnRhpr8Qc0t7zTHOjrXmg%3A1665314925874&ei=bbBCY8r0NKm52roPr5uT6A0&ved=0ahUKEwiK3-HEhdP6AhWpnFYBHa_NBN0Q4dUDCA8&uact=5&oq=%EB%82%A0%EC%94%A8&gs_lcp=Cgdnd3Mtd2l6EAMyEAgAEIAEELEDEIMBEEYQgAIyCwgAEIAEELEDEIMBMggIABCABBCxAzILCAAQgAQQsQMQgwEyBQgAEIAEMgUIABCABDIFCAAQgAQyCAgAEIAEELEDMgsIABCABBCxAxCDATILCAAQgAQQsQMQgwE6CggAEEcQ1gQQsAM6BgizARCFBDoHCAAQgAQQCjoRCC4QgAQQsQMQgwEQxwEQ0QM6FAguEIAEELEDEIMBEMcBENEDENQCOhEILhCABBCxAxDHARDRAxDUAjoECAAQQzoQCC4QsQMQgwEQxwEQ0QMQQzoKCC4QxwEQ0QMQQzoECAAQAzoOCC4QgAQQsQMQgwEQ1AI6DwgAELEDEIMBEEMQRhCAAkoECEEYAEoECEYYAFDGBFicKGCEKWgHcAF4AYABtgGIAZwLkgEEMC4xMJgBAKABAbABAcgBCsABAQ&sclient=gws-wiz"
while True:
    # htmlObject = urllib.request.urlopen(googleUrl)
    htmlObject = urllib.request.urlopen(googleUrl)
    webPage = htmlObject.read()
    bsObject = bs4.BeautifulSoup(webPage, 'html.parser')
    loc = bsObject.find('div', {'id': 'wob_loc'})
    loc = loc.string if loc else loc
    today = bsObject.find('div', {'id': 'wob_dts'})
    today = today.string if today else today
    status = bsObject.find('span', {'id': 'wob_dc'})
    status = status.string if status else status
    temper = bsObject.find('span', {'id':'wob_tm'}) # celsius --> 섭씨
    temper = temper.string if temper else temper
    humi = bsObject.find('span', {'id': 'wob_hm'}) # humidity --> 습도
    humi = humi.string if humi else humi
    rain = bsObject.find('span', {'id':'wob_pp'}) # rainfall --> 강수량
    rain = rain.string if rain else rain
    wind = bsObject.find('span', {'id':'wob_ws'}) # wind --> 풍향
    wind = wind.string if wind else wind
    '''
    tag = bsObject.find('div', {'id': 'wob_wc'})
    location = tag.find('div', {'id':'wob_loc'}).text # 지역
    
    '''

    now = datetime.datetime.now()
    yymmdd = now.strftime('%Y-%m-%d')
    hhmmss = now.strftime('%H:%M:%S')

    weather_list = [yymmdd, hhmmss, loc, today, status, rain, wind]
    with open(csvName, 'a', newline='') as csvFp:
        csvWriter = csv.writer(csvFp)
        csvWriter.writerow(weather_list)
        print(weather_list)

time.sleep(3600)