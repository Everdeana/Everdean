package asg03Ex02;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// java library의  Math 클래스에서 random 함수를 가져와서 난수를 반환한다. 
		int num = (int)(Math.random() * 6) + 1; 
		// Math.random() * (정수의 개수) + (시작하는 수) ==> 1에서 6 사이의 난수 반환
		switch(num) {
		case 1: // 1일 경우
			System.out.println("1번이 나왔습니다.");
			break; // switch문 탈출
		case 2: // 2일 경우
			System.out.println("2번이 나왔습니다.");
			break; // switch문 탈출
		case 3: // 3일 경우
			System.out.println("3번이 나왔습니다.");
			break; // switch문 탈출
		case 4: // 4일 경우
			System.out.println("4번이 나왔습니다.");
			break; // switch문 탈출
		case 5: // 5일 경우
			System.out.println("5번이 나왔습니다.");
			break; // switch문 탈출
		default: // 모두 아닐 경우
			System.out.println("6번이 나왔습니다.");
			break; // switch문 탈출
		}
	}

}
