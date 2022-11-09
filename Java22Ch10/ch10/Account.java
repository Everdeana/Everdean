package ch10;

/* 은행 업무 관리 프로그램 --> 설계
 * 이름, 계좌번호(12-9092-09), 잔액  */ 
public class Account {
	
	// 필드 선언
	String accountno;
	String ownerName;
	int balance;
	// 생성자 선언
	Account() {
		
	}
	
	// 메서드 선언
	void deposit(int amount) { // 통장 잔액 처리 메서드
		balance = balance + amount;
		// balance += amount;
	}
	int withdraw(int amount) throws Exception {	// 출금 처리 메서드
		// 주의: 잔액보다 출금금액이 클 경우 --> 예외 처리
		if (balance < amount) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance = balance - amount;
		return balance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}