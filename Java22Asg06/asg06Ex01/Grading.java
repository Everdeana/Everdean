package asg06Ex01;

import java.util.Scanner; // java�� util ��Ű������ Scanner ���̺귯�� ȣ��

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner Ŭ������ ����ϱ� ���� ���� ����(���� Scanner Type���� ����)
		Scanner input = new Scanner(System.in); // ���� �Է� ���� ���� ����
		// ���α׷� ���� ���� �����ϴ� ���� �Է¹��� ���� ����
		Scanner stdIn = new Scanner(System.in); 
		char key; // �Է� ���� ���ڸ� �����ϴ� ���� ����
		char grade; // �Է� ���� ������ �ش��ϴ� ������ ������ ���� ����
		do { // do~while()���� �ּ��� �� ���� ������ ����
			System.out.print("������ �Է��ϼ���: ");
			int score = input.nextInt(); // int ������ ���� �Է¹޴´�.
			
			if(score >= 90) {
				grade = 'A';
			} else if (score >= 80) {
				grade = 'B';
			} else if (score >= 70) {
				grade = 'C';
			} else if (score >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			System.out.println("������ " + grade + "�Դϴ�.");
			while(true) { // while���� Ȱ���Ͽ� q �Ǵ� y�� �Է¹޵��� �Ѵ�.
				System.out.print("��� �Է��Ͻðڽ��ϱ�?(y/q): ");
				key = stdIn.next().charAt(0); 
				// next().charAt(0)�� ����Ͽ� ó�� �Էµ� ���ڸ� �Է¹޴´�.
				System.out.println("�Էµ� ����: \"" + key + "\"");
				if(key == 'q' || key == 'Q' || key == 'y' || key == 'Y') {
					// re�� 0 �Ǵ� 1�̸�
					break; // while�� ���� �� do~while������ ���ư���.
				} else { // 0 �Ǵ� 1�� �ƴ� ��� ��� �ݺ��Ͽ� �Է¹޵��� �Ѵ�.
					System.out.println("y �Ǵ� q�� �Է��� �ּ���");
				}
			}
		} while(key == 'y' || key == 'Y'); 
		// �Է¹��� key�� y�� ��� �ݺ� --> y�� �ƴϸ� �ݺ��� ����
		System.out.println("���α׷��� �����մϴ�.");
	}
}
