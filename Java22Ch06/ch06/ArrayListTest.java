package ch06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// 정렬(sorting) 프로그램 작성
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인스턴스(객체 = 클래스) 생성
		ArrayList<Integer> arrList = new ArrayList<Integer>(10);
		arrList.add(new Integer(5));
		arrList.add(new Integer(4));
		arrList.add(new Integer(2));
		arrList.add(new Integer(0));
		arrList.add(new Integer(1));
		arrList.add(new Integer(3));
		arrList.add(new Integer(9));
		arrList.add(new Integer(11));
		
		for (Integer integer: arrList) { // Java에서 향상된 for문
			System.out.print(integer + "  ");
		}
		System.out.println();
		
		/* SQL --> select * from mysql order by id desc(asc);
		 * 내림차순을 하기 위한 인스턴스(객체) 생성
		 * 내림차순을 위한 클래스 선언하여 사용 */
		Descending descending = new Descending();
		Collections.sort(arrList, descending);
		 
		System.out.println("내림차순--");
		for (Integer integer : arrList) {
			System.out.print(integer + "  ");
		}
		// 오름차순을 위한 인스턴스(객체) 생성
		Ascending ascending = new Ascending();
		Collections.sort(arrList, ascending);
		
		System.out.println();
		System.out.println("오름차순--");
		for (Integer integer : arrList) {
			System.out.print(integer + "  ");
		}
	}
	
	
}
//내림차순 클래스 선언
class Descending implements Comparator<Integer> {
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}
}


