package ch03;

import java.util.Scanner;

/*	�л� ���� ó�� ���α׷�
 * 	 1. ������ Ű����� �Է�
 * 	 2. ���� Ű���� �Է�
 * 	 3. ���� ���
 * 	 4. ��� ���
 * 	 5. ������� �ش� ���� ���
 * 	 6. ������ ��� ��� */

public class StudentRef02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String course[] = {"Java", "Python", "C Language"};
		// int score[] = {90, 89, 88};
		// Scanner stdNum = new Scanner(System.in); // ���� �� �Է�
		// System.out.print("���� �� �Է�: ");
		// int n = stdNum.nextInt();
		
		Scanner stdIn = new Scanner(System.in); // ���� Ű���� �Է�
		Scanner stdCh = new Scanner(System.in); // ���� Ű���� �Է�
		
		int n = 3;
		int[] score = new int[n]; // ������ score �迭 ����
		String[] course = new String[n]; // ������ score �迭 ����
		
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "��° �����: ");
			course[i] = stdCh.nextLine(); // �迭 Ÿ�Կ� ���� Ű���� �Է�
			System.out.print((i + 1) + "��° ���� " + course[i] +"�� ����: ");
			score[i] = stdIn.nextInt(); // �迭 Ÿ�Կ� ���� Ű���� �Է�
		}
		
		int total = 0;
		float average = 0; // float = 4byte
		
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + "��° ���� " + course[i] +"�� ����: " + score[i]);
			total = total + score[i];
		}

		System.out.println(n + "������ ������ = " + total);
		average = total / n;
		System.out.println(n + "������ ����� = " + average);
	}
}
