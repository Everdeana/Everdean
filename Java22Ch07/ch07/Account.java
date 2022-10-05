package ch07;

/* 은행 계좌 클래스에 계좌 필드와 toString 메서드를 추가해서
 * 계좌 개설 없이 출력되도록 처리하는 프로그램
 * 계좌 관리 프로그램 */
public class Account { // 계좌 정보 설계 클래스
	// 필드 선언
	private String name; // 계좌 명의
	private String no; // 계좌 번호
	private long balance; // 잔액(잔고)
	private Day openDay; // 계좌 개설일
	
	// 생성자 선언
	Account(String n, String num, long z, Day d){
		name = n; // 계좌 명의
		no = num; // 계좌 번호
		balance = z; // 잔액(잔고)
		openDay = new Day(d); // 계좌 개설일
		
	}
	
	// 메서드 선언
	// 계좌 명의 확인
	String getName() {
		return name;
	}
	// 계좌 번호 확인
	String getNo() {
		return no;
	}
	// 잔액 확인
	public long getBalance() {
		return balance;
	}
	// 계좌 개설일 확인
	public Day getOpenDay() {
		return new Day(openDay);
	}
	// 입출금에 대한 메서드 선언
	void deposit(long k) {
		balance = balance + k; // 입금
	}
	
	void withdraw(long k) {
		balance = balance - k; // 출금
	}
	public String toString() {
		return "{" + name + ", " + no + ", " + balance + "=}";
	}
}
