package ch02;

public class TestEx04 {
	// ���α׷��� �����ϱ� ���� �����ϱ� ���� ����
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int keyCode;
		// Scanner()
		keyCode = System.in.read();
		/* System.in.read()�� �ԷµǾ� ó���Ǵ� ���� ����Ʈ�� ó��  
		 * �̶� ���ϵǴ� ���� ������ ó���ȴ�. �������� ��ȭ�� 0���� 255����*/
		System.out.println("keyCode: " + keyCode);
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
	}

}
