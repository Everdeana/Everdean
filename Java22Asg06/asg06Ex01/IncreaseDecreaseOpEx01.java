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
		z = x++; // z�� x�� ������ �� x�� 1�� ���� --> z = 12(����) --> 12 + 1 --> x = 13
		System.out.println("z=" + z); // z = 12
		System.out.println("x=" + x); // ���� �� 1�� �������Ƿ� x�� 13
		
		System.out.println("-----------------------");
		z = ++x; // ���� x�� 1�� ���� �� z�� x�� ���� --> z = 14, x = 14
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");
		z = ++x + y++; // ���� x�� 1�� ���� �� y���� 8�� ���ϸ� --> 15 + 8 = 23 = z
		System.out.println("z=" + z); // z = 23
		System.out.println("x=" + x); // x = 15
		System.out.println("y=" + y); 
		// y++�̹Ƿ� ���� ����� ���� �Ŀ� 1�� ���Ѵ�. --> y = 8 + 1 = 9
	}

}
