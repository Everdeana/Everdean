package ch07;

public class CarRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("������"); // �ν��Ͻ� ����
		System.out.println("ca1.company=" + car1.company);
		System.out.println("ca1.model=" + car1.model);
		
		Car car2 = new Car(); // ���� �Ұ����ϵ��� ������ ��
		/* !!Caution!!: Car Ŭ������ �ʵ忡 ���� �������� �ʰ� 
		 * �����ڸ� ���ؼ��� �ʵ忡 �����ϵ��� ó���ؾ� �Ѵ�. */
		System.out.println("ca2.company=" + car2.company);
		System.out.println("ca2.model=" + car2.model);
		
		Car car3 = new Car("SUV", "Black", 220);
		System.out.println("ca3.model=" + car3.model);
		System.out.println("ca3.color=" + car3.color);
		System.out.println("ca3.maxSpeed=" + car3.maxSpeed);
		
	}

}
