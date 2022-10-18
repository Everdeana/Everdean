#데이터베이스(SQLite) 연동 프로그램
import sqlite3
con = sqlite3.connect("ndb.db") # ndb가 있을 경우 연결, 없으면 생성
cur = con.cursor()  #쿼리 문(query--> 질의어) 을 수행하기 위한 함수
cur.execute("create table Test(id char(10), userName char(20), email char(30), year integer)")
'''
데이터베이스 명: ndb
테이블 명: Test
테이블 필드명: id, userName, email, year
'''
while (True):
    data1 = input("사용자ID=")
    if data1 == "":
        break
    data2 = input("사용자이름=")
    data3 = input("이메일=")
    data4 = input("가입년도=")
    # 키보드로 입력된 사용자ID, 사용자이름, 이메일, 가입년도를 데이터베이스 저장(삽입)
    sql = "insert into Test values('"+data1+"', '"+data2+"', '"+data3+"', "+data4+")"
    print(sql)
    cur.execute(sql)
 
con.commit()
con.close()