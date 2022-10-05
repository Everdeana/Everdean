package ch07;

/* ���� ���� Ŭ������ ���� �ʵ�� toString �޼��带 �߰��ؼ�
 * ���� ���� ���� ��µǵ��� ó���ϴ� ���α׷�
 * ���� ���� ���α׷� */
public class Account { // ���� ���� ���� Ŭ����
	// �ʵ� ����
	private String name; // ���� ����
	private String no; // ���� ��ȣ
	private long balance; // �ܾ�(�ܰ�)
	private Day openDay; // ���� ������
	
	// ������ ����
	Account(String n, String num, long z, Day d){
		name = n; // ���� ����
		no = num; // ���� ��ȣ
		balance = z; // �ܾ�(�ܰ�)
		openDay = new Day(d); // ���� ������
		
	}
	
	// �޼��� ����
	// ���� ���� Ȯ��
	String getName() {
		return name;
	}
	// ���� ��ȣ Ȯ��
	String getNo() {
		return no;
	}
	// �ܾ� Ȯ��
	public long getBalance() {
		return balance;
	}
	// ���� ������ Ȯ��
	public Day getOpenDay() {
		return new Day(openDay);
	}
	// ����ݿ� ���� �޼��� ����
	void deposit(long k) {
		balance = balance + k; // �Ա�
	}
	
	void withdraw(long k) {
		balance = balance - k; // ���
	}
	public String toString() {
		return "{" + name + ", " + no + ", " + balance + "=}";
	}
}
