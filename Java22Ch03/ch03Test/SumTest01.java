package ch03Test;

import java.util.Scanner;

/* 1���� n���� ������ ���� ���ϴ� ���α׷� �ۼ�
 * -> ��. ������ ���� ���ϴ� �޼��带 ���� �ۼ��Ͽ� ��ȯó��
 *  1) Ű���� �Է� : n ��
 *  2) 1 ~ Ű����� �Է� n ������ ���� ��� ó��
 *  3) ���� �� ��� ó��
 *  4) �ݺ��� (for��)
 *  5) ������ ǥ����
 *  6) ���� ������ ���� ���� �޼���� ��ȯ */

public class SumTest01 {
	/* ������ ���� ����Ͽ� ��ȯ ó���ϴ� �޼��� ����  */ 
	public static int sumUp(int x) { // Default = Public
		int sum = 0;
		for(int i = 1; i <= x; i++) {
			sum = sum + i; // sum += i;
		}
		System.out.println("sum=" + sum + "�Դϴ�.");
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1���� n������ ���� ����ϴ� ���α׷�.");
		
		int n; // n = stdIn.nextInt();
		do {
			System.out.println("����n �� �Է�");
			n = stdIn.nextInt();
		} while (n <= 0);
		System.out.println("1����" + n + "������ ����" + sumUp(n) + "�Դϴ�.");
	}
}
