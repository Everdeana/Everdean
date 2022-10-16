package asg06Ex02;

import java.util.Scanner; // java.util 패키지의 Scanner 호출

import asg06Ex02.Calculator;

// 키보드로 두 인수와 연산자를 입력받아 사칙 연산을 수행하는 프로그램 작성
public class Class_Calculator {
	// 두 개의 정수를 입력 받아 더하기 연산을 수행하는 프로그램 작성
	// 필드 선언
	int result;
	// 생성자
	// 메서드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double res = 0; // 계산 결과를 저장할 변수 선언
		Calculator myCalc = new Calculator();
		char iv; // 프로그램 실행/종료 결정하는 문자를 저장할 변수 선언
		// 연산자를 입력받을 때 사용할 Sccanner 타입 변수 선언
        Scanner op = new Scanner(System.in); 
        char operator; // 입력받은 연산자를 저장할 변수 선언
		do {
			// Scanner 클래스를 사용하여 두 수를 입력받는다.
			Scanner stdIn = new Scanner(System.in); 
			System.out.print("첫 번째 정수 입력:");
			// Scanner 객체인 stdIn의 nextInt() 메서드를 이용하여 정수를 입력받는다.
			int n1 = stdIn.nextInt(); 
			System.out.print("두 번째 정수 입력:");
			int n2 = stdIn.nextInt();
			// 만약 정해진 연산자 외에 다른 연산자가 입력되었다면 다시 입력받도록 한다.
			while(true) {  
				System.out.print("처리할 연산자를 입력하세요(+, -, *, /, %): ");
				/* Scanner 객체인 op의 next() 메서드를 이용하여 
				 * 연산자(문자)를 입력받는다.*/
				// 입력한 문자 중 제일 첫 번째 문자만 가져옴
				operator = op.next().charAt(0); 
				if(operator == '+') {
					// Calculator 클래스의 메서드를 호출한다.
					res = myCalc.plus(n1, n2); 
					break; }
		        else if(operator == '-') { 
		        	res = myCalc.minus(n1, n2);
		        	break; }	
		        else if(operator == '*') {
		        	res = myCalc.multiplication(n1, n2);
					break; }
		        else if(operator == '/') {
		        	res = myCalc.divide(n1, n2);
					break; }
		        else if(operator == '%') {
		        	res = myCalc.remainder(n1, n2);
					break; }
		        else { System.out.println("연산자만 입력하세요!!!"); }
			}
			
			System.out.println("두 수의 계산 결과는 " + res + "입니다.");
			while(true){ // while문을 활용하여 1 또는 0만 입력받도록 한다. 
				System.out.print("프로그램을 종료하시겠습니까?(y/n): ");
				iv = stdIn.next().charAt(0); // 입력받은 문자를 iv에 저장
				if(iv == 'y' || iv == 'n' || iv == 'Y' || iv == 'N') { 
					break; 
					// iv가 y 또는 n이면 do~while문으로 돌아간다.
				} else { // y 또는 n이 아닌 경우 계속 반복하여 입력받도록 한다.
					System.out.println("y 또는 n만 입력해 주세요");
				}
			}
		} while(iv == 'n' || iv == 'N'); // n이나 N이 입력되면 계속 반복
		System.out.println("프로그램 종료");
	}
}