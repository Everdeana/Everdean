package asg03Ex02;

import java.util.Scanner; // java�� util ��Ű������ Scanner ���̺귯�� ȣ��

public class LoginEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner Ŭ������ ����ϱ� ���� ���� ����(���� Scanner Type���� ����)
		Scanner stdIn = new Scanner(System.in); // �ԷµǴ� ���� �ý��ۿ� �Էµȴ�.
		
		System.out.print("���̵�:"); // �� �ٲ��� �ʰ� �Է¹޵��� �Ѵ�.
		String name = stdIn.nextLine(); // ���̵� name�� ����
		/* ���� ����(space)�� �Է��ϱ� �������� ���ڸ� �Է¹޴� next�� �ƴ϶�
		 * ����Ű�� �Է��ϱ� �������� ���ڸ� �Է¹޴� nextLine�� ����Ѵ�. */
		
		System.out.print("�н�����:");
		String pwd = stdIn.nextLine(); // ��й�ȣ�� pwd�� ����
		/* ���� ����(space)�� �Է��ϱ� �������� ���ڸ� �Է¹޴� next�� �ƴ϶�
		 * ����Ű�� �Է��ϱ� �������� ���ڸ� �Է¹޴� nextLine�� ����Ѵ�. */
		
		int pass = Integer.parseInt(pwd); // �Է¹��� ���ڿ��� ������ Ÿ������ ����ȯ�����ش�.
		
		if(name.equals("java")) { // ���̵� ������ ���ڿ��� ���� ���
			if(pass == 12345) { // ��й�ȣ�� ������ �������� ���� ���
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ����: �н����尡 Ʋ��");
			}
		} else {
			System.out.println("�α��� ����: ���̵� �������� ����");
		}
	}
}