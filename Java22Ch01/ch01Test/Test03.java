package ch01Test;

import java.util.Scanner;

/*	키보드 입력한 정수 값이 5로 나누어지면 "이 값을 5로 나누어집니다." 출력되고
 * 	입력한 정수값이 5로 나누어지지 않으면 "이 값을 5로 나누어지지 않습니다." 출력 
 * 	 - 키보드 입력(외부입력) 받기 위한 준비
 * 	 - 입력된 값을 저장하기 위한 객체 변수 선언
 * 	 - 조건문에 의해 5로 나누어질 경우, 그렇지 않을 경우 구문 생성
 * 	 - 결과 출력
 * */
public class Test03 {
	/*
	// 객체(Class)의 구성 = 메서드(Method) + 속성(Property):필드(Field)
	
	// int x = 3; // main method는 static인데 변수는 static이 아니므로 오류 발생
	static int x = 3; // Test03 Class 안의 Property
	public static void main(String[] args) {
		System.out.println(x + "출력입니다.");
	} */
	
	public static void main(String[] args) {
		System.out.print("정수를 입력하세요: ");
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		if (n > 0) {
			if (n % 5 == 0) {
				System.out.println("입력된 값" + n + "은 5로 나누어집니다.");
				
			} else {
				System.out.println("입력된 값" + n + "은 5로 나누어지지 않습니다.");
			}
		} else {
			System.out.println("입력된 값" + n + "은 음수로 입력되었습니다.");
		}
	}
	
}
