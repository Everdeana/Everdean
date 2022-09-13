i = 0
while True:
    print("성적처리 프로그램입니다.")
    score = (input("성적을 입력하세요:"));
    score = int(score)
    print(type(score))
    
    print("{}번째 반복문입니다.".format(i))
    i = i + 1
    
    if score >= 90:
        print("등급은 A입니다.")
    elif score >= 80:
        print("등급은 B입니다.")
    elif score >= 70:
        print("등급은 C입니다.")
    elif score >= 60:
        print("등급은 D입니다.")
    else:
        print("등급은 F입니다.")

    print("{}는 위 학점으로 처리됩니다.".format(score))
    input_text = input(">프포그램 종료하시겠습니까?(y):")
    if input_text in ["y", "Y"]:
        print("프로그램을 종료합니다.")
        break
