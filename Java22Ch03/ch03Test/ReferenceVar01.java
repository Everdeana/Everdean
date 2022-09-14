package ch03Test;
/*	데이터의 기본 타입: int, long, double, float, char,
 * 				  byte, Boolean
 * 	메서드와 관련: void, return
 * 	객체와 관련: new, instanceof()
 * 	클래스와 메서드 접근제어자: public, private, protected
 * 	클래스와 관련: class
 * 	제어문, 조건문: if, else, if ~ else, switch, case
 * 	반복문: do ~ while, while, for
 * 	분기문: break, continue
 * 	예외처리문: try ~ catch, throws Exception
 * 	오픈 클래스와 연결: import */


import java.util.Scanner;

public class ReferenceVar01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java Programming";
		/*	String 자료헝이 아니다.
		 * 	문자열 "Java Programming"을 저장하고 있는
		 * 	인스턴스의 주소값을 저장 */
		 Scanner stdIn = new Scanner(System.in);
		 int n = stdIn.nextInt();
		 int[] a = new int[n];
		 System.out.println(str);
	}
}
