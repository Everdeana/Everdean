package asg06Ex01;

public class ExceptionEx02 {
	// throws�� ���� �޼��忡�� ���� �޼���� ���ܸ� ������.
	public static void trsTest() throws Exception{
		int a = 2/0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ExceptionEx02.trsTest(); // �� �Լ����� ���� ó���� �Ѵ�.
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�޼��带 ȣ���ϴ� main �޼��忡 ���� ó���� �����Ѵ�.");
		}
		/* throws
		 *  - �޼����� ���� �ڿ� ��Ÿ���� �޼��忡 �߻��� �� �ִ� ���� Ŭ���� ����� ������ �� ����. */
	}
}
