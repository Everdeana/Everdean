package asg03Ex01;

public class KeyCodeEx01 {

	// 값이 입력되지 않았을 경우 예외처리를 한다. throws Exception은 예외 내용을 출력해 준다.
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int keyCode;
		/* System.in.read()는 입력되어 처리되는 값을 바이트로 처리  
		 * 이때 리턴되는 값은 정수로 처리된다. 정수값의 변화는 0에서 255사이*/
		System.out.print("keyCode 확인할 문자 입력-> ");
		keyCode = System.in.read(); // 입력한 문자의 keyCode
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read(); // 엔터키의 keyCode
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read(); // 줄바꿈의 keyCode
		System.out.println("keyCode: " + keyCode);

	}

}
