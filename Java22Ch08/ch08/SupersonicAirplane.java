package ch08;

public class SupersonicAirplane extends Airplane {
	// �ʵ� ����
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	// ���� ���Ǿ����� ���� ������ ���ó���Ͽ� �������� ����Ų��.
	public int flymode = NORMAL;
	// ������ ���� 
	
	// �޼��� ����
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		if (flymode == SUPERSONIC) {
			System.out.println();
			System.out.println("����Ⱑ ���������� �����մϴ�.");
		} else {
			System.out.println();
			super.fly(); // Airplane ��ü�� fly() �޼��� ȣ��
		}
	}
}