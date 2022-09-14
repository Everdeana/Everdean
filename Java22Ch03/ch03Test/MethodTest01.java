package ch03Test;

public class MethodTest01 {

	
	// 클래스 실행하면 main()메서드를 호출해서 실행한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result = add(100, 200); // add() 매서드 호출
		System.out.println("결과값=" + result);
		
		addPoint(5, 10);

	}
	
	/*	반환 데이터 타입은 long
	 * 	메서드 이름: add()
	 * 	매개변수 long i, long j로 정의
	 */
	public static long add(long i, long j) {
		// TODO Auto-generated method stub
		long result = i + j;
		return result;
	}
	
	public static void addPoint(long n1, long n2){ // return 하지 않으면 void
		long result = n1 + n2;
		System.out.println("두번째 결과값=" + result);
	}

}
