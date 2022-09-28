package ch06;

public class AdArrListFor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {90, 88, 87, 91, 92};
		int sum = 0;
	/*	for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		} */
		
		/* 향상된 for문은 반복 실행하기 위헤 
		 * 루프 카운터 변수와 증감식을 사용하지 않는다.
		 * 배열 및 컬렉션 항목의 개수 만큼 반복하고 
		 * 자동적으로 for문을 탈출한다.*/
		for (int i:scores) {
			sum = sum + i;
		}
		System.out.println("총점결과=" + sum);
	}

}