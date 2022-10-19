package ch09;

/* 인터페이스는 개발코드와 객체가 서로 통신하는 접점
 * 개발코드는 인터페이스의 메서드만 알고 있는 프로그램 개발이 용이하다.
 * 인터페이스는 객체의 교환성을 높여주기 때문에 다향성을 구현하는 데
 * 매우 중요한 역할을 한다.*/ 
public interface RemoteControl {
	// 필드(상수) 선언
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// Interface는 생성자가 없음
	// 추상 메서드 선언
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// Default Method 선언
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다.");
		} else {
			System.out.println("무음해제합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교환해야합니다.");
	}
}
