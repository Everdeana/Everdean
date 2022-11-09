package ch10;

public class InteritanceRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckAccount myObj = new CheckAccount(); // 인스턴스
		myObj.accountno = "12-09-8889";
		myObj.ownerName = "방탄이";
		myObj.cardNo = "345-098-135";
		myObj.deposit(100000);
		
		// 예외 처리문
		try {
			int payAmount = myObj.pay("345-098-135", 50000);
			System.out.println("고객명: " + myObj.ownerName);
			System.out.println("지불액: " + payAmount);
			System.out.println("잔액: " + myObj.balance);
			
		} catch (Exception e) {
			// TODO: handle exception
			String emsg = e.getMessage();
			System.out.println(emsg);
		}
		
	}

}
