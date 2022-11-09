package ch11;

/* Thread�� ����ϴ� ����� ������ 
 * - Thread�� ����ϰ� �ֱ� ������ �ٸ� Ŭ���� ����� �� ����. 
 *   (Java�� ���� ��Ӹ� ����) 
 * - ��, ���� Ŭ������ ���� Ŭ������ �����ϰ� �̸� ������� ���� ���ѷ��� 
 *   �� ����� ����� �� ����. 
 *  �̷��� ������ �ذ��ϱ� ���� ��� 
 *  - Runnable �������̽��� ���� 
 *  - Runnable �������̽��� �����ϸ� ������� ���۽�ų �� �ִ�. 
 *  - �� ������ Ŭ������ ��� �����鼭 ���ÿ� Runnable �������̽��� �����ϸ� �ȴ�.
 *  */ 
public class CountingTask implements Runnable{
	/* �ʵ� ����  */ 
	private String threadName; 
	/* ������ ����  */
	CountingTask(String name){
		//this.threadName = name;
		threadName = name; 
	}
	
	
	/*   �޼��� ���� */ 
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