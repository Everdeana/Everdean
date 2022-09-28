package asg03Ex02;

import java.util.Scanner; // java의 util 패키지에서 Scanner 라이브러리 호출

public class LoginEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner 클래스를 사용하기 위해 변수 선언(같은 Scanner Type으로 선언)
		Scanner stdIn = new Scanner(System.in); // 입력되는 값은 시스템에 입력된다.
		
		System.out.print("아이디:"); // 줄 바꾸지 않고 입력받도록 한다.
		String name = stdIn.nextLine(); // 아이디를 name에 저장
		/* 공백 문자(space)를 입력하기 전까지의 문자를 입력받는 next가 아니라
		 * 엔터키를 입력하기 전까지의 문자를 입력받는 nextLine을 사용한다. */
		
		System.out.print("패스워드:");
		String pwd = stdIn.nextLine(); // 비밀번호를 pwd에 저장
		/* 공백 문자(space)를 입력하기 전까지의 문자를 입력받는 next가 아니라
		 * 엔터키를 입력하기 전까지의 문자를 입력받는 nextLine을 사용한다. */
		
		int pass = Integer.parseInt(pwd); // 입력받은 문자열을 정수형 타입으로 형변환시켜준다.
		
		if(name.equals("java")) { // 아이디가 설정한 문자열과 같은 경우
			if(pass == 12345) { // 비밀번호가 설정한 정수값과 같은 경우
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패: 패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패: 아이디가 존재하지 않음");
		}
	}
}