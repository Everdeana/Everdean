package ch08;

public class ComputerRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		Calculator myCal = new Calculator(); // ��ü ����(�ν��Ͻ�)
		System.out.println("���� ����:" + myCal.areaCircle(r));
		System.out.println();
		Computer myComputer = new Computer();
		// Method Override --> �����ǵ� �޼���
		System.out.println("������:" + myComputer.areaCircle(r));

	}

}