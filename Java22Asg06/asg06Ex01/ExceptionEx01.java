package asg06Ex01;

public class ExceptionEx01 {
	// throw�� ���� �޼��忡�� ���� �ҷ����� ���ܸ� ������.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new Exception(); // ������ ���� �߻���Ŵ
		} catch (Exception e) {
			System.out.println("����ó���� ������ �߻����׽��ϴ�.");
		}
		/* throw
		 *  - ����� ���� ���ܿ� ����Ѵ�.
		 *  - ���� try ~ catch�� ����Ѵ�.
		 *  - throw �� �������� � ��ɹ��� ���� �ۼ��� �� ����
		 *  - throw �� ������ statement�� ���� �ۼ��ϸ� �����Ϸ��� ������ �� ������ �߻��Ͽ� 
		 *    ������ �� ���� ���� ǥ���� */
	}
}
