package ch09;

public class Television implements RemoteControl{
	// �ʵ� ����
	private int volume;
	// ������ ����
	// �޼��� ����
	public void turnOn() {
		System.out.println("TV ������ ON�մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("TV ������ OFF�մϴ�.");
	}
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV �Ҹ���" + this.volume + "�Դϴ�.");
	}
}
