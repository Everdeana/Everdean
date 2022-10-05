package ch07;
/* 싱글톤: 가끔 전체 프로그램에서 단 하나의 객체만 만들도록 보장해야 하는 경우가 있다.
 *  - 단 하나만 생성된다고 해서 이 객체를 싱글톤(Singleton) 이라고 한다. */
// 싱글톤을 사용하려면 클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록 막아야 한다.
public class Singleton01 {
	// 필드 선언
	// 클래스 이름(Singleton01)과 같도록 설정
	private static Singleton01 singleton = new Singleton01(); 

	// 생성자 선언
	Singleton01() {
		
	}
	// 메서드 선언
	static Singleton01 getInstance() {
		return singleton;
	}
}
