package asg03Ex02;

import java.util.Scanner; // java�� util ��Ű������ Scanner ���̺귯�� ȣ��

public class SwitchEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char key; // �з� ���� ���ڸ� �����ϴ� ���� ����
		
		do { // do~while()���� �ּ��� �� ���� ������ ����
			System.out.print("������ ���ڷ� �Է��ϼ���: ");
			char grade = input.next().charAt(0); 
			// next().charAt(0)�� ����Ͽ� ó�� �Էµ� ���ڸ� �Է¹޴´�.
			double gPoints = 0; // �Ǽ� ���·� ������ ������ ������ �����Ѵ�.
			
			switch (grade) {
			case 'A': case'a': // case�� 'UC', 'LC'�� �Էµ� ���
				gPoints = 4.0; // �ش��ϴ� �Ǽ� ���
				break; // switch�� Ż��
			case 'B': case'b':
				gPoints = 3.0;
				break;
			case 'C': case'c':
				gPoints = 2.0;
				break;
			case 'D': case'd':
				gPoints = 1.0;
				break;
			case 'F': case'f':
				gPoints = 0.0;
				break;
			default: // ���� ���� ��� �ƴ� �� 
				System.out.println("�߸��� �����Դϴ�.");
				break;
			}
			System.out.println("����= " + gPoints);
			while(true) { // while���� Ȱ���Ͽ� q �Ǵ� y�� �Է¹޵��� �Ѵ�.
				System.out.print("��� �Է��Ͻðڽ��ϱ�?(y/q): ");
				Scanner stdIn = new Scanner(System.in);
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
