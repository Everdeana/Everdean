package asg06Ex01;

import java.util.Scanner; // java�� util ��Ű������ Scanner ���̺귯�� ȣ��

public class ScanInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ű����� ����� ǥ�� �Է� ��Ʈ��(System.in)
		Scanner stdIn = new Scanner(System.in); // Ÿ���� Scanner Ÿ������ �Ȱ��� �����ش�. 
		
		System.out.print("�������� �Է��Ͻÿ� ->");
		// Ű���带 ���� �Է��� �������� �޴´�.
		// Ű���带 ���� double���� �Ǽ����� �Է¹��� �� nextDouble()
		int x = stdIn.nextInt(); // �Է� ���� ���� Enter �Է��ϴ� ���� itn ������ ������
		System.out.println(x + "�� �Է��߽��ϴ�.");

	}

}
