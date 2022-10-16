package asg06Ex01;

public class IncreaseDecreaseOpEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-----------------------");
		x++; // 10 + 1 = 11 --> x = 11
		++x; // 11 + 2 = 12 --> x = 12
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");
		y--; // 10 - 1 = 9 --> y = 9
		--y; // 9 - 1 = 8 --> y = 8
		System.out.println("y=" + y);
		
		System.out.println("-----------------------");
		z = x++; // z에 x를 대입한 후 x에 1을 더함 --> z = 12(대입) --> 12 + 1 --> x = 13
		System.out.println("z=" + z); // z = 12
		System.out.println("x=" + x); // 대입 후 1을 더했으므로 x는 13
		
		System.out.println("-----------------------");
		z = ++x; // 먼저 x에 1을 더한 후 z에 x값 대입 --> z = 14, x = 14
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");
		z = ++x + y++; // 먼저 x에 1을 더한 후 y값인 8과 더하면 --> 15 + 8 = 23 = z
		System.out.println("z=" + z); // z = 23
		System.out.println("x=" + x); // x = 15
		System.out.println("y=" + y); 
		// y++이므로 위의 계산이 끝난 후에 1을 더한다. --> y = 8 + 1 = 9
	}

}
