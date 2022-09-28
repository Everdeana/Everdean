package ch06;

import java.util.ArrayList;

/*	ArrayList 클래스에서 List : 데이터를 일렬로 늘어놓은 자료구조
 * 	리스트로 사용할 수 있는 클래스 : ArrayList 클래스와 LinkedList 클래스 */

public class ArrayList01 {

	// 프로그램을 실행하는 진입점
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		// 인스턴스 생성
		list.add("포도");
		list.add("사과");
		list.add("배");
		list.add("복숭아");
		
		// String[] list = new String[3];
		int num = list.size();
		System.out.println("리스트의 원소 수: " + num);
		for (int i = 0; i < num; i++) {
			String str = list.get(i);
			System.out.println("리스트에 저장된 원소: " + str);
		}
	}

}