# 문자열 연신자로 짝수와  홀수를 처리하는 프로그램 

number = input("정수를 입력하세요: ")

last_character = number[-1]

# 짝수처리

if last_character in "02468":
    print("짝수입니다.")
    
if last_character in "13579":
    print("홀수입니다.")