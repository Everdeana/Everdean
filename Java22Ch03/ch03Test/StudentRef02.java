package ch03Test;

import java.util.Scanner;

/*	학생 성적 처리 프로그램
 * 	 1. 교과명 키보드로 입력
 * 	 2. 성적 키보드 입력
 * 	 3. 총점 계산
 * 	 4. 평균 계산
 * 	 5. 교과목과 해당 점수 출력
 * 	 6. 총점과 평균 출력 */

public class StudentRef02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String course[] = {"Java", "Python", "C Language"};
		// int score[] = {90, 89, 88};
		// Scanner stdNum = new Scanner(System.in); // 과목 수 입력
		// System.out.print("과목 수 입력: ");
		// int n = stdNum.nextInt();
		
		Scanner stdIn = new Scanner(System.in); // 점수 키보드 입력
		Scanner stdCh = new Scanner(System.in); // 과목 키보드 입력
		
		int n = 3;
		int[] score = new int[n]; // 참조형 score 배열 선언
		String[] course = new String[n]; // 참조형 score 배열 선언
		
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "번째 과목명: ");
			course[i] = stdCh.nextLine(); // 배열 타입에 점수 키보드 입력
			System.out.print((i + 1) + "번째 과목 " + course[i] +"의 점수: ");
			score[i] = stdIn.nextInt(); // 배열 타입에 점수 키보드 입력
		}
		
		int total = 0;
		float average = 0; // float = 4byte
		
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + "번째 과목 " + course[i] +"의 점수: " + score[i]);
			total = total + score[i];
		}

		System.out.println(n + "과목의 총점은 = " + total);
		average = total / n;
		System.out.println(n + "과목의 평균은 = " + average);
	}
}
