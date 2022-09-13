# 짝수 홀수 수분 프로그램 작성

i = 0
while True:
    print("짝수, 홀수 처리 프로그램입니다.")
    number = int(input("정수를 입력하세요:"))
    print(type(number))
    
    print("{}번째 반복문입니다.".format(i))
    i = i + 1
    
    if number % 2 == 0:
        print("입력한 값은 {}입니다.\n{}은 짝수입니다.".format(number, number))
    else:
        print("입력한 값은 {}입니다.\n{}은 홀수입니다.".format(number, number))
    
    input_text = input(">프포그램 종료하시겠습니까?(y/n):")
    if input_text in ["y", "Y"]:
        print("프로그램을 종료합니다.")
        break
