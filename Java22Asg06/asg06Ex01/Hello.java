package asg06Ex01;

public class Hello {
	
	public static int sum(int n, int m) { // �޼��� ����
		return n + m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 20; // ���� ����
		int s;
		char a;
		
		s = sum(i, 10); // sum() �޼��� ȣ��
		a = '?';
		System.out.println(a); // ���� '?' ȭ�� ���
		System.out.println("Hello"); // "Hello" ���ڿ� ȭ�� ���
		System.out.println(s); // ���� s�� ȭ�� ���
	}

}
