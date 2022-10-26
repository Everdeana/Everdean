package exam03;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner stdIn = new Scanner(System.in); // 번호 키보드 입력
		Scanner stdIn1 = new Scanner(System.in); // 점수 키보드 입력
		Scanner stdIn2 = new Scanner(System.in); // 과목 키보드 입력
		Scanner stdIn3 = new Scanner(System.in); // 학생 수 키보드 입력
		int stdnum = 0;
		int[] score = new int[stdnum]; // 참조형 score 배열 선언
		String[] course = new String[stdnum]; // 참조형 score 배열 선언
		
		System.out.println("---------------------------------------------------");
		System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
		System.out.println("---------------------------------------------------");
		System.out.println("선택>");
		int processN = stdIn1.nextInt();
		
		switch (processN) {
		case 1:
			System.out.println("학생수>");
			stdnum = stdIn3.nextInt();
			
			break;
		case 2:
			for (int i = 0; i < stdnum; i++) {
				System.out.print((i + 1) + "번째 과목명: ");
				course[i] = stdIn1.nextLine(); // 배열 타입에 점수 키보드 입력
				System.out.print((i + 1) + "번째 과목 " + course[i] +"의 점수: ");
				score[i] = stdIn1.nextInt(); // 배열 타입에 점수 키보드 입력
			}
			break;
		case 3:
			for (int i = 0; i < stdnum; i++) {
				System.out.print((i + 1) + "번째 과목명: ");
				System.out.print((i + 1) + "번째 과목 " + course[i] +"의 점수: ");
			}
			break;
		case 4:
			int total = 0;
			float average = 0; // float = 4byte
			
			for (int i = 0; i < stdnum; i++) {
				System.out.println((i + 1) + "번째 과목 " + course[i] +"의 점수: " + score[i]);
				total = total + score[i];
			}
			System.out.println(stdnum + "과목의 총점은 = " + total);
			average = total / stdnum;
			System.out.println(stdnum + "과목의 평균은 = " + average);
			break;
		case 5:
			
			break;

		default:
			break;
		}
	}
}
