package ch10;

public class InteritanceRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckAccount myObj = new CheckAccount(); // �ν��Ͻ�
		myObj.accountno = "12-09-8889";
		myObj.ownerName = "��ź��";
		myObj.cardNo = "345-098-135";
		myObj.deposit(100000);
		
		// ���� ó����
		try {
			int payAmount = myObj.pay("345-098-135", 50000);
			System.out.println("����: " + myObj.ownerName);
			System.out.println("���Ҿ�: " + payAmount);
			System.out.println("�ܾ�: " + myObj.balance);
			
		} catch (Exception e) {
			// TODO: handle exception
			String emsg = e.getMessage();
			System.out.println(emsg);
		}
		
	}

}
