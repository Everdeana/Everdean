package ch02;

import java.util.Scanner;

/* �Էµ� �� ���� �� �� ū ���� ó���ϴ� ���α׷�
 * --> ���׿����ڸ� ��� */

public class TestEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ű���� �Է��� ó���ϱ� ���� �ν��Ͻ�(��ü) ����
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�Ǽ� x�� �Է�: ");
		double x = stdIn.nextDouble();
		System.out.println("�Ǽ� y�� �Է�: ");
		double y = stdIn.nextDouble();
		double max = x > y ? x: y; // ���׿�����: ���� ? ��: ����
		System.out.println("ū ���� " + max + " �Դϴ�.");
	}

}
