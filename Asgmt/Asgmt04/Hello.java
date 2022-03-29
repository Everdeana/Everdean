package Asgmt04;

public class Hello {
	
	public static int sum(int n, int m) {
		return n + m;
	}

	public static void main(String[] args) { // 클래스를 실행하기 위한 Main Method
		// TODO Auto-generated method stub
		int i = 20; // 정수형 변수 선언
		int s; 
		char a;
		
		s=sum(i, 10); // sum() Method 호출 
		a = '?';
		System.out.println(a); // 문자 '?' 화면 출력
		System.out.println("Hello"); // "Hello" 문자열 화면 출력
		System.out.println(s); // 정수 s값 화면 출력
	}

}
