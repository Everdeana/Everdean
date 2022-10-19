package ch09;

/* �������̽��� �����ڵ�� ��ü�� ���� ����ϴ� ����
 * �����ڵ�� �������̽��� �޼��常 �˰� �ִ� ���α׷� ������ �����ϴ�.
 * �������̽��� ��ü�� ��ȯ���� �����ֱ� ������ ���⼺�� �����ϴ� ��
 * �ſ� �߿��� ������ �Ѵ�.*/ 
public interface RemoteControl {
	// �ʵ�(���) ����
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// Interface�� �����ڰ� ����
	// �߻� �޼��� ����
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// Default Method ����
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("����ó���մϴ�.");
		} else {
			System.out.println("���������մϴ�.");
		}
	}
	
	static void changeBattery() {
		System.out.println("�������� ��ȯ�ؾ��մϴ�.");
	}
}
