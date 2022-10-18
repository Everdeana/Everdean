import bs4

webPage = open('html/sample02.html', 'rt', encoding='utf-8').read()
bsObject = bs4.BeautifulSoup(webPage, 'html.parser')

# print(type(bsObject)) # <class 'bs4.BeautifulSoup'>

tag_ul = bsObject.find('ul') # sample02.html 문서에 있는 <ul> 태그만 검색
print(tag_ul)
print()

tag_li = bsObject.find('li') # sample02.html 문서에 있는 <li> 태그만 검색
print(tag_ul)
print()

tag_li_all = bsObject.findAll('li') # sample02.html 문서에 있는 <li> 태그만 검색
print(tag_li_all)
print()