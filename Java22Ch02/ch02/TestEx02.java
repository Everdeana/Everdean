package ch02;

import java.util.Scanner;

// �� ���� �Ǽ��� �Է¹޾�(�ܺ��Է� ó��) ū ���� ǥ���ϴ� ���α׷� �ۼ�

public class TestEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in); // �ν��Ͻ� ����
		System.out.print("ù ��° �Ǽ� �Է�: ");
		double x = stdIn.nextDouble();
		System.out.print("�� ��° �Ǽ� �Է�: ");
		double y = stdIn.nextDouble();
		double max; // �Էµ� �� �Ǽ� �� �� ū ���� �����ϴ� ���� ����
		
		if(x > y) {
			max = x;
		} else {
			max = y;
		}
		System.out.println("ū ���� " + max + " �Դϴ�.");
	}

}
