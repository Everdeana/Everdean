package ch07;

public class KoreanRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("방탄이", "100000-1099999"); 
		/* Korean객체를 새로만들어서 
		만든 객체의 이름을 k1 --> 인스턴스    */
		Korean k2 = new Korean("김길동", "200000-2009001"); 
		// k2.nation = "USA"; --> error
		System.out.println("이름:" + k1.name);
		System.out.println("k1.ssn=" + k1.ssn);
		System.out.println("이름:" + k2.name);
		//System.out.println("국가:" + k2.nation); --> error

	}

}