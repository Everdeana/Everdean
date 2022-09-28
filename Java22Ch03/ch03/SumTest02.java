package ch03;

import java.util.Scanner;

/* 배열 a가 가진 모슨 요소의 합을 구하는 프로그램 작성
 * 	1) main()메서드에서 모든 요소의 수를 읽어서 배열 생성
 * 	2) 각 요소의 값을 읽음
 * 	3) 요소의 합을 구하는 메서드(sumOf())를 생성
 * 	4) 생성된 sumOf()메서드를 호출
 * 	5) 입력한 배열의 요소의 합계를 계산
 * 	6) 메인 메서드로 반환한다. */

public class SumTest02 {
	public static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];	
		}
		System.out.println("배열의 합은" + sum + "입니다.");
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("배열의 요소 수 입력:");
		int num = stdIn.nextInt(); // 키보드로 입력된 배열의 요소 수 저장
		int[] x = new int[num]; // 입력된 배열 요소의 수에 대한 배열 선언
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]=");
			x[i] = stdIn.nextInt();
		}
		System.out.println("배열의 모든 요소의 합은" + sumOf(x) + "입니다.");
	}

}
