package ch06;

public class AdArrListFor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {90, 88, 87, 91, 92};
		int sum = 0;
	/*	for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		} */
		
		/* ���� for���� �ݺ� �����ϱ� ���� 
		 * ���� ī���� ������ �������� ������� �ʴ´�.
		 * �迭 �� �÷��� �׸��� ���� ��ŭ �ݺ��ϰ� 
		 * �ڵ������� for���� Ż���Ѵ�.*/
		for (int i:scores) {
			sum = sum + i;
		}
		System.out.println("�������=" + sum);
	}

}