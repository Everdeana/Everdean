package ch11;

/* Thread를 상속하는 방법의 문제점 
 * - Thread를 상속하고 있기 때문에 다른 클래스 상속할 수 없다. 
 *   (Java는 단일 상속만 가능) 
 * - 즉, 기존 클래스의 서브 클래스를 정의하고 이를 스레드로 동작 시켜려면 
 *   이 방법을 사용할 수 없다. 
 *  이러한 문제를 해결하기 위한 방법 
 *  - Runnable 인터페이스를 구현 
 *  - Runnable 인터페이스를 구현하면 스레드로 동작시킬 수 있다. 
 *  - 즉 기존의 클래스를 상속 받으면서 동시에 Runnable 인터페이스를 구현하면 된다.
 *  */ 
public class CountingTask implements Runnable{
	/* 필드 선언  */ 
	private String threadName; 
	/* 생성자 선언  */
	CountingTask(String name){
		//this.threadName = name;
		threadName = name; 
	}
	
	
	/*   메서드 선언 */ 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			System.out.printf("%s:%d\n", threadName, i);
			try {
				Thread.sleep(1000);
				
			} catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
		
	}

}