package asg03Ex01;

public class KeyCodeEx01 {

	// ���� �Էµ��� �ʾ��� ��� ����ó���� �Ѵ�. throws Exception�� ���� ������ ����� �ش�.
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int keyCode;
		/* System.in.read()�� �ԷµǾ� ó���Ǵ� ���� ����Ʈ�� ó��  
		 * �̶� ���ϵǴ� ���� ������ ó���ȴ�. �������� ��ȭ�� 0���� 255����*/
		System.out.print("keyCode Ȯ���� ���� �Է�-> ");
		keyCode = System.in.read(); // �Է��� ������ keyCode
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read(); // ����Ű�� keyCode
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read(); // �ٹٲ��� keyCode
		System.out.println("keyCode: " + keyCode);

	}

}
