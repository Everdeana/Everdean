package ch05;

// Ŭ���� ����: Ŭ���� ���� ������: public, private, protected
public class HumanAd {
	// �ʵ� ����
	private String name;
	private int height;
	private int weight;
	
	
	// ������(Ŭ���� �̸��� ����): �ʵ��� �ʱ�ȭ �۾�
	HumanAd(String n, int h, int w) {
		name = n; 
		height = h; 
		weight = w;
	}
	
	// �޼��� ����
	String getName() { // �̸��� ��������
		return name;
	}
	int getHeight() { // ������ ��������
		return height;
	}
	int getWeight() { // ü���� ��������
		return weight;
	}
	
	int gainWeight(int w) {
		weight = weight + w; // ���� ü�ߺ��� ü���� �þ���.
		return weight;
	}
	int reduceWeight(int w) {
		weight = weight - w; // ü���� ���� �Ǿ���.
		return weight;
	}

}
