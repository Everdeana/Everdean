package asg03Ex02;

import java.util.Scanner; // java의 util 패키지에서 Scanner 라이브러리 호출

public class SwitchEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char key; // 압력 받은 문자를 저장하는 변수 선언
		
		do { // do~while()문은 최소한 한 번은 무조건 실행
			System.out.print("학점을 문자로 입력하세요: ");
			char grade = input.next().charAt(0); 
			// next().charAt(0)을 사용하여 처음 입력된 문자만 입력받는다.
			double gPoints = 0; // 실수 형태로 학점을 저장할 변수를 선언한다.
			
			switch (grade) {
			case 'A': case'a': // case의 'UC', 'LC'가 입력될 경우
				gPoints = 4.0; // 해당하는 실수 출력
				break; // switch문 탈출
			case 'B': case'b':
				gPoints = 3.0;
				break;
			case 'C': case'c':
				gPoints = 2.0;
				break;
			case 'D': case'd':
				gPoints = 1.0;
				break;
			case 'F': case'f':
				gPoints = 0.0;
				break;
			default: // 위의 값이 모두 아닐 때 
				System.out.println("잘못된 학점입니다.");
				break;
			}
			System.out.println("평점= " + gPoints);
			while(true) { // while문을 활용하여 q 또는 y만 입력받도록 한다.
				System.out.print("계속 입력하시겠습니까?(y/q): ");
				Scanner stdIn = new Scanner(System.in);
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
