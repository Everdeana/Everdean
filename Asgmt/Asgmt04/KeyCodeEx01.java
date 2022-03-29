package Asgmt04;

public class KeyCodeEx01 {

	public static void main(String[] args) throws Exception {
		// throws Exception을 이용하여 예외 처리를 해준다. throw Exception은 예외 내용을 출력하는 코드이다.
		// TODO Auto-generated method stub
		int keyCode; // 키보드로 입력받은 값을 저장할 변수 선언
		
		/* System.in.read()로 입력받을 경우 콘솔창에 엔터를 입력하기 전까지 대기한다. */
		keyCode = System.in.read(); // 콘솔에 입력한 key의 keyCode
		System.out.println("keyCode: " + keyCode);

		keyCode = System.in.read(); // Enter키의 keyCode
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read(); // 줄바꿈의 keyCode
		System.out.println("keyCode: " + keyCode);

	}

}
