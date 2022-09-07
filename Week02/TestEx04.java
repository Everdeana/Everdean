package ch02Test;

public class TestEx04 {
	// 프로그램을 실행하기 위해 진입하기 위한 지점
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int keyCode;
		// Scanner()
		keyCode = System.in.read();
		/* System.in.read()는 입력되너 처리되는 값을 바이트로 처리  
		 * 이때 리턴되는 값은 정수로 처리된다. 정수값의 변화는 0에서 255사이*/
		System.out.println("keyCode: " + keyCode);
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
	}

}
