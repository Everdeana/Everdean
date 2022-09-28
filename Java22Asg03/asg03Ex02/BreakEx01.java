package asg03Ex02;

public class BreakEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			int num = (int)(Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
