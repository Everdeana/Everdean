package ch10;

/* ���μ���: �۾� ����
 * Example: ���� --> �޺�(Apple/Java/Python) --> �̺�Ʈ*/
public class ThreadRun {
	// JVM�� �׿����α׷��� ������ �� Default�� �����Ǵ� ������ Ȯ�� ���α׷�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		int prioroty = Thread.currentThread().getPriority();
		Thread.State s = Thread.currentThread().getState();
		
		System.out.println("���� �������� �̸�:" + name);
		System.out.println("���� �������� ID:" + id);
		System.out.println("���� �������� �켱����:" + prioroty);
		System.out.println("���� �������� ����:" + s);

	}

}
