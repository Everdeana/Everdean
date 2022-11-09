package ch11;
/* Thread 클래스에 서브 클래스를 만들어서 run 메서드를 오버라이드 하려고 한다. 
 * 두 개이상의 스레드가 병렬적으로 실행되는 멀티스레드 상황을 구현 
 *  */ 
public class MyThread extends Thread{
	/*   필드 선언  */ 
	private String threadName;
	
	/* 생성자 선언  */
	MyThread(String name){
		threadName = name; /* this.threadName = name;   */  
	}

	
	
	/* 메서드 선언  */ 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			System.out.printf("%s: %d\n", threadName, i);
			try {
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}