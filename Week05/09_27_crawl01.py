import urllib.request
import bs4


naverUrl = "https://www.naver.com"
htmlObject = urllib.request.urlopen(naverUrl)

'''print(type(htmlObject))
html = htmlObject.read()
print(html)'''

bsObject = bs4.BeautifulSoup(htmlObject, 'html.parser')
print(bsObject)