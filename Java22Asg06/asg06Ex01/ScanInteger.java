package asg06Ex01;

import java.util.Scanner; // java의 util 패키지에서 Scanner 라이브러리 호출

public class ScanInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드와 연결된 표준 입력 스트림(System.in)
		Scanner stdIn = new Scanner(System.in); // 타입을 Scanner 타입으로 똑같이 맞춰준다. 
		
		System.out.print("정수값을 입력하시오 ->");
		// 키보드를 통해 입력한 정수값을 받는다.
		// 키보드를 통해 double형인 실수값을 입력받을 때 nextDouble()
		int x = stdIn.nextInt(); // 입력 받은 값을 Enter 입력하는 순간 itn 형으로 저장함
		System.out.println(x + "를 입력했습니다.");

	}

}
