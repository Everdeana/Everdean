package asg06Ex01;

public class Hello {
	
	public static int sum(int n, int m) { // 메서드 선언
		return n + m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 20; // 변수 선언
		int s;
		char a;
		
		s = sum(i, 10); // sum() 메서드 호출
		a = '?';
		System.out.println(a); // 문자 '?' 화면 출력
		System.out.println("Hello"); // "Hello" 문자열 화면 출력
		System.out.println(s); // 정수 s값 화면 출력
	}

}
