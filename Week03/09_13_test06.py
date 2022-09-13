# list, tuple, dictionary, in 연산자, range(), eval(), .format
# print("%d" %num)
# 계산기 프로그램 작성
# 조건1: 수식까지 입력해 계산하는 기능 추가
# 조건2: 입력뒨 수 사이의 합을 계산하는 기능 추가
#   ex) 1, 10 ==> 1 + 2 + 3 + ... + 10 = 55

# 1. 입력한 수식 계산
# 2. 두 수 간의 누적 합 계산
answer, numStr, num1, num2 = 0, "", 0, 0
select = 0 # 1 or 2 계산 방법 선택 값을 저장하는 변수 선언
# print(type(answer))
# print(answer)
print("계산 방법을 선택하세요")
select = int(input("1. 입력한 수식 계산\n2. 두 수 간의 누적 합 계산\n===>"))
if select == 1:
    numStr = input("==수식을 입력하세요==\n")
    answer = eval(numStr) # evaluaion -->  # 수식 연산지원 메서드
    print("%s 결과는 %5.1f입니다." %(numStr, answer))
    
elif select == 2:
    num1 = int(input("첫번째 정수를 입력하세요:"))
    num2 = int(input("두번째 정수를 입력하세요:"))
    for i in range(num1, num2 + 1):
        answer = answer + i
        # print("%d + ---- + %d는 %d 입니다." %(num1, num2, answer)) --> 여러번 찍힘
    print("%d + ---- + %d는 %d 입니다." %(num1, num2, answer))
    
else:
    print("연산방법은 1 또는 2 만 선택해야 합니다.")
    
# numStr = input("==수식을 입력하세요==\n")
# answer = eval(numStr) # evaluaion -->  # 수식 연산지원 메서드
# print("%s 결과는 %5.1f입니다." %(numStr, answer))
