package ch02Test;

import java.util.Scanner;

/* 입력된 정수 값의 부호를 판정해서 양정수/음정수/0 인지 표시하는 프로그램 작성
 * 프로그램을 원하는 만큼 반복하여 처리하는 내용 포함
 * 1: 프로그램 계속, 0: 프로그램 종료 */

/* 1) 키보드 입력을 받기 위한 인스턴스 생성
 * 2) 키보드 입력 값을 정수로 처리
 * 3) 반복 처리를 위한 반복문(최소 한 번은 실행) --> do~while()문
 * 4) 조건문: 입력된 값이 0보다 크면/작으면/0이면 --> 양정수/음정수/0
 * 5) 프로그램 계속(1)/종료(0) 추가 --> 저장할 변수 선언
 * 6) 반복문 종료 조건(0) --> 프로그램 종료(break;)
 * */
public class TestEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스 생성 = 인스턴스 생성
		Scanner stdIn = new Scanner (System.in);
		int re = 0;  // 프로그램 종료(0), 계속(1)을 저장하는 변수 선언
		int cnt = 0; // 프로그램 반복 처리 횟수를 저장하기 위한 변수 선언
		do { // do~while()문은 최소한 한번은 무조건 실행
			System.out.print("정수를 입력하세요: ");
			int n = stdIn.nextInt();
			if (n > 0) {
				System.out.println("입력된 값 " + n +"은  양정수 입니다.");
			} else if (n < 0) {
				System.out.println("입력된 값 " + n +"은  음정수 입니다.");
			} else {
				System.out.println("입력된 값은  0 입니다.");
			}
			System.out.print("프로그램 (계속:1/종료:0): ");
			re = stdIn.nextInt();
			cnt++;
		} while(re == 1);
		System.out.println("프로그램은 "+ cnt +"번 반복");
	}
}
