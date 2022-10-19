package ch08;

public class ComputerRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		Calculator myCal = new Calculator(); // 객체 생성(인스턴스)
		System.out.println("원의 면적:" + myCal.areaCircle(r));
		System.out.println();
		Computer myComputer = new Computer();
		// Method Override --> 재정의된 메서드
		System.out.println("원면적:" + myComputer.areaCircle(r));

	}

}