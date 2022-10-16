package asg06Ex01;

import java.util.Scanner; // java의 util 패키지에서 Scanner 라이브러리 호출

public class ConditionOperationEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		// Scanner 클래스를 사용하기 위해 변수 선언(같은 Scanner Type으로 선언)
		char grade; // 점수에 맞는 학점을 출력하기 위해 학점 저장 변수 선언
		System.out.print("점수를 입력하세요: ");
		int score = stdIn.nextInt(); // int로 점수를 입력받는다.
		if (score >= 90) {
			grade = 'A';
		} else if (score > 80) {
			grade = 'B';
		} else {
			grade = 'C';
		}
		System.out.println(score + "점은 " + grade + " 등급입니다.");

	}

}

/*	<< 아래 예제를 키보드 입력 기능과 if ~ else 문으로 수정하여 위와 같이 작성 >>
 * 
 * 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은" + grade + "등급입니다.");

	}

} */
