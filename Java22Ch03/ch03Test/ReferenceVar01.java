package ch03Test;
/*	�������� �⺻ Ÿ��: int, long, double, float, char,
 * 				  byte, Boolean
 * 	�޼���� ����: void, return
 * 	��ü�� ����: new, instanceof()
 * 	Ŭ������ �޼��� ����������: public, private, protected
 * 	Ŭ������ ����: class
 * 	���, ���ǹ�: if, else, if ~ else, switch, case
 * 	�ݺ���: do ~ while, while, for
 * 	�б⹮: break, continue
 * 	����ó����: try ~ catch, throws Exception
 * 	���� Ŭ������ ����: import */


import java.util.Scanner;

public class ReferenceVar01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java Programming";
		/*	String �ڷ����� �ƴϴ�.
		 * 	���ڿ� "Java Programming"�� �����ϰ� �ִ�
		 * 	�ν��Ͻ��� �ּҰ��� ���� */
		 Scanner stdIn = new Scanner(System.in);
		 int n = stdIn.nextInt();
		 int[] a = new int[n];
		 System.out.println(str);
	}
}
