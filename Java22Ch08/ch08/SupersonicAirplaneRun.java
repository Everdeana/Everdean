package ch08;

public class SupersonicAirplaneRun {
	/*	�ڽ� Ŭ�������� �θ� Ŭ������ �޼��带 Overrriding �ϰ� �Ǹ� 
	 * 	�θ� Ŭ������ �޼���� �������� Overriding�� �ڽ� �޼��常 ���̰� �ȴ�. 
	 * 	�׷��� �ڽ� Ŭ���� ���ο��� Overriding�� �θ��� Ŭ������ �޼��带 ȣ���ؾ� ��
	 * 	��Ȳ�� �߻��Ѵٸ� ��������� super Ű���带 �ٿ��� �θ� �޼��带 ȣ���� �� �ֵ��� �Ѵ�.
	 * 	super�� �θ� ��ü�� ���� �ϰ� �ֱ� ������ �θ� �޼��忡 ���� ������ �� �ִ�. */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// ��ü ���� (�ν��Ͻ�: instance)
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		Thread.sleep(2000);
		sa.fly();
		Thread.sleep(2000);
		sa.flymode = SupersonicAirplane.SUPERSONIC;
		Thread.sleep(2000);
		sa.fly();
		Thread.sleep(2000);
		sa.flymode = SupersonicAirplane.NORMAL;
		Thread.sleep(2000);
		sa.fly();
		Thread.sleep(2000);
		sa.lan();
	}

}
