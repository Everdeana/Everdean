package ch07;

/* 자료구조(Data Structure)
 *  - 데이터를 효율적으로 사용하기 위해서 구조를 만들어서 저장하는 곳
 * 자료구조의 종류
 *  - 리스트(List): 배열리스트(Array List), 연결리스트(Linked List)
 *  - 스택(Stack)
 *  - 큐(Queue)
 *  - 해쉬 테이블(HashTable)
 *  - 집합 --> 엄밀히 말하면 자료구조는 아님
 * 객체와 클래스
 *  - 객체: 효율적으로 정보를 관리하기 위해 사람이 의미를 부여하고 분류하는 논리적 단위
 *  - 클래스: 객체를 생성하는 탬플릿. 필드와 연산(메서드)을 가짐
 *  - 인스턴스(Instance = 객체): 클래스로부터 생성된 객체
 *    --> 중요) 정보처리의 주체는 클래스가 아니라 인스턴스이다.
 *  - 필드: 속성(Attribute)을 나타내는 데이터 
 *  - 생성자: 필드를 초기화 하는 것
 *  - 메서드: 데이터를 변경하거나 조작할 수 있는 것 */
public class CalculatorRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 10);
		System.out.println("+ 연산 결과=" + result1);
		
		double result2 = myCalc.remainder(11, 4);
		System.out.println("% 연산 결과=" + result2);
		
		byte x = 11;
		byte y = 3;
		double result3 = myCalc.divide(x, y);
		System.out.println("/ 연산 결과=" + result3);
		
		myCalc.powerOff();
	}

}
