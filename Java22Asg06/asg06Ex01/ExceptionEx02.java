package asg06Ex01;

public class ExceptionEx02 {
	// throws는 현재 메서드에서 상위 메서드로 예외를 던진다.
	public static void trsTest() throws Exception{
		int a = 2/0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ExceptionEx02.trsTest(); // 이 함수에서 예외 처리를 한다.
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("메서드를 호출하는 main 메서드에 예외 처리를 전가한다.");
		}
		/* throws
		 *  - 메서드의 서명 뒤에 나타나며 메서드에 발생할 수 있는 예외 클래스 목록을 포함할 수 있음. */
	}
}
