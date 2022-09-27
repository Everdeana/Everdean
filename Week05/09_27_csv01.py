inFp = open("csv/singer1.csv", "r") # 읽어올 파일의 경로와 파일 이름 열기("r" --> read mode로 가져옴)
inStr = inFp.readline() # 오픈한 csv 파일에서 한 줄을 읽는다.
print(inStr, end = "")

inFp.close() # 작업이 끝나면 파일을 닫기