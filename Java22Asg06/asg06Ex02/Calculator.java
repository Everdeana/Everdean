package asg06Ex02;

public class Calculator { // ���� ���� Ŭ���� ����
	// �ʵ� ����

	// ������ ����

	// �޼��� ����
	// 1. + ���� ó��
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	// 2. - ���� ó��
	int minus(int x, int y) {
		int result = x - y;
		return result;
	}
	// 3. * ���� ó��
	int multiplication(int x, int y) {
		int result = x * y;
		return result;
	}
	// 4. / ���� ó��
	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}
	// 5. % ���� ó��
	int remainder(int x, int y) {
		int result = x % y;
		return result;
	}
}
