# 키보드로 입력된 값이 양정수(자연수) 인지 아닌지 

# 처리하는 프로그램 작성 

number = input("정수를 입력하세요")

print(type(number))

number = int(number)

#양정수 조건 

#제어문(조건문), 연산자(비교연산자)

if number > 0:

    print("양정수입니다.")

if number < 0:

    print("음정수입니다.")

if number == 0:

    print("입력된 값은 0 입니다.")

print(type(number))