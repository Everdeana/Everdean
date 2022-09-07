package ch02Test;

public class TestEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'a';
		int n1 = 1;
		System.out.println(c1);
		// char 타입의 변수 c1의 값이 int 타입으로 변환되어 연산 처린
		System.out.println(c1 + n1);
		int n2 = 10;
		float n3 = 10.0f;
		System.out.println(n2 + n3);
		/*
		 * 이렇게 자료형을 변경하는 것을 "형 변환" 이라고 한다.
		 * Java에서는 작은 크기에서 큰 자료형의 형 변환은 암묵적으로
		 * 변환해 주고 큰 자료형에서 작은 타입 자료형으로 형 변환 하는 경우에는 
		 * 명시적 형 변환이 필요하다. */
	}

}
