package ch07;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Singleton01 obj1 = new Singleton01();
		// Singleton01 obj2 = new Singleton01(); --> "�ٸ� Singleton ��ü �Դϴ�." 
		
		Singleton01 obj1 = Singleton01.getInstance();
		Singleton01 obj2 = Singleton01.getInstance(); // --> "���� Singleton ��ü �Դϴ�."
		
		if (obj1 == obj2) {
			System.out.println("���� Singleton ��ü �Դϴ�.");
		} else {
			System.out.println("�ٸ� Singleton ��ü �Դϴ�.");
		}
	}

}
