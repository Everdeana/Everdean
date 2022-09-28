package ch05;
// 스마트 학과 학생 정보 관리 프로그램 작성

public class SmartST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	인스턴스 생성 :  클래스의 실체를 생성하기 위해 new 클래스명() 형식을 사용
		/*	클래스와 배열은 모두 new를 사용해서 동적으로 생성한다.
		 *	이와 같이 프로그램 실행 시 동적으로 생성하는 실체를 "객체" 라고 한다.
		 *	StudentDw행의 인스턴스(kim)는 이름, 나이, 신장, 체중
		 *	이 하나의 세트로 구성된 (객체)변수이다.
		 *	그 안에 있는 특정 필드에 접근하려면 멤버 접근연산자(.)를 사용한다. */
		 
		StudentDw kim = new StudentDw();
		kim.name = "스마트";
		kim.age = 22;
		kim.height = 170;
		kim.weight = 60;
		/* 문제 발견
		 * 	1. 클래스 도입에 초기화된 위험성
		 * 	->  인스턴스의 각 필드에 값을 설정하는 것을 잊는 경우,
		 * 		예상치 못한 결과가 발생할 수 있다.
		 * 		초기화해야 할 필드는 초기화 강제로 해야만 한다.
		 *  2. 데이터보호와 관련된 위험성
		 *  ->	kim.name의 값은 프로그램(다른 클래스)이 자유롭게 변경할 수 있다.
		 *  	이것을 생각해 보면 다른 사람이 이름을 변경할 수 있는 상황 같다.
		 *  	일반적으로 이름을 공개하는 경우가 있지만
		 *  	다른 사람이 변경할 수 있는 상태 공개되지는 않는다. */
		
		System.out.println("이름 = " + kim.name);
		System.out.println("나이 = " + kim.age);
		System.out.println("신장 = " + kim.height);
		System.out.println("체중 = " + kim.weight);

	}

}