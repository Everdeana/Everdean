package asg03Ex02;

public class SwitchEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = (int)(Math.random() * 4) + 8;
		// Math.random() * (������ ����) + (�����ϴ� ��) ==> 8���� 11(������ ���� = 4��) ������ ���� ��ȯ
		System.out.println("[����ð�: " + time + " ��]");
		
		switch (time) { // break���� ���� ��� �ش��ϴ� case �� �Ʒ��� ��� ������ ����ȴ�.
		case 8:
			System.out.println("����մϴ�.");
			break; // break������ �ҷ��� �������;� ���ϴ� ������ ���� �� �ִ�.
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�.");
			break;
		case 10:
			System.out.println("������ ���ϴ�.");
			break;
		default:
			System.out.println("�ܱ��� �����ϴ�.");
			break;
		}
	}

}
