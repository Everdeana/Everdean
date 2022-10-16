package asg06Ex01;

public class CompareEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 10;
		// True/False 확인 위해 boolean으로 변수를 선언
		boolean result1 = (num1 == num2); // 같다
		boolean result2 = (num1 != num2); // 같지 않다
		boolean result3 = (num1 <= num2); // num1이 num2보다 작거나 같다
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		int code1 = (int ) char1; // A와 B(문자 - char)의 크기 비교는 어떤 방법으로 하는가?
		int code2 = (int ) char2; // char는 문자를 정수값 코드로 저장함
		boolean result4 = (char1 < char2); // 문자 A가 B보다 작다
		System.out.println("result4=" + result4);
		System.out.println("문자" + char1 + "의 값은 " + code1);
		System.out.println("문자" + char2 + "의 값은 " + code2);
		/* char는 문자를 내부적으로 정수값 코드로 저장하기 때문에 
		 * 정수형 ( byte, short , int ,long )과 밀접한 관계가 있다. */
		// char는 자바에서 유니코드(2 byte 문자체계)를 사용하므로 2 byte 이다. 
	}

}
