def printList(pList):
    for data in pList:
        print(data, end = '\t')
    print()

with open("csv/singer1.csv", "r") as inFp: # with를 사용하면 close()를 할 필요가 없다.
    header = inFp.readline()
    header = header.strip() # 헤더(항목: 필드명)를 분리
    header_list = header.split(',')
    
    printList(header_list) # 함수 호출
    
    for inStr in inFp:
        inStr = inStr.strip()
        row_list = inStr.split(',')
        print(row_list)
