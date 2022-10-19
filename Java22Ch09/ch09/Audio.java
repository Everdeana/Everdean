package ch09;

public class Audio implements RemoteControl{
	// 필드 선언
	private int volume;
	// 생성자 선언
	// 메서드 선언
	public void turnOn() {
		System.out.println("오디오를 ON합니다.");
	}
	public void turnOff() {
		System.out.println("오디오를 OFF합니다.");
	}
	
	public void setVolume(int volume) {
		
	}
}
