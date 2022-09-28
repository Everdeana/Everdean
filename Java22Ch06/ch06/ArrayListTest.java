package ch06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// ����(sorting) ���α׷� �ۼ�
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ν��Ͻ�(��ü = Ŭ����) ����
		ArrayList<Integer> arrList = new ArrayList<Integer>(10);
		arrList.add(new Integer(5));
		arrList.add(new Integer(4));
		arrList.add(new Integer(2));
		arrList.add(new Integer(0));
		arrList.add(new Integer(1));
		arrList.add(new Integer(3));
		arrList.add(new Integer(9));
		arrList.add(new Integer(11));
		
		for (Integer integer: arrList) { // Java���� ���� for��
			System.out.print(integer + "  ");
		}
		System.out.println();
		
		/* SQL --> select * from mysql order by id desc(asc);
		 * ���������� �ϱ� ���� �ν��Ͻ�(��ü) ����
		 * ���������� ���� Ŭ���� �����Ͽ� ��� */
		Descending descending = new Descending();
		Collections.sort(arrList, descending);
		 
		System.out.println("��������--");
		for (Integer integer : arrList) {
			System.out.print(integer + "  ");
		}
		// ���������� ���� �ν��Ͻ�(��ü) ����
		Ascending ascending = new Ascending();
		Collections.sort(arrList, ascending);
		
		System.out.println();
		System.out.println("��������--");
		for (Integer integer : arrList) {
			System.out.print(integer + "  ");
		}
	}
	
	
}
//�������� Ŭ���� ����
class Descending implements Comparator<Integer> {
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}
}


