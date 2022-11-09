package ch11;
/* Thread Ŭ������ ���� Ŭ������ ���� run �޼��带 �������̵� �Ϸ��� �Ѵ�. 
 * �� ���̻��� �����尡 ���������� ����Ǵ� ��Ƽ������ ��Ȳ�� ���� 
 *  */ 
public class MyThread extends Thread{
	/*   �ʵ� ����  */ 
	private String threadName;
	
	/* ������ ����  */
	MyThread(String name){
		threadName = name; /* this.threadName = name;   */  
	}

	
	
	/* �޼��� ����  */ 
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