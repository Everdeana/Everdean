package ch08;

public class SupersonicAirplaneRun {
	/*	자식 클래스에서 부모 클래스의 메서드를 Overrriding 하게 되면 
	 * 	부모 클래스의 메서드는 숨겨지고 Overriding된 자식 메서드만 보이게 된다. 
	 * 	그런데 자식 클래스 내부에서 Overriding된 부모의 클래스의 메서드를 호출해야 함
	 * 	상황이 발생한다면 명시적으로 super 키워드를 붙여서 부모 메서드를 호출할 수 있도록 한다.
	 * 	super는 부모 객체를 참고 하고 있기 때문에 부모 메서드에 직접 접근할 수 있다. */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 객체 생성 (인스턴스: instance)
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		Thread.sleep(2000);
		sa.fly();
		Thread.sleep(2000);
		sa.flymode = SupersonicAirplane.SUPERSONIC;
		Thread.sleep(2000);
		sa.fly();
		Thread.sleep(2000);
		sa.flymode = SupersonicAirplane.NORMAL;
		Thread.sleep(2000);
		sa.fly();
		Thread.sleep(2000);
		sa.lan();
	}

}
