package ch07;

/* �ڷᱸ��(Data Structure)
 *  - �����͸� ȿ�������� ����ϱ� ���ؼ� ������ ���� �����ϴ� ��
 * �ڷᱸ���� ����
 *  - ����Ʈ(List): �迭����Ʈ(Array List), ���Ḯ��Ʈ(Linked List)
 *  - ����(Stack)
 *  - ť(Queue)
 *  - �ؽ� ���̺�(HashTable)
 *  - ���� --> ������ ���ϸ� �ڷᱸ���� �ƴ�
 * ��ü�� Ŭ����
 *  - ��ü: ȿ�������� ������ �����ϱ� ���� ����� �ǹ̸� �ο��ϰ� �з��ϴ� ���� ����
 *  - Ŭ����: ��ü�� �����ϴ� ���ø�. �ʵ�� ����(�޼���)�� ����
 *  - �ν��Ͻ�(Instance = ��ü): Ŭ�����κ��� ������ ��ü
 *    --> �߿�) ����ó���� ��ü�� Ŭ������ �ƴ϶� �ν��Ͻ��̴�.
 *  - �ʵ�: �Ӽ�(Attribute)�� ��Ÿ���� ������ 
 *  - ������: �ʵ带 �ʱ�ȭ �ϴ� ��
 *  - �޼���: �����͸� �����ϰų� ������ �� �ִ� �� */
public class CalculatorRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 10);
		System.out.println("+ ���� ���=" + result1);
		
		double result2 = myCalc.remainder(11, 4);
		System.out.println("% ���� ���=" + result2);
		
		byte x = 11;
		byte y = 3;
		double result3 = myCalc.divide(x, y);
		System.out.println("/ ���� ���=" + result3);
		
		myCalc.powerOff();
	}

}
