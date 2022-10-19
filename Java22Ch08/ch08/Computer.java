package ch08;

/*	Calculator 클래스를 상속 받는다.
 * 	메서드를 Override 한다.*/
public class Computer extends Calculator{
// 마우스 오른쪽 버튼 클랙 --> source --> Override/Implement Methods
	@Override
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer 객체의 areaCircle() 실행!");
		return Math.PI * r * r;
	}
	
}
