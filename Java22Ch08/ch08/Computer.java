package ch08;

/*	Calculator Ŭ������ ��� �޴´�.
 * 	�޼��带 Override �Ѵ�.*/
public class Computer extends Calculator{
// ���콺 ������ ��ư Ŭ�� --> source --> Override/Implement Methods
	@Override
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer ��ü�� areaCircle() ����!");
		return Math.PI * r * r;
	}
	
}
