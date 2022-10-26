package exam02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/* 고객 포인터 누적 관리 프로그램 (고객명: 포인트)
 * Hash Map : {키: 값}으로 구성된 자료 구조 
 * 맵이라는 것은 키(Key)와 값(Value) 두 쌍으로 
 * 데이터를 보관하는 자료구조.
 * Python : Dictionary 구조  와 유사 
 * 해시맵은 이름 그대로 해싱(Hashing)된 맵(Map)이다. 
맵이라는 것은 키(Key)와 값(Value) 두 쌍으로 데이터를 보관하는 자료구조. 
여기서 키는 맵에 오직 유일하게 있어야한다. 
같은 맵에 두 개 이상의 키가 존재하면 안된다는 것이다. 
이름 그대로 열쇠이기 때문에 그 열쇠로 짝인 값(Value)를 찾아야하기 때문이다. 
값은 중복된 값이어도 상관이 없다. 
 *  */ 
public class CustomerManagement {
	/* 필드 선언 */ 
	/* 생성자 선언  */ 
	/*  메서드 선언  */
	public static void printMap(HashMapmap ){
		Set keys = map.keySet(); 
		Iterator it = keys.iterator(); 
		while(it.hasNext()) {
			String name = it.next(); /* 고객명 */ 
			int point = map.get(name); /* 포인트  */ 
			System.out.println("("+name+"," + point+")");
			//System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) throws Exception{ /* 예외 처리 문   */ 
		// TODO Auto-generated method stub
		/* 고객명과 포인트 저장을 위한 객체 map 선언   */ 
		HashMap map = new HashMap();
		System.out.println("포인트 관리 프로그램입니다. ");
		Scanner scanner = new Scanner(System.in);  /* 키보드 입력  */
		System.out.println();
		while(true) {
			System.out.println("이름과 포인트를 입력하세요:");
			String name = scanner.next(); 
			if(name.equals("exit")) {
				System.out.println("프로그램 종료");
				break; 
			}
			int point = scanner.nextInt(); 
			Integer n = map.get(name); 
			if(n !=null) {
				point = point + n;  /*  누적 포인트 계산 표현식 */ 
			}
			map.put(name, point); 
			printMap(map); 
		}
		System.out.println("전체프로그램을 종료합니다. ");
		scanner.close();
	}

}

