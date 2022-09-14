package ch03Test;

import java.util.Scanner;

/* 1부터 n까지 정수의 합을 구하는 프로그램 작성
 * -> 단. 정수의 합을 구하는 메서드를 별도 작성하여 반환처리
 *  1) 키보드 입력 : n 값
 *  2) 1 ~ 키보드로 입력 n 까지의 합을 계산 처리
 *  3) 누적 합 계산 처리
 *  4) 반복문 (for문)
 *  5) 누적합 표현식
 *  6) 합을 저장한 다음 메인 메서드로 반환 */

public class SumTest01 {
	/* 정수의 합을 계산하여 반환 처리하는 메서드 선언  */ 
	public static int sumUp(int x) { // Default = Public
		int sum = 0;
		for(int i = 1; i <= x; i++) {
			sum = sum + i; // sum += i;
		}
		System.out.println("sum=" + sum + "입니다.");
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 계산하는 프로그램.");
		
		int n; // n = stdIn.nextInt();
		do {
			System.out.println("정수n 값 입력");
			n = stdIn.nextInt();
		} while (n <= 0);
		System.out.println("1부터" + n + "까지의 합은" + sumUp(n) + "입니다.");
	}
}
