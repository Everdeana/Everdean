package ch07;

public class KoreanRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("��ź��", "100000-1099999"); 
		/* Korean��ü�� ���θ��� 
		���� ��ü�� �̸��� k1 --> �ν��Ͻ�    */
		Korean k2 = new Korean("��浿", "200000-2009001"); 
		// k2.nation = "USA"; --> error
		System.out.println("�̸�:" + k1.name);
		System.out.println("k1.ssn=" + k1.ssn);
		System.out.println("�̸�:" + k2.name);
		//System.out.println("����:" + k2.nation); --> error

	}

}