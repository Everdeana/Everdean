package ch05;

import java.util.Scanner;

//�л� �������� ���α׷�
// 1. �л� ���� �Է�(Ű����)
// 2. ������ �Է�(Ű����)
// 3. ����/ ��� ���
// 4. �ְ���/ ������ ��� ó

public class StudentEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.in.read();
		// Scanner stdIn = new Scanner(System.in); �ν��Ͻ� ����
		Scanner stdIn = new Scanner(System.in); //�����Է�
		Scanner stdCh = new Scanner(System.in); //������ �Է�
		// Scanner n = new Scanner(System.in);
		// System.out.print("�л� �� �Է�:");
		// int n = stdN.nextInt();
		int n = 3;
		int total = 0;
		int[] score = new int[3]; // �Է� ������ �� �迭(������) ����
		
		for(int i=0; i<n; i++) {
			System.out.print((i+1)+"��° ����=");
			score[i] = stdIn.nextInt(); 
		}
		String[] course = new String[n]; //�Է� ������ �� �迭 ����
		for(int i=0; i<n; i++) {
			System.out.print((i+1)+"��° ������=");
			course[i] = stdCh.next(); 
			
		}
		// �Էµ� ������ ���� ��� ó����
		for(int i=0; i<n; i++) {
			System.out.println(course[i]+"=" + score[i]);
			total = total + score[i];
		}
		System.out.println("���� ���=" +total);
		double average = total / (double)n;
		System.out.println("��� ���=" + average);
		// �ְ� ���� ����, ���� ���� ����
		int max = score[0]; // �ְ� ������� ����
		int min = score[0]; // ���� ������� ����
		for(int i=1; i<n; i++) {
			if(score[i] > max) max = score[i];
			if(score[i] > min) min = score[i];
			
		}
		System.out.println("�ְ�����=" + max);
		System.out.println("��������=" + min);
	}
}
