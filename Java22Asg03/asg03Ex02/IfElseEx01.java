package asg03Ex02;

import java.util.Scanner;

public class IfElseEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int score = stdIn.nextInt();
		if(score >= 90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A �Դϴ�.");
		} else {
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B �Դϴ�.");
		}
	}

}
/*	<< �Ʒ� ������ Ű���� �Է� ��ɰ� if ~ else ������ �����Ͽ� ���� ���� �ۼ� >>
 * 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		
		if(score >= 90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A �Դϴ�.");
		} else {
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B �Դϴ�.");
		}
	} */