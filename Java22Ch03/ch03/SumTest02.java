package ch03;

import java.util.Scanner;

/* �迭 a�� ���� �� ����� ���� ���ϴ� ���α׷� �ۼ�
 * 	1) main()�޼��忡�� ��� ����� ���� �о �迭 ����
 * 	2) �� ����� ���� ����
 * 	3) ����� ���� ���ϴ� �޼���(sumOf())�� ����
 * 	4) ������ sumOf()�޼��带 ȣ��
 * 	5) �Է��� �迭�� ����� �հ踦 ���
 * 	6) ���� �޼���� ��ȯ�Ѵ�. */

public class SumTest02 {
	public static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];	
		}
		System.out.println("�迭�� ����" + sum + "�Դϴ�.");
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�迭�� ��� �� �Է�:");
		int num = stdIn.nextInt(); // Ű����� �Էµ� �迭�� ��� �� ����
		int[] x = new int[num]; // �Էµ� �迭 ����� ���� ���� �迭 ����
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]=");
			x[i] = stdIn.nextInt();
		}
		System.out.println("�迭�� ��� ����� ����" + sumOf(x) + "�Դϴ�.");
	}

}
