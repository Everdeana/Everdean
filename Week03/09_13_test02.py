i = 0

while True:
    print("{}번째 반복문입니다.".format(i))
    i = i + 1
    
    input_text = input(">프포그램 종료하시겠습니까?(y):")
    if input_text in ["y", "Y"]:
        print("프로그램을 종료합니다.")
        break

