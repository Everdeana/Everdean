package ch02Test;

import java.util.Scanner;

// 두 개의 실수를 입력받아(외부입력 처리) 큰 값을 표시하는 프로그램 작성

public class TestEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in); // 인스턴스 선언
		System.out.print("첫 번쨰 실수 입력: ");
		double x = stdIn.nextDouble();
		System.out.print("두 번쨰 실수 입력: ");
		double y = stdIn.nextDouble();
		double max; // 입력된 두 실수 값 중 큰 값을 저장하는 변수 선언
		
		if(x > y) {
			max = x;
		} else {
			max = y;
		}
		System.out.println("큰 값은 " + max + " 입니다.");
	}

}
