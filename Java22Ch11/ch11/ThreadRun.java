package ch11;

/* Thread가 클래스를 상속하는 방법 
 * - Thread가 실행할 작업 run method로 돌아간다
 * - Thread.sleep(arg) 메서드는 Thread 실행을 잠시 중단 시킨다. 
 * - Thread 객체를 만들어 start method로 실행시키면 
 *   multi-threading 이 시작된다.  
 *   주의: run method는 호출되는게 아니다. */ 
public class ThreadRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new MyThread("First");
		Thread t2 = new MyThread("Second"); 

		t1.start();
		t2.start();
	}
}