a, b, c, d = 0, 0, 0, 0
sum = 0

''' a = input("1번째 정수 입력:")
    b = input("2번째 정수 입력:")
    c = input("3번째 정수 입력:")
    d = input("4번째 정수 입력:") ''' # str type
    
a = int(input("1번째 정수 입력:")) # int 형으로 변환
b = int(input("2번째 정수 입력:"))
c = int(input("3번째 정수 입력:"))
d = int(input("4번째 정수 입력:"))

sum = a +  b + c + d

# print(a)
# print(type(a))

print("총합==> %d" %sum)