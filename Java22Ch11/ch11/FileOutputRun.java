package ch11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileOutputRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("출력할 파일 이름: ");
		
		String fileName = stdIn.nextLine().trim();
		Scanner fileInput = null;
		// 예외처리문
		try {
			/* Scanner 객체에 (키보드 입력이 아니라) 텍스트 파일을 바로 연결  
			 * File 객체를 통해 파일이름을 넘긴다. */ 
			fileInput = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(fileName + ": 파일을 열지 못했습니다.");
			System.out.println(e);
			System.exit(0);
		}
		while(fileInput.hasNext()) {
			System.out.println(fileInput.nextLine());
		}
		fileInput.close();
	}

}
