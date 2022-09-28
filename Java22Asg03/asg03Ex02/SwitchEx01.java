package asg03Ex02;

public class SwitchEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = (int)(Math.random() * 4) + 8;
		// Math.random() * (정수의 개수) + (시작하는 수) ==> 8에서 11(정수의 개수 = 4개) 사이의 난수 반환
		System.out.println("[현재시간: " + time + " 시]");
		
		switch (time) { // break문이 없는 경우 해당하는 case 값 아래의 모든 문장이 실행된다.
		case 8:
			System.out.println("출근합니다.");
			break; // break문으로 불럭을 빠져나와야 원하는 곳에서 멈출 수 있다.
		case 9:
			System.out.println("회의를 합니다.");
			break;
		case 10:
			System.out.println("업무를 봅니다.");
			break;
		default:
			System.out.println("외근을 나갑니다.");
			break;
		}
	}

}
