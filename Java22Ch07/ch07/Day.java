package ch07;

public class Day {
	// 필드 선언--> 년, 원, 일로 구성되고 모두 비공개 int형 필드로 1을 초기값으로 설정
	private int year = 1;
	private int month = 1;
	private int date = 1;
	
	// 생성자 선언
	public Day() {
		
	}
	public Day(int year) {
		this.year = year;
	}
	// year년 1월 1일로 초기화
	public Day(int year, int month) {
		this.year = year;
		this.month = month;
	}
	public Day(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	public Day(Day d) {
		this(d.year, d.month, d.date);
	}
	

	// 메서드 선언
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDate() {
		return date;
	}
	// 년, 월, 일 설정하는 메서드
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setDate(int date) {
		this.date = date;
	}
	
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	// 요일 찾기 메서드 --> 요일을 찾는 메서드로 일요일 부터 토요일 까지 0부터 6까지의 값으로 반환한다.
	// 공식: 1592년 10월 15일 이후의 요일에만 적용되는 공식 --> 그레고리안 달력 공식
	public int dayOfWeek() {
		int y = year; // 0 --> 일요일, 1 --> 월요일
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m = m + 12;
		}
		return(y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}
	/* 자신의 날짜와 매개변수 d로 받은 날짜를 비교하는 메서드 선언
	 * --> 년, 월, 일이 모두 같으면 true, 그렇지 않으면 false 반환 */
	
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}
	
	// 문자열 표현 반환 --> 문자열 년은 4자리, 월과 일은 2자리 --> String.format 메서드 사용
	public String toString() {
		String[] wd = {"알", "월", "화", "수", "목", "금", "토"};
		return String.format("%04d년 %02d월 %02d일(%s)", year, month, date, wd[dayOfWeek()]);
	}
		
}
