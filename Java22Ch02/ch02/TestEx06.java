package ch02;

import java.util.Scanner;

/* 입력된 두 개의 값 중 큰 값을 처리하는 프로그램
 * --> 삼항연산자를 사용 */

public class TestEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드 입력을 처리하기 위한 인스턴스(객체) 생성
		Scanner stdIn = new Scanner(System.in);
		System.out.println("실수 x값 입력: ");
		double x = stdIn.nextDouble();
		System.out.println("실수 y값 입력: ");
		double y = stdIn.nextDouble();
		double max = x > y ? x: y; // 삼항연산자: 조건 ? 참: 거짓
		System.out.println("큰 값은 " + max + " 입니다.");
	}

}
