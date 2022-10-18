# 데이터베이스에 저장된 자료를 읽어 오는 프로그램
 
import sqlite3
# con = None
# cur = None
con, cur = None, None # con = sqlite.connection(), cur = con.cursor()
data1, data2, data3, data4 = "", "", "", ""
row = None
# con, cur 재정의
con = sqlite3.connect("ndb.db")
cur = con.cursor()
cur.execute("select * from Test")
print("사용자ID     사용자이름      이메일      가입년도")
print("-------------------------------------------------")
while(True):
    row = cur.fetchone()
    if row == None:
        break;
    data1 = row[0]
    data2 = row[1]
    data3 = row[2]
    data4 = row[3]
    print("%5s %10s %15s %10d" %(data1, data2, data3, data4))
   
con.close