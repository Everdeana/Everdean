package ch11;

/* Thread�� Ŭ������ ����ϴ� ��� 
 * - Thread�� ������ �۾� run method�� ���ư���
 * - Thread.sleep(arg) �޼���� Thread ������ ��� �ߴ� ��Ų��. 
 * - Thread ��ü�� ����� start method�� �����Ű�� 
 *   multi-threading �� ���۵ȴ�.  
 *   ����: run method�� ȣ��Ǵ°� �ƴϴ�. */ 
public class ThreadRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new MyThread("First");
		Thread t2 = new MyThread("Second"); 

		t1.start();
		t2.start();
	}
}