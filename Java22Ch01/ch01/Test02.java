package ch01;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ܺ� �Է��� �ޱ� ���� ��ü(����) Ŭ���� ����
		Scanner stdIn = new Scanner(System.in); // Scanner��� �ϴ� Ŭ���� Ÿ������ ���� --> ������ type�� ������ ����
		System.out.print("�������� �Է��ϼ���: ");
		int x = stdIn.nextInt() + 100;
		System.out.println("�Է��� ������" + x + "�Դϴ�.");
		
	}

}
