package Asgmt04;

public class IncreaseDecreaseOpEx01 {
	/*
	 * |++|피연산자|: 다른 연산을 수행하기 전에 피연산자의 값을 1 증가 시킴
	 * |--|피연산자|: 다른 연산을 수행하기 전에 피연산자의 값을 1 감소 시킴
	 * |피연산자|++|: 다른 연산을 수행한 후에 피연산자의 값을 1 증가 시킴
	 * |피연산자|--|: 다른 연산을 수행한 후에 피연산자의 값을 1 감소 시킴 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10; // 정수형 변수 선언
		int y = 10;
		int z;
		
		System.out.println("-----------------------");
		x++; // 10 + 1 = 11
		++x; // 11 + 1 = 12 --> x = 12
		System.out.println("x= " + x);
		
		System.out.println("-----------------------");
		y--; // 10 - 1 = 9
		--y; //  9 - 1 = 8 --> y = 8
		System.out.println("y= " + y);
		
		System.out.println("-----------------------");
		z = x++;
		/* z에 앞에서 계산한 x(12)를 대입한 후 마지막에 1을 더함
		 * z = 12(x)
		 * 12(x) + 1 = 13(x) 
		 * --> z = 12, x = 13*/
		System.out.println("z= " + z);
		System.out.println("x= " + x); 
		
		System.out.println("-----------------------");
		z = ++x; 
		/* z에 앞에서 계산한 x값을 대입하기 전에 x에 1을 더해준다.
		 * 13(x) + 1 = 14(x)
		 * z = 14(x) 
		 * --> z = 14, x = 14 */
		System.out.println("z= " + z); 
		System.out.println("x= " + x);
		
		System.out.println("-----------------------");
		z = ++x + y++;
		/* 계산을 하기 전에 x값에 1을 먼저 더해주고 계산 후에 그 값을 z에 대입한 뒤 y에 1을 더해준다.
		 * 14(x) + 1 = 15
		 * z = 15 + 8 = 23
		 * 8(y) + 1 = 9
		 * --> z = 23, x = 15, y = 9 */
		System.out.println("z= " + z); 
		System.out.println("x= " + x);
		System.out.println("y= " + y);
	}
}
