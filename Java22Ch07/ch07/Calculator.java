package ch07;

// ���� ���α׷� �ۼ�
public class Calculator { // ���� ���� Ŭ���� ����
	// �ʵ� ����

	// ������ ����

	// �޼��� ����
	// 1. ���� ON
	void powerOn() {
		System.out.println("������ ON �մϴ�.");
	}
	// 2. + ���� ó��
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	// 3. - ���� ó��
	int minus(int x, int y) {
		int result = x - y;
		return result;
	}
	// 4. * ���� ó��
	int multiplication(int x, int y) {
		int result = x * y;
		return result;
	}
	// 5. / ���� ó��
	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}
	// 6. % ���� ó��
	int remainder(int x, int y) {
		int result = x % y;
		return result;
	}
	// 7. ���� OFF
	void powerOff() {
		System.out.println("������ OFF �մϴ�.");
	}
}
