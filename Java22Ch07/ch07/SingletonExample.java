package ch07;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Singleton01 obj1 = new Singleton01();
		// Singleton01 obj2 = new Singleton01(); --> "다른 Singleton 객체 입니다." --> 오류 
		
		Singleton01 obj1 = Singleton01.getInstance();
		Singleton01 obj2 = Singleton01.getInstance(); // --> "같은 Singleton 객체 입니다."
		
		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.(정상)");
		} else {
			System.out.println("다른 Singleton 객체 입니다.(오류)");
		}
	}

}
