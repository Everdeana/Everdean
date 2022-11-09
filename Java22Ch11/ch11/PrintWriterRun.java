package ch11;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/* ���� ����� ���α׷� �ۼ�
 *  1. ���� �̸�
 *  2. ���� �ۼ�
 *  3. ���� �ۼ� ����
 *  4. ���Ϸ� ����ǰ�
 *  5. ������ Ȯ�� */
public class PrintWriterRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� �̸�: ");
		String fileName = stdIn.nextLine().trim(); // Trim: ������ �ڸ�
		
		PrintWriter outWriter = null;
		try {
			outWriter = new PrintWriter(fileName);
					
		} catch(FileNotFoundException e) {
			System.out.println(fileName + ": ������ ���� ���߽��ϴ�.");
			System.out.println(e);
			System.exit(0);
		}
		System.out.println("�ؽ�Ʈ�� �Է��ϼ���(���� ���� �Է� ���� EnterKey)");
		String line = stdIn.nextLine();
		while(line.length() > 0) { // �ؽ�Ʈ ���� �Է�
			outWriter.println(line);
			line = stdIn.nextLine();
		}
		outWriter.close();
		System.out.println(fileName + ": ������ �����Ǿ����ϴ�.");
		// ���� ���: C:\Java22_B\Java22Ch11
	}

}
