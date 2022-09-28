package ch05;

// 클래스 선언: 클래스 접근 제어자: public, private, protected
public class HumanAd {
	// 필드 선언
	private String name;
	private int height;
	private int weight;
	
	
	// 생성자(클래스 이름과 같다): 필드의 초기화 작업
	HumanAd(String n, int h, int w) {
		name = n; 
		height = h; 
		weight = w;
	}
	
	// 메서드 선언
	String getName() { // 이름을 가져오기
		return name;
	}
	int getHeight() { // 신장을 가져오기
		return height;
	}
	int getWeight() { // 체중을 가져오기
		return weight;
	}
	
	int gainWeight(int w) {
		weight = weight + w; // 기존 체중보다 체중이 늘었다.
		return weight;
	}
	int reduceWeight(int w) {
		weight = weight - w; // 체중이 감소 되었다.
		return weight;
	}

}
