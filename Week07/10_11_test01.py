import sqlite3
import csv

# print(sqlite3.sqlite_version)
 
con = sqlite3.connect('./my_data.db')
# print(type(con))
cursor = con.cursor()
''' sql = "create table Course (Course_ID int primary key not null, Course_Name text, Course_Date date);"
ccursor.execute(sql)
sql = "insert into Course values(1, 'PythonData', '2022-10-11');"
cursor.execute(sql)
sql = "insert into Course values(2, 'DataAnalysis', '2022-10-12');"
cursor.execute(sql)
sql = "insert into Course values(3, 'Python Basic', '2022-10-13');"
cursor.execute(sql)
sql = "insert into Course values(4, 'WebCrawling', '2022-10-14');"
cursor.execute(sql)
con.commit() '''

''' <In CMD>
sqlite> .header on
sqlite> .mode column '''
    
'''sql = "select * from Course;"
cursor.execute(sql)
print(cursor.fetchall())
con.close() '''

''' <In CMD>
sqlite> .mode csv
sqlite> .import csv/singer1.csv tab1
sqlite> .header on
sqlite> .mode csv
sqlite> .once csv/sin1.csv
sqlite> select * from tab1;
sqlite> .tables
Course  tab1
sqlite> select * from tab1;
"아이디","이름","인원","주소","국번","전화 번호","평균 키","데뷔 일자"
TWC,"트와이스",9,"서울",02,11111111,167,2015.10.19
BLK,"블랙핑크",4,"경남",055,22222222,163,2016.08.08
WMN,"여자친구",6,"경기",031,33333333,166,2015.01.15
OMY,"오마이걸",7,"서울","","",160,2015.04.21
GRL,"소녀시대",8,"서울",02,44444444,168,2007.08.02
ITZ,"있지",5,"경남","","",167,2019.02.12
RED,"레드벨벳",4,"경북",054,55555555,161,2014.08.01
APN,"에이핑크",6,"경기",031,77777777,164,2011.02.10
SPC,"우주소녀",13,"서울",02,88888888,162,2016.02.25
MMU,"마마무",4,"전남",061,99999999,165,2014.06.19
sqlite>
''' 
sql = "select * from tab2;"
cursor.execute(sql)
print(cursor.fetchall())