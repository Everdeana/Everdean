package asg06Ex01;

import java.util.Scanner; // java�� util ��Ű������ Scanner ���̺귯�� ȣ��

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		// Scanner Ŭ������ ����ϱ� ���� ���� ����(���� Scanner Type���� ����)
		
		System.out.println("�� ���� ������ �Է��Ͻÿ�.");
		System.out.print("1��° ����: ");
		int i = keyboard.nextInt(); // Ű����� �Էµ� int���� ��ȯ�Ѵ�.
		System.out.print("2��° ����: ");
		int j = keyboard.nextInt();
		System.out.println("�� ���� ���� = " + (i * j)); // �� ���� �� ���
		
		System.out.println("�� ����  �Ǽ��� �Է��Ͻÿ�.");
		System.out.print("1��° �Ǽ�: ");
		double x = keyboard.nextDouble(); // Ű����� �Էµ� double���� ��ȯ�Ѵ�.
		System.out.print("2��° �Ǽ�: ");
		double y = keyboard.nextDouble();
		System.out.println("�� ���� ���� = " + (x + y)); // �� ���� �� ���
		
		System.out.println("�� ���� �ܾ �Է��Ͻÿ�.");
		System.out.print("1��° �ܾ�: ");
		String str1 = keyboard.next(); // ���鹮�ڴ� ���Խ�Ű�� �ʰ� String�� ��ȯ��
		System.out.print("2��° �ܾ�: ");
		String str2 = keyboard.next();
		System.out.println(str2 + " of " + str1); // str1/str2�� ����� String ���

	}

}
