package ch03Test;

import java.util.Scanner;

/*	참조형 차입: 배열, 클래스, 인터페이스, 열거형
 * 	참조형은 데이터 저장장소의 주소를 기억하고 있다. */
public class StudentRef01 {
	// 학생 성적 관리 프로그램 작성
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course[] = {"Java", "Python", "C Language"};
		Scanner stdIn = new Scanner(System.in);
		int n = 3; // 기본형 자료형 타입 선언
		int[] score = new int[n]; // 참조형 배열 타입 선언
		for (int i = 0; i < n; i++) { // 성적 입력 처리
			System.out.print((i + 1) + "번째 과목 " + course[i] + "의 점수 = ");
			score[i] = stdIn.nextInt(); // 배열 타입에 점수 키보드 입력
		}
		// 입력된 성적의 총점과 평균의 계산처리
		int total = 0;
		float average = 0; // float = 4byte
		for (int i = 0; i < n; i++) {
			System.out.println(course[i] + ":" + score[i]);
			total = total + score[i];
		}
		System.out.println("총점 결과는 = " + total);
		average = total / n;
		System.out.println(n + "과목의 평균은 = " + average);
	}
}
