package ch07;

/* 은행 계좌 클래스에 계좌 필드와 toString 메서드를 추가해서
 * 계좌 개설 없이 출력되도록 처리하는 프로그램
 * 계좌 관리 프로그램 */
public class Account { // 계좌 정보 설계 클래스
	private String name; // 계좌 명의
	private String no; // 계좌 번호
	private long balance; // 잔액(잔고)
	private Day openDay; // 계좌 개설일
}
