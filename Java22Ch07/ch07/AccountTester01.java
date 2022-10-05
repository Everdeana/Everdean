package ch07;

public class AccountTester01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day d = new Day(2022, 10, 05);
		Account bts = new Account("πÊ≈∫", "123456", 100, d);
		Day p = bts.getOpenDay();
		System.out.println("∞Ë¡¬ ∞≥º≥¿œ=" + p);
	}

}