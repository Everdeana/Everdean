package ch03Test;

public class MethodTest01 {

	
	// Ŭ���� �����ϸ� main()�޼��带 ȣ���ؼ� �����Ѵ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result = add(100, 200); // add() �ż��� ȣ��
		System.out.println("�����=" + result);
		
		addPoint(5, 10);

	}
	
	/*	��ȯ ������ Ÿ���� long
	 * 	�޼��� �̸�: add()
	 * 	�Ű����� long i, long j�� ���� */
	public static long add(long i, long j) {
		// TODO Auto-generated method stub
		long result = i + j;
		return result;
	}
	
	// ��ȯ ������ Ÿ�� ��ſ� void
	public static void addPoint(long n1, long n2){ // return ���� ������ void
		long result = n1 + n2;
		System.out.println("�ι�° �����=" + result);
	}

}
