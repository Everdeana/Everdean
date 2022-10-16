package asg06Ex01;

public class ExceptionEx01 {
	// throw는 현재 메서드에서 상위 불럭으로 예외를 던진다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new Exception(); // 강제로 에외 발생시킴
		} catch (Exception e) {
			System.out.println("예외처리를 강제로 발생시켰습니다.");
		}
		/* throw
		 *  - 사용자 정의 예외에 사용한다.
		 *  - 보통 try ~ catch에 사용한다.
		 *  - throw 문 다음에는 어떤 명령문도 직접 작성할 수 없음
		 *  - throw 문 다음에 statement를 직접 작성하면 컴파일러는 컴파일 중 오류가 발생하여 
		 *    연결할 수 없는 문을 표시함 */
	}
}
