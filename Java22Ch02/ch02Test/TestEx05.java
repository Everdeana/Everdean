package ch02Test;
/* 1) 키보드 문자 입력 받는다.
 * 2) 계속 입력 받는다.
 * 3) 언제 까지 --> q 문자를 입력받으면
 * 4) 프로그램 stop */
import java.util.Scanner;

public class TestEx05 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Scanner 클래스를 사용하기 위해 변수 선언(같은 Scanner Type으로 선언)
		Scanner stdIn = new Scanner(System.in); 
		String inputKey; // 압력 받은 문자를 저장하는 변수 선언
		
		while(true) {
			System.out.print("문자 입력: ");
			inputKey = stdIn.nextLine(); // nextLine 메서드를 사용하여 문자를 입력받는다.
			System.out.println("입력된 문자: \"" + inputKey + "\"");
			if(inputKey.equals("q")) { // .equals를 활용하여 문자를 비교한다.
				System.out.print("문자 q 입력시 종료 ");
				break; // 위 if문의 조건에 부합한다면 while 반복문을 종료시킨다.
			}
		}
	}
}
