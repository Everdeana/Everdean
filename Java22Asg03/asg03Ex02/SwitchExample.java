package asg03Ex02;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// java library��  Math Ŭ�������� random �Լ��� �����ͼ� ������ ��ȯ�Ѵ�. 
		int num = (int)(Math.random() * 6) + 1; 
		// Math.random() * (������ ����) + (�����ϴ� ��) ==> 1���� 6 ������ ���� ��ȯ
		switch(num) {
		case 1: // 1�� ���
			System.out.println("1���� ���Խ��ϴ�.");
			break; // switch�� Ż��
		case 2: // 2�� ���
			System.out.println("2���� ���Խ��ϴ�.");
			break; // switch�� Ż��
		case 3: // 3�� ���
			System.out.println("3���� ���Խ��ϴ�.");
			break; // switch�� Ż��
		case 4: // 4�� ���
			System.out.println("4���� ���Խ��ϴ�.");
			break; // switch�� Ż��
		case 5: // 5�� ���
			System.out.println("5���� ���Խ��ϴ�.");
			break; // switch�� Ż��
		default: // ��� �ƴ� ���
			System.out.println("6���� ���Խ��ϴ�.");
			break; // switch�� Ż��
		}
	}

}
