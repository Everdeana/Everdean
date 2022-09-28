package ch05;

public class Human01 {
	// �ʵ� ���� 	
	private static int counter = 0; // ���� �Ѱ��� ���������.
	private String name;
	private float height;
	private float weight;
	private int id; // �ĺ� ��ȣ �ʵ� ����
	
	// ������ ����
	public Human01(String name, float height, float weight) {
		// this ������ ���� Ŭ���� ���� �����ڸ� ȣ���Ѵ�.
		this.name = name;
		this.height = height;
		this.weight = weight;
		id = ++counter;
		
	}
	
	// �޼��� ����
	public void gainWeight(int w) {
		weight = weight + w;
	}
	
	public int getId() { // �ĺ� ��ȣ�� �������� �޼���
		return id;
	}
	
	public void putData() {
		System.out.println("�̸�:" + name);
		System.out.println("����:" + height + "cm");
		System.out.println("ü��:" + weight + "kg");
	}

}
