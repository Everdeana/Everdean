package ch06;

import java.util.ArrayList;

// ArrayList �ȿ� �����͸� ���� / ���� / ����
public class ArrayList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>(); 
		// �ν��Ͻ� ����
		list.add("Python");
		list.add("Java");
		list.add("JavaScript");
		list.set(2, "HTML");
		// list.remove(1);
		list.add("C Language");
		list.add("C#");
		list.add("HTML");
		int index1 = list.indexOf("HTML");
		int index2 = list.lastIndexOf("HTML");
		
		
		int num = list.size();
		for (int cnt = 0; cnt < num; cnt++) {
			String str = list.get(cnt);
			System.out.println("�Էµ� ����Ʈ[" + cnt + "] = " + str);
		}
		System.out.println("First HTML: " + index1);
		System.out.println("Last HTML: " + index2);
	}

}
