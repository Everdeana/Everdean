package asg03Ex01;

public class ArithmeticEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 5;
		int v2 = 2;
		
		// 산술 연산자
		int result1 = v1 + v2; // + 연산
		System.out.println("result1=" + result1); // println으로 줄바꿔 출력
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3=" + result3);
		
		int result4 = v1 / v2; // 나누기를 했을 때 몫을 나타냄
		System.out.println("result4=" + result4);
		
		int result5 = v1 % v2; // 나누기를 했을 때 나머지를 나타냄
		System.out.println("result5=" + result5);
		
		double result6 = (double) v1 / v2; // 나누기를 했을 때 소수점 자리가 생길 경우 형변환
		System.out.println("result6=" + result6);
	}

}
