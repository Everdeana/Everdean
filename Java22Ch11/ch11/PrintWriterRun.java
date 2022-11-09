package ch11;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/* 파일 입출력 프로그램 작성
 *  1. 파일 이름
 *  2. 내용 작성
 *  3. 내용 작성 종료
 *  4. 파일로 저장되고
 *  5. 파일을 확인 */
public class PrintWriterRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("파일 이름: ");
		String fileName = stdIn.nextLine().trim(); // Trim: 공백을 자름
		
		PrintWriter outWriter = null;
		try {
			outWriter = new PrintWriter(fileName);
					
		} catch(FileNotFoundException e) {
			System.out.println(fileName + ": 파일을 열지 못했습니다.");
			System.out.println(e);
			System.exit(0);
		}
		System.out.println("텍스트를 입력하세요(끝낼 떄는 입력 없이 EnterKey)");
		String line = stdIn.nextLine();
		while(line.length() > 0) { // 텍스트 문장 입력
			outWriter.println(line);
			line = stdIn.nextLine();
		}
		outWriter.close();
		System.out.println(fileName + ": 파일이 생성되었습니다.");
		// 저장 경로: C:\Java22_B\Java22Ch11
	}

}
