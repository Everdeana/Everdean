package asg06Ex01;

public class CompareEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 10;
		// True/False Ȯ�� ���� boolean���� ������ ����
		boolean result1 = (num1 == num2); // ����
		boolean result2 = (num1 != num2); // ���� �ʴ�
		boolean result3 = (num1 <= num2); // num1�� num2���� �۰ų� ����
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		int code1 = (int ) char1; // A�� B(���� - char)�� ũ�� �񱳴� � ������� �ϴ°�?
		int code2 = (int ) char2; // char�� ���ڸ� ������ �ڵ�� ������
		boolean result4 = (char1 < char2); // ���� A�� B���� �۴�
		System.out.println("result4=" + result4);
		System.out.println("����" + char1 + "�� ���� " + code1);
		System.out.println("����" + char2 + "�� ���� " + code2);
		/* char�� ���ڸ� ���������� ������ �ڵ�� �����ϱ� ������ 
		 * ������ ( byte, short , int ,long )�� ������ ���谡 �ִ�. */
		// char�� �ڹٿ��� �����ڵ�(2 byte ����ü��)�� ����ϹǷ� 2 byte �̴�. 
	}

}
