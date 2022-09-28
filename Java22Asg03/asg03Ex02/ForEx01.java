package asg03Ex02;

public class ForEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 1; // i를 for문 밖에 선언해야 마지막 출력 문에서 사용할 수 있다.  
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		
		// System.out.println("1 ~ 100 합: " + sum);
		System.out.println("1~" + (i - 1) + "합:" + sum);

	}

}
