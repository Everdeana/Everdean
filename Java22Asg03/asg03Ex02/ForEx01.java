package asg03Ex02;

public class ForEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 1; // i�� for�� �ۿ� �����ؾ� ������ ��� ������ ����� �� �ִ�.  
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		
		// System.out.println("1 ~ 100 ��: " + sum);
		System.out.println("1~" + (i - 1) + "��:" + sum);

	}

}
