package ch10;

/* ���� ���� ���� ���α׷� --> ����
 * �̸�, ���¹�ȣ(12-9092-09), �ܾ�  */ 
public class Account {
	
	// �ʵ� ����
	String accountno;
	String ownerName;
	int balance;
	// ������ ����
	Account() {
		
	}
	
	// �޼��� ����
	void deposit(int amount) { // ���� �ܾ� ó�� �޼���
		balance = balance + amount;
		// balance += amount;
	}
	int withdraw(int amount) throws Exception {	// ��� ó�� �޼���
		// ����: �ܾ׺��� ��ݱݾ��� Ŭ ��� --> ���� ó��
		if (balance < amount) {
			throw new Exception("�ܾ��� �����մϴ�.");
		}
		balance = balance - amount;
		return balance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}