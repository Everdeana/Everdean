package ch07;

public class CarRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("세단형"); // 인스턴스 생성
		System.out.println("ca1.company=" + car1.company);
		System.out.println("ca1.model=" + car1.model);
		
		Car car2 = new Car(); // 접근 불가능하도록 만들어야 함
		/* !!Caution!!: Car 클래스의 필드에 직접 접근하지 않고 
		 * 생성자를 통해서만 필드에 접근하도록 처리해야 한다. */
		System.out.println("ca2.company=" + car2.company);
		System.out.println("ca2.model=" + car2.model);
		
		Car car3 = new Car("SUV", "Black", 220);
		System.out.println("ca3.model=" + car3.model);
		System.out.println("ca3.color=" + car3.color);
		System.out.println("ca3.maxSpeed=" + car3.maxSpeed);
		
	}

}
