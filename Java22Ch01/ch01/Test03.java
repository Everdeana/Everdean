package ch01;

import java.util.Scanner;

/*	Ű���� �Է��� ���� ���� 5�� ���������� "�� ���� 5�� ���������ϴ�." ��µǰ�
 * 	�Է��� �������� 5�� ���������� ������ "�� ���� 5�� ���������� �ʽ��ϴ�." ��� 
 * 	 - Ű���� �Է�(�ܺ��Է�) �ޱ� ���� �غ�
 * 	 - �Էµ� ���� �����ϱ� ���� ��ü ���� ����
 * 	 - ���ǹ��� ���� 5�� �������� ���, �׷��� ���� ��� ���� ����
 * 	 - ��� ���
 * */
public class Test03 {
	/*
	// ��ü(Class)�� ���� = �޼���(Method) + �Ӽ�(Property):�ʵ�(Field)
	
	// int x = 3; // main method�� static�ε� ������ static�� �ƴϹǷ� ���� �߻�
	static int x = 3; // Test03 Class ���� Property
	public static void main(String[] args) {
		System.out.println(x + "����Դϴ�.");
	} */
	
	public static void main(String[] args) {
		System.out.print("������ �Է��ϼ���: ");
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		if (n > 0) {
			if (n % 5 == 0) {
				System.out.println("�Էµ� ��" + n + "�� 5�� ���������ϴ�.");
				
			} else {
				System.out.println("�Էµ� ��" + n + "�� 5�� ���������� �ʽ��ϴ�.");
			}
		} else {
			System.out.println("�Էµ� ��" + n + "�� ������ �ԷµǾ����ϴ�.");
		}
	}
	
}
