import datetime

now = datetime.datetome.now()

# 시간을 오전, 어후로 구분 처리

if now.hour < 12:
    print("현재 시간은 {}시로 오전입니다.".format(now.hour))

if now.hour >= 12:
    print("현재 시간은 {}시로 오후입니다.".format(now.hour))
