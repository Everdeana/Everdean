package asg06Ex02;

import java.util.Scanner; // java.util ��Ű���� Scanner ȣ��

import asg06Ex02.Calculator;

// Ű����� �� �μ��� �����ڸ� �Է¹޾� ��Ģ ������ �����ϴ� ���α׷� �ۼ�
public class Class_Calculator {
	// �� ���� ������ �Է� �޾� ���ϱ� ������ �����ϴ� ���α׷� �ۼ�
	// �ʵ� ����
	int result;
	// ������
	// �޼���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double res = 0; // ��� ����� ������ ���� ����
		Calculator myCalc = new Calculator();
		char iv; // ���α׷� ����/���� �����ϴ� ���ڸ� ������ ���� ����
		// �����ڸ� �Է¹��� �� ����� Sccanner Ÿ�� ���� ����
        Scanner op = new Scanner(System.in); 
        char operator; // �Է¹��� �����ڸ� ������ ���� ����
		do {
			// Scanner Ŭ������ ����Ͽ� �� ���� �Է¹޴´�.
			Scanner stdIn = new Scanner(System.in); 
			System.out.print("ù ��° ���� �Է�:");
			// Scanner ��ü�� stdIn�� nextInt() �޼��带 �̿��Ͽ� ������ �Է¹޴´�.
			int n1 = stdIn.nextInt(); 
			System.out.print("�� ��° ���� �Է�:");
			int n2 = stdIn.nextInt();
			// ���� ������ ������ �ܿ� �ٸ� �����ڰ� �ԷµǾ��ٸ� �ٽ� �Է¹޵��� �Ѵ�.
			while(true) {  
				System.out.print("ó���� �����ڸ� �Է��ϼ���(+, -, *, /, %): ");
				/* Scanner ��ü�� op�� next() �޼��带 �̿��Ͽ� 
				 * ������(����)�� �Է¹޴´�.*/
				// �Է��� ���� �� ���� ù ��° ���ڸ� ������
				operator = op.next().charAt(0); 
				if(operator == '+') {
					// Calculator Ŭ������ �޼��带 ȣ���Ѵ�.
					res = myCalc.plus(n1, n2); 
					break; }
		        else if(operator == '-') { 
		        	res = myCalc.minus(n1, n2);
		        	break; }	
		        else if(operator == '*') {
		        	res = myCalc.multiplication(n1, n2);
					break; }
		        else if(operator == '/') {
		        	res = myCalc.divide(n1, n2);
					break; }
		        else if(operator == '%') {
		        	res = myCalc.remainder(n1, n2);
					break; }
		        else { System.out.println("�����ڸ� �Է��ϼ���!!!"); }
			}
			
			System.out.println("�� ���� ��� ����� " + res + "�Դϴ�.");
			while(true){ // while���� Ȱ���Ͽ� 1 �Ǵ� 0�� �Է¹޵��� �Ѵ�. 
				System.out.print("���α׷��� �����Ͻðڽ��ϱ�?(y/n): ");
				iv = stdIn.next().charAt(0); // �Է¹��� ���ڸ� iv�� ����
				if(iv == 'y' || iv == 'n' || iv == 'Y' || iv == 'N') { 
					break; 
					// iv�� y �Ǵ� n�̸� do~while������ ���ư���.
				} else { // y �Ǵ� n�� �ƴ� ��� ��� �ݺ��Ͽ� �Է¹޵��� �Ѵ�.
					System.out.println("y �Ǵ� n�� �Է��� �ּ���");
				}
			}
		} while(iv == 'n' || iv == 'N'); // n�̳� N�� �ԷµǸ� ��� �ݺ�
		System.out.println("���α׷� ����");
	}
}