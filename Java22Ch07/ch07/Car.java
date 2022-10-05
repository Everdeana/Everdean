package ch07;

// 현대자동차 관리 시스템 개발
public class Car { // car에 관련된 정보를 설계하는 클래스
	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car() {
		
	}
	
	// 생성자 선언 --> 필드의 초기화
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	// 메서드 선언
}
