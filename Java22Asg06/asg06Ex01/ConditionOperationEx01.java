package asg06Ex01;

import java.util.Scanner; // java�� util ��Ű������ Scanner ���̺귯�� ȣ��

public class ConditionOperationEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		// Scanner Ŭ������ ����ϱ� ���� ���� ����(���� Scanner Type���� ����)
		char grade; // ������ �´� ������ ����ϱ� ���� ���� ���� ���� ����
		System.out.print("������ �Է��ϼ���: ");
		int score = stdIn.nextInt(); // int�� ������ �Է¹޴´�.
		if (score >= 90) {
			grade = 'A';
		} else if (score > 80) {
			grade = 'B';
		} else {
			grade = 'C';
		}
		System.out.println(score + "���� " + grade + " ����Դϴ�.");

	}

}

/*	<< �Ʒ� ������ Ű���� �Է� ��ɰ� if ~ else ������ �����Ͽ� ���� ���� �ۼ� >>
 * 
 * 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "����" + grade + "����Դϴ�.");

	}

} */
