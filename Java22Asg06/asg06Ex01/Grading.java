package asg06Ex01;

import java.util.Scanner; // java의 util 패키지에서 Scanner 라이브러리 호출

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner 클래스를 사용하기 위해 변수 선언(같은 Scanner Type으로 선언)
		Scanner input = new Scanner(System.in); // 점수 입력 받을 변수 선언
		// 프로그램 실행 여부 결정하는 문자 입력받을 변수 선언
		Scanner stdIn = new Scanner(System.in); 
		char key; // 입력 받은 문자를 저장하는 변수 선언
		char grade; // 입력 받은 점수에 해당하는 학점을 저장할 변수 선언
		do { // do~while()문은 최소한 한 번은 무조건 실행
			System.out.print("점수를 입력하세요: ");
			int score = input.nextInt(); // int 형으로 점수 입력받는다.
			
			if(score >= 90) {
				grade = 'A';
			} else if (score >= 80) {
				grade = 'B';
			} else if (score >= 70) {
				grade = 'C';
			} else if (score >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			System.out.println("학점은 " + grade + "입니다.");
			while(true) { // while문을 활용하여 q 또는 y만 입력받도록 한다.
				System.out.print("계속 입력하시겠습니까?(y/q): ");
				key = stdIn.next().charAt(0); 
				// next().charAt(0)을 사용하여 처음 입력된 문자만 입력받는다.
				System.out.println("입력된 문자: \"" + key + "\"");
				if(key == 'q' || key == 'Q' || key == 'y' || key == 'Y') {
					// re가 0 또는 1이면
					break; // while문 종료 후 do~while문으로 돌아간다.
				} else { // 0 또는 1이 아닌 경우 계속 반복하여 입력받도록 한다.
					System.out.println("y 또는 q만 입력해 주세요");
				}
			}
		} while(key == 'y' || key == 'Y'); 
		// 입력받은 key가 y면 계속 반복 --> y가 아니면 반복문 종료
		System.out.println("프로그램을 종료합니다.");
	}
}
