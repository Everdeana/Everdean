package ch02Test;
/* 1) Ű���� ���� �Է� �޴´�.
 * 2) ��� �Է� �޴´�.
 * 3) ���� ���� --> q ���ڸ� �Է¹�����
 * 4) ���α׷� stop */
import java.util.Scanner;

public class TestEx05 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Scanner Ŭ������ ����ϱ� ���� ���� ����(���� Scanner Type���� ����)
		Scanner stdIn = new Scanner(System.in); 
		String inputKey; // �з� ���� ���ڸ� �����ϴ� ���� ����
		
		while(true) {
			System.out.print("���� �Է�: ");
			inputKey = stdIn.nextLine(); // nextLine �޼��带 ����Ͽ� ���ڸ� �Է¹޴´�.
			System.out.println("�Էµ� ����: \"" + inputKey + "\"");
			if(inputKey.equals("q")) { // .equals�� Ȱ���Ͽ� ���ڸ� ���Ѵ�.
				System.out.print("���� q �Է½� ���� ");
				break; // �� if���� ���ǿ� �����Ѵٸ� while �ݺ����� �����Ų��.
			}
		}
	}
}
