package asg03Ex02;

import java.util.Scanner;

public class IfElseEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int score = stdIn.nextInt();
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}
	}

}
/*	<< 아래 예제를 키보드 입력 기능과 if ~ else 문으로 수정하여 위와 같이 작성 >>
 * 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}
	} */