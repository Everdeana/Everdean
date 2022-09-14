package ch03Test;

public class MethodTest01 {

	
	// 클래스 실행하면 main()메서드를 호출해서 실행한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result = add(100, 200);
		System.out.println("결과값=" + result);

	}

	public static long add(long i, long j) {
		// TODO Auto-generated method stub
		long result = i + j;
		return result;
	}

}
