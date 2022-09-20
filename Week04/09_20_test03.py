# 원소의 개수가 비어있는 리스트 선언
aa = []
# 리스트의 원소 수(4개)

# print("-----case1-----")
for i in range(0, 4):
    aa.append (0) # append로 추가한다
    
# print("-----case2-----")    
sum = 0
for i in range(0, 4):
    aa[i] = int(input(str(i + 1) + "번째 정수:"))
    print(aa[i])
    print(type(aa[i]))

# print("-----case3-----")    
sum = aa[0] + aa[1] + aa[2] + aa[3]        
print("결과값=%d" %sum)
