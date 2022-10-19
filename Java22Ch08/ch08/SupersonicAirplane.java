package ch08;

public class SupersonicAirplane extends Airplane {
	// 필드 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	// 자주 사용되어지는 고정 값들을 상수처리하여 가독성을 향상시킨다.
	public int flymode = NORMAL;
	// 생성자 선언 
	
	// 메서드 선언
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		if (flymode == SUPERSONIC) {
			System.out.println();
			System.out.println("비행기가 초음속으로 비행합니다.");
		} else {
			System.out.println();
			super.fly(); // Airplane 객체의 fly() 메서드 호출
		}
	}
}