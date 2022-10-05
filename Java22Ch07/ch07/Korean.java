package ch07;

/* 대한민국 국민 정보 관리 시스템 개발 
 * 대한민국 국민 정보 설계   */ 
public class Korean {  /* 대한민국 내 거주하는 국민의 정보 클래스 선언 */ 
	
	/* 필드선언  */
	private static String nation = "korea"; 
	String name; /* 성명  */ 
	String ssn; /* 주민번호  */
	
	/* 생성자(constructor) 선언   */
	Korean(String name, String ssn){
		this.name = name; 
		this.ssn = ssn; 
	}
	/* 메서드(method) 선언  */ 
}