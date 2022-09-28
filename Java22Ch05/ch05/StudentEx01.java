package ch05;

import java.util.Scanner;

//학생 성적관리 프로그램
// 1. 학생 성적 입력(키보드)
// 2. 교과목 입력(키보드)
// 3. 총점/ 평균 계산
// 4. 최고점/ 최저점 계산 처

public class StudentEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.in.read();
		// Scanner stdIn = new Scanner(System.in); 인스턴스 생성
		Scanner stdIn = new Scanner(System.in); //성적입력
		Scanner stdCh = new Scanner(System.in); //교과목 입력
		// Scanner n = new Scanner(System.in);
		// System.out.print("학생 수 입력:");
		// int n = stdN.nextInt();
		int n = 3;
		int total = 0;
		int[] score = new int[3]; // 입력 교과목 수 배열(참조형) 선언
		
		for(int i=0; i<n; i++) {
			System.out.print((i+1)+"번째 점수=");
			score[i] = stdIn.nextInt(); 
		}
		String[] course = new String[n]; //입력 교과목 수 배열 선언
		for(int i=0; i<n; i++) {
			System.out.print((i+1)+"번째 교과목=");
			course[i] = stdCh.next(); 
			
		}
		// 입력된 성적의 총점 계산 처리문
		for(int i=0; i<n; i++) {
			System.out.println(course[i]+"=" + score[i]);
			total = total + score[i];
		}
		System.out.println("총점 결과=" +total);
		double average = total / (double)n;
		System.out.println("평균 결과=" + average);
		// 최고 점수 저장, 최저 점수 저장
		int max = score[0]; // 최고 점수라고 가정
		int min = score[0]; // 최저 점수라고 가정
		for(int i=1; i<n; i++) {
			if(score[i] > max) max = score[i];
			if(score[i] > min) min = score[i];
			
		}
		System.out.println("최고점수=" + max);
		System.out.println("최저점수=" + min);
	}
}
