package ch07;

// 계산기 프로그램 작성
public class Calculator { // 계산기 설계 클래스 선언
	// 필드 선언

	// 생성자 선언

	// 메서드 선언
	// 1. 전원 ON
	void powerOn() {
		System.out.println("전원을 ON 합니다.");
	}
	// 2. + 연산 처리
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	// 3. - 연산 처리
	int minus(int x, int y) {
		int result = x - y;
		return result;
	}
	// 4. * 연산 처리
	int multiplication(int x, int y) {
		int result = x * y;
		return result;
	}
	// 5. / 연산 처리
	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}
	// 6. % 연산 처리
	int remainder(int x, int y) {
		int result = x % y;
		return result;
	}
	// 7. 전원 OFF
	void powerOff() {
		System.out.println("전원을 OFF 합니다.");
	}
}
