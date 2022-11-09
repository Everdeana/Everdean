package ch11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileOutputRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("����� ���� �̸�: ");
		
		String fileName = stdIn.nextLine().trim();
		Scanner fileInput = null;
		// ����ó����
		try {
			// Scanner ��ü��(Ű���� �Է�X) �ؽ�Ʈ ������ �ٷ� ����
			fileInput = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(fileName + ": ������ ���� ���߽��ϴ�.");
			System.out.println(e);
			System.exit(0);
		}
		while(fileInput.hasNext()) {
			System.out.println(fileInput.nextLine());
		}
		fileInput.close();
	}

}
