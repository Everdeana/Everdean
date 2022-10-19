package ch09;

public class Television implements RemoteControl{
	// 필드 선언
	private int volume;
	// 생성자 선언
	// 메서드 선언
	public void turnOn() {
		System.out.println("TV 전원을 ON합니다.");
	}
	
	public void turnOff() {
		System.out.println("TV 전원을 OFF합니다.");
	}
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 소리는" + this.volume + "입니다.");
	}
}
