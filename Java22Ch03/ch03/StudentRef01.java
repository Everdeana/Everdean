package ch03;

import java.util.Scanner;

/*	������ ����: �迭, Ŭ����, �������̽�, ������
 * 	�������� ������ ��������� �ּҸ� ����ϰ� �ִ�. */
public class StudentRef01 {
	// �л� ���� ���� ���α׷� �ۼ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course[] = {"Java", "Python", "C Language"};
		Scanner stdIn = new Scanner(System.in);
		int n = 3; // �⺻�� �ڷ��� Ÿ�� ����
		int[] score = new int[n]; // ������ �迭 Ÿ�� ����
		for (int i = 0; i < n; i++) { // ���� �Է� ó��
			System.out.print((i + 1) + "��° ���� " + course[i] + "�� ���� = ");
			score[i] = stdIn.nextInt(); // �迭 Ÿ�Կ� ���� Ű���� �Է�
		}
		// �Էµ� ������ ������ ����� ���ó��
		int total = 0;
		float average = 0; // float = 4byte
		for (int i = 0; i < n; i++) {
			System.out.println(course[i] + ":" + score[i]);
			total = total + score[i];
		}
		System.out.println("���� ����� = " + total);
		average = total / n;
		System.out.println(n + "������ ����� = " + average);
	}
}
