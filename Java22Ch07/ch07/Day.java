package ch07;

public class Day {
	// �ʵ� ����--> ��, ��, �Ϸ� �����ǰ� ��� ����� int�� �ʵ�� 1�� �ʱⰪ���� ����
	private int year = 1;
	private int month = 1;
	private int date = 1;
	
	// ������ ����
	public Day() {
		
	}
	public Day(int year) {
		this.year = year;
	}
	// year�� 1�� 1�Ϸ� �ʱ�ȭ
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
	

	// �޼��� ����
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDate() {
		return date;
	}
	// ��, ��, �� �����ϴ� �޼���
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
	// ���� ã�� �޼��� --> ������ ã�� �޼���� �Ͽ��� ���� ����� ���� 0���� 6������ ������ ��ȯ�Ѵ�.
	// ����: 1592�� 10�� 15�� ������ ���Ͽ��� ����Ǵ� ���� --> �׷����� �޷� ����
	public int dayOfWeek() {
		int y = year; // 0 --> �Ͽ���, 1 --> ������
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m = m + 12;
		}
		return(y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}
	/* �ڽ��� ��¥�� �Ű����� d�� ���� ��¥�� ���ϴ� �޼��� ����
	 * --> ��, ��, ���� ��� ������ true, �׷��� ������ false ��ȯ */
	
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}
	
	// ���ڿ� ǥ�� ��ȯ --> ���ڿ� ���� 4�ڸ�, ���� ���� 2�ڸ� --> String.format �޼��� ���
	public String toString() {
		String[] wd = {"��", "��", "ȭ", "��", "��", "��", "��"};
		return String.format("%04d�� %02d�� %02d��(%s)", year, month, date, wd[dayOfWeek()]);
	}
		
}
