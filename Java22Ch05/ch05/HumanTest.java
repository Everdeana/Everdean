package ch05;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인스턴스 생성 - 객체(클래스)
		/* HumanAd kim = new HumanAd();
		 * The constructor HumanAd() is undefined
		 * HumanAd 클래스의 생성자로 접근 */
		HumanAd kim = new HumanAd("방탄", 170, 66);
		HumanAd lee = new HumanAd("핑크", 160, 50);
		// kim.gainWeight(10);
		
		System.out.println("이름:" + kim.getName());
		System.out.println("신장:" + kim.getHeight() + "cm");
		System.out.println("체중:" + kim.getWeight() + "kg");
		kim.gainWeight(10);
		System.out.println("김씨의 채중변화입니다." + kim.gainWeight(0));
		System.out.println("이름:" + lee.getName());
		System.out.println("신장:" + lee.getHeight() + "cm");
		System.out.println("체중:" + lee.getWeight() + "kg");
		lee.reduceWeight(5);
		System.out.println("이씨의 채중변화입니다." + lee.reduceWeight(0));
	}
}
