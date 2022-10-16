package asg06Ex02;

import java.util.Scanner; // java.util 패키지의 Scanner 호출

// 키보드로 두 인수를 입력받아 더하기 연산 수행 프로그램 작성
public class ClassAdd {
	// 두 개의 정수를 입력 받아 더하기 연산을 수행하는 프로그램 작성
	// 필드 선언
	int result;
	// 생성자
	// 메서드
	int plus(int n1, int n2) { // 덧셈 연산 메서드 선언
		result = n1 + n2;
		return (result);
	}
	int minus(int n1, int n2) { // 뺄셈 연산 메서드 선언
		result = n1 - n2;
		return (result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int add1, add2;
		ClassAdd Add1, Add2;// 클래스 타입 변수 선언 --> ClassAdd(데이터 타입=Class) 변수
		Add1 = new ClassAdd(); // 클래스를 생성시켜서 초기화시킴 --> 서로 같은 타입으로 맞춰줌
		Add2 = new ClassAdd(); 
		
		// Scanner 클래스를 사용하여 두 수를 입력받는다.
		Scanner stdIn = new Scanner(System.in); 
		System.out.print("첫 번째 정수 입력:");
		// Scanner 객체인 stdIn의 nextInt() 메서드를 이용하여 정수를 입력받는다.
		int n1 = stdIn.nextInt(); 
		System.out.print("두 번째 정수 입력:");
		int n2 = stdIn.nextInt();
		
		add1 = Add1.plus(n1, n2); // 생성된 메서드를 호출한다. 
		add2 = Add2.minus(n1, n2);
		System.out.println("두 수의 덧셈 결과는 " + add1 + "입니다.");
		System.out.println("두 수의 뺄셈 결과는 " + add2 + "입니다.");
	}

}
