package ch05;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ν��Ͻ� ���� - ��ü(Ŭ����)
		/* HumanAd kim = new HumanAd();
		 * The constructor HumanAd() is undefined
		 * HumanAd Ŭ������ �����ڷ� ���� */
		HumanAd kim = new HumanAd("��ź", 170, 66);
		HumanAd lee = new HumanAd("��ũ", 160, 50);
		// kim.gainWeight(10);
		
		System.out.println("�̸�:" + kim.getName());
		System.out.println("����:" + kim.getHeight() + "cm");
		System.out.println("ü��:" + kim.getWeight() + "kg");
		kim.gainWeight(10);
		System.out.println("�达�� ä�ߺ�ȭ�Դϴ�." + kim.gainWeight(0));
		System.out.println("�̸�:" + lee.getName());
		System.out.println("����:" + lee.getHeight() + "cm");
		System.out.println("ü��:" + lee.getWeight() + "kg");
		lee.reduceWeight(5);
		System.out.println("�̾��� ä�ߺ�ȭ�Դϴ�." + lee.reduceWeight(0));
	}
}
