package asg03Ex02;

public class ForEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int m = 2; m <= 9; m++) { // 2���� 9���� 8�� ���� ���ϸ鼭 �ݺ�
			System.out.println("***" + m + "�� ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m * n));		
			}	
		}
	}
}
