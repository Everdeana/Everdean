package ch10;

/* ���� ī�� Ŭ����
 * ���� + ���¹�ȣ(����)*/
public class CheckAccount extends Account {
	// �ʵ� ����
	String cardNo;

	// ������ ����

	// �޼��� ����
	// ���� ī�� ���� --> ����(ī�� ��ȣ ���� Ȯ��, �ܾװ� ��ݾ� Ȯ��)
	int pay(String cardNo, int amount) throws Exception{
		if (!cardNo.equals(this.cardNo) || (balance < amount)) {
			throw new Exception("������ �Ұ����մϴ�.");
		}
		
		return withdraw(amount);
	}
	
}
