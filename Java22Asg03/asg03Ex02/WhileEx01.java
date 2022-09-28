package asg03Ex02;

public class WhileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 1;
		
		while (i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i - 1) + "гу:" + sum);
	}
}
