package ch07;
/* �̱���: ���� ��ü ���α׷����� �� �ϳ��� ��ü�� ���鵵�� �����ؾ� �ϴ� ��찡 �ִ�.
 *  - �� �ϳ��� �����ȴٰ� �ؼ� �� ��ü�� �̱���(Singleton) �̶�� �Ѵ�. */
// �̱����� ����Ϸ��� Ŭ���� �ܺο��� new �����ڷ� �����ڸ� ȣ���� �� ������ ���ƾ� �Ѵ�.
public class Singleton01 {
	// �ʵ� ����
	// Ŭ���� �̸�(Singleton01)�� ������ ����
	private static Singleton01 singleton = new Singleton01(); 

	// ������ ����
	Singleton01() {
		
	}
	// �޼��� ����
	static Singleton01 getInstance() {
		return singleton;
	}
}
