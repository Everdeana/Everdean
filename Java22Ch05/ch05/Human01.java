package ch05;

public class Human01 {
	// 필드 선언 	
	private static int counter = 0; // 오직 한개만 만들어진다.
	private String name;
	private float height;
	private float weight;
	private int id; // 식별 번호 필드 선언
	
	// 생성자 선언
	public Human01(String name, float height, float weight) {
		// this 형식은 동일 클래스 내의 생성자를 호출한다.
		this.name = name;
		this.height = height;
		this.weight = weight;
		id = ++counter;
		
	}
	
	// 메서드 선언
	public void gainWeight(int w) {
		weight = weight + w;
	}
	
	public int getId() { // 식별 번호를 가져오는 메서드
		return id;
	}
	
	public void putData() {
		System.out.println("이름:" + name);
		System.out.println("신장:" + height + "cm");
		System.out.println("체중:" + weight + "kg");
	}

}
