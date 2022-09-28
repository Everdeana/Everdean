package asg03Ex02;

public class ForEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int m = 2; m <= 9; m++) { // 2에서 9까지 8번 값이 변하면서 반복
			System.out.println("***" + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m * n));		
			}	
		}
	}
}
