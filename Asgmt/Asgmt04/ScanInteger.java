package Asgmt04;

import java.util.*;

public class ScanInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드와 연결된 표준 입력 스트림(System.in)
		Scanner stdIn = new Scanner(System.in); // 데이터 타입의 일종인 Scanner
		
		System.out.print("정수값을 입력하시오: ");
		/* 키보드를 통해 입력한 정수값을 받는다
		 * 키보드를 통해 double형인 실수값을 입력받을 때 nextDouble() */
		int x = stdIn.nextInt(); //  
		System.out.println(x + "를 입력했습니다.");
	}

}
