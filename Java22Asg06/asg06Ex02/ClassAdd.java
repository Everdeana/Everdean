package asg06Ex02;

import java.util.Scanner; // java.util ��Ű���� Scanner ȣ��

// Ű����� �� �μ��� �Է¹޾� ���ϱ� ���� ���� ���α׷� �ۼ�
public class ClassAdd {
	// �� ���� ������ �Է� �޾� ���ϱ� ������ �����ϴ� ���α׷� �ۼ�
	// �ʵ� ����
	int result;
	// ������
	// �޼���
	int plus(int n1, int n2) { // ���� ���� �޼��� ����
		result = n1 + n2;
		return (result);
	}
	int minus(int n1, int n2) { // ���� ���� �޼��� ����
		result = n1 - n2;
		return (result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int add1, add2;
		ClassAdd Add1, Add2;// Ŭ���� Ÿ�� ���� ���� --> ClassAdd(������ Ÿ��=Class) ����
		Add1 = new ClassAdd(); // Ŭ������ �������Ѽ� �ʱ�ȭ��Ŵ --> ���� ���� Ÿ������ ������
		Add2 = new ClassAdd(); 
		
		// Scanner Ŭ������ ����Ͽ� �� ���� �Է¹޴´�.
		Scanner stdIn = new Scanner(System.in); 
		System.out.print("ù ��° ���� �Է�:");
		// Scanner ��ü�� stdIn�� nextInt() �޼��带 �̿��Ͽ� ������ �Է¹޴´�.
		int n1 = stdIn.nextInt(); 
		System.out.print("�� ��° ���� �Է�:");
		int n2 = stdIn.nextInt();
		
		add1 = Add1.plus(n1, n2); // ������ �޼��带 ȣ���Ѵ�. 
		add2 = Add2.minus(n1, n2);
		System.out.println("�� ���� ���� ����� " + add1 + "�Դϴ�.");
		System.out.println("�� ���� ���� ����� " + add2 + "�Դϴ�.");
	}

}
