# list 타입
# c언어 에서의 배열 --> python: list, tuple, dictionary

numbers = [5, 15, 20, 7, 18, 12]

print(type(numbers))

# print(numbers[0])

for number in numbers:
    # print(number)
    if number < 10:
        continue # 종료가    아니라 처음으로 돌아감
    # continue 문을 만나면 반복문의 처음으로 다시 돌아감
    # break 문은 반복문을 종료할 때 사용하는 구문
    # while 문은 조건식을 기준으로 특정 코드를 반복해서 실행할 때 사용
    print(number)

