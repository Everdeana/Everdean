import bs4
import urllib.request

naverUrl = "https://www.nate.com"
htmlObject = urllib.request.urlopen(naverUrl)

# print(htmlObject) --> <http.client.HTTPResponse object at 0x0000029B11405668>

webPage = htmlObject.read()
bsObject = bs4.BeautifulSoup(webPage, 'html.parser')
# webPage를 BeautifulSoup 객체형식으로 변경
# print(type(bsObject)) --> <class 'bs4.BeautifulSoup'>

tag = bsObject.find('div', {'id' : 'NateBi'})
print(tag, '\n')
print("------------------------------------------------------------------")

a_tag = tag.find('a')
print(a_tag)
print("------------------------------------------------------------------")

href = a_tag['href']
print(href)
print("------------------------------------------------------------------")

text = a_tag.text
print(text)
print("------------------------------------------------------------------")