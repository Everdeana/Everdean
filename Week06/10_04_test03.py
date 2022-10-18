#날씨 정보 웹 크로링 프로젝트
import csv
import time
import datetime
import bs4
import urllib.request
 
from matplotlib.pyplot import text
 
csvName = 'csv/paju_weather.csv'
with open(csvName, 'w', newline='') as csvFp:
    csvWriter = csv.writer(csvFp)
    csvWriter.writerow(['연월일', '시분초', '온도', '습도', '강수량', '풍향'])
   
nateUrl = "https://news.nate.com/weather?areaCode=11B20303"
while True:
    htmlObject = urllib.request.urlopen(nateUrl)
    webPage = htmlObject.read()
    bsObject = bs4.BeautifulSoup(webPage, 'html.parser')
    tag = bsObject.find('div', {'class': 'right_today'})
    temper = tag.find('p', {'class':'celsius'}).text # celsius --> 섭씨
    humi = tag.find('p', {'class':'humidity'}).text # humidity --> 습도
    rain = tag.find('p', {'class':'rainfall'}).text # rainfall --> 강수량
    wind = tag.find('p', {'class':'wind'}).text # wind --> 풍향
 
    now = datetime.datetime.now()
    yymmdd = now.strftime('%Y-%m-%d')
    hhmmss = now.strftime('%H:%M:%S')
 
    weather_list = [yymmdd, hhmmss, temper, humi, rain, wind]
    with open(csvName, 'a', newline='') as csvFp:
        csvWriter = csv.writer(csvFp)
        csvWriter.writerow(weather_list)
        print(weather_list)
 
time.sleep(3600)
 

