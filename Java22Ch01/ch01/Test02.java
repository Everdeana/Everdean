package ch01;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 외부 입력을 받기 위한 객체(변수) 클래스 선언
		Scanner stdIn = new Scanner(System.in); // Scanner라고 하는 클래스 타입으로 선언 --> 양쪽의 type이 같도록 선언
		System.out.print("정수값을 입력하세요: ");
		int x = stdIn.nextInt() + 100;
		System.out.println("입력한 정수는" + x + "입니다.");
		
	}

}
