# 외부 입력 처리함수: input()

# a = input()
# b = input()
# result = a + b
# print(a, "+", b, "=", result)
# print(type(a))
# print(type(result))
# 문자열로 처리됨 --> ex) a = 1, b = 2 --> result = 12
# 아래와 같이 int형으로 선언

a = int(input("첫번째 정수를 입력하세요:"))
b = int(input("두번째 정수를 입력하세요:"))
result = a + b
print(a, "+", b, "=", result)
print(type(a))
print(type(result))
string_a = "{}".format(50) # 숫자를 문자열로 처리
print(string_a)
print(type(string_a))
