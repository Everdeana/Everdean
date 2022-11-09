package ch10;

/* 프로세서: 작업 단위
 * Example: 위젯 --> 콤보(Apple/Java/Python) --> 이벤트*/
public class ThreadRun {
	// JVM이 잉용프로그램을 실행할 때 Default로 생성되는 스레드 확인 프로그램
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int prioroty = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		System.out.println("현재 스레드의 이름:" + name);
		System.out.println("현재 스레드의 ID:" + id);
		System.out.println("현재 스레드의 우선순위:" + prioroty);
		System.out.println("현재 스레드의 상태:" + s);

	}

}
