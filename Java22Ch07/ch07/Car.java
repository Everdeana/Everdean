package ch07;

// �����ڵ��� ���� �ý��� ����
public class Car { // car�� ���õ� ������ �����ϴ� Ŭ����
	// �ʵ� ����
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	Car() {
		
	}
	
	// ������ ���� --> �ʵ��� �ʱ�ȭ
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
	// �޼��� ����
}
