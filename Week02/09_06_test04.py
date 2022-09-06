import datetime

now = datetime.datetime.now()

if now.month == 12 or now.month < 3:
    print("이번 달은 {}월로 겨울 입니다.".format(now.month))
    
if 2 < now.month < 6:
    print("이번 달은 {}월로 봄 입니다.".format(now.month))
    
if 5 < now.month < 9:
    print("이번 달은 {}월로 여름 입니다.".format(now.month))
    
if 8 < now.month < 12:
    print("이번 달은 {}월로 가을 입니다.".format(now.month))