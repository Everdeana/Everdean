package asg06Ex01;

import java.util.Scanner; // java의 util 패키지에서 Scanner 라이브러리 호출

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		// Scanner 클래스를 사용하기 위해 변수 선언(같은 Scanner Type으로 선언)
		
		System.out.println("두 개의 정수를 입력하시오.");
		System.out.print("1번째 정수: ");
		int i = keyboard.nextInt(); // 키보드로 입력된 int값을 반환한다.
		System.out.print("2번째 정수: ");
		int j = keyboard.nextInt();
		System.out.println("두 수의 곱은 = " + (i * j)); // 두 수의 곱 출력
		
		System.out.println("두 개의  실수를 입력하시오.");
		System.out.print("1번째 실수: ");
		double x = keyboard.nextDouble(); // 키보드로 입력된 double값을 반환한다.
		System.out.print("2번째 실수: ");
		double y = keyboard.nextDouble();
		System.out.println("두 수의 합은 = " + (x + y)); // 두 수의 합 출력
		
		System.out.println("두 개의 단어를 입력하시오.");
		System.out.print("1번째 단어: ");
		String str1 = keyboard.next(); // 공백문자는 포함시키지 않고 String을 반환함
		System.out.print("2번째 단어: ");
		String str2 = keyboard.next();
		System.out.println(str2 + " of " + str1); // str1/str2에 저장된 String 출력

	}

}
