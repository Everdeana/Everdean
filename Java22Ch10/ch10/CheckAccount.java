package ch10;

/* 직불 카드 클래스
 * 직불 + 계좌번호(고객명)*/
public class CheckAccount extends Account {
	// 필드 선언
	String cardNo;

	// 생성자 선언

	// 메서드 선언
	// 직불 카드 사용시 --> 예외(카드 번호 동일 확인, 잔액과 출금액 확인)
	int pay(String cardNo, int amount) throws Exception{
		if (!cardNo.equals(this.cardNo) || (balance < amount)) {
			throw new Exception("지불이 불가능합니다.");
		}
		
		return withdraw(amount);
	}
	
}
