package ch06;

import java.util.ArrayList;

/*	ArrayList Ŭ�������� List : �����͸� �Ϸķ� �þ���� �ڷᱸ��
 * 	����Ʈ�� ����� �� �ִ� Ŭ���� : ArrayList Ŭ������ LinkedList Ŭ���� */

public class ArrayList01 {

	// ���α׷��� �����ϴ� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		// �ν��Ͻ� ����
		list.add("����");
		list.add("���");
		list.add("��");
		list.add("������");
		
		// String[] list = new String[3];
		int num = list.size();
		System.out.println("����Ʈ�� ���� ��: " + num);
		for (int i = 0; i < num; i++) {
			String str = list.get(i);
			System.out.println("����Ʈ�� ����� ����: " + str);
		}
	}

}