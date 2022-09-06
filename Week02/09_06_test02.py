#현재 날짜/시간을 출력하는 프로그램

import datetime

now = datetime.datetime.now()

print(now.year, "년도")
print(now.month, "월")
print(now.day, "일")
print(now.hour, "시")
print(now.minute, "분")
print(now.second, "초")