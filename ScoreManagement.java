package exam01;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner; // Scanner 클래스를 사용하기 위해 import

// 학점 관리 정보 클래스 선언
/* main()메서드가 있는 실행 클래스에서 입력된
 * 모든 학점에 리스트가 출력되도록 코드 작성
 * 계속 입력: y / 종료: q / 전체학점 리스트 출력:list()*/ 

public class ScoreManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 필드 선언
		// Scanner 클래스 / System.in을 사용하여 값을 입력받을 stdIn 변수를 선언한다.
		Scanner stdIn = new Scanner(System.in);
		String score = ""; // 입력받은 학점을 저장할 변수 선언
		String pgQuit = ""; // 입력받은 프로그램 실행 여부를 결정하는 문자를 저장할 변수 
		List<String> score_list = new ArrayList<String>(); // 입력받은 문자를 저장할 리스트 선언
		List<String> char_list = new ArrayList<String>(); // 입력받은 문자를 저장할 리스트 선언
		List<String> hist = new ArrayList<String>(); // 입력받은 문자를 저장할 리스트 선언
		do {
			System.out.print("학점을 문자로 입력하세요:");
			score = stdIn.nextLine(); // nextLine으로 엔터를 치기 전 문자를 가져온다.
			hist.add(score);
			if (score.equals("a") || score.equals("A")) { // .equals로 문자를 비교하여 문자에 맞는 학점을 출력한다.
				System.out.println("평점 = 4.0");
				char_list.add(score);
				score_list.add("4.0");
			} else if (score.equals("b") || score.equals("B")) {
				System.out.println("평점 = 3.0");
				char_list.add(score);
				score_list.add("3.0");
			} else if (score.equals("c") || score.equals("C")) {
				System.out.println("평점 = 2.0");
				char_list.add(score);
				score_list.add("2.0");
			} else if (score.equals("d") || score.equals("D")) {
				System.out.println("평점 = 1.0");
				char_list.add(score);
				score_list.add("1.0");
			} else if (score.equals("f") || score.equals("F")) {
				System.out.println("평점 = 0.0");
				char_list.add(score);
				score_list.add("0.0");
			} else {
				System.out.println("A, B, C, D, F 중 하나만 입력하세요"); // 출력되는 학점에 해당하는 문자만 입력받도록 한다.
			}
			while (true) {
				System.out.print("프로그램 계속(y), 종료(q) 입력: ");
				pgQuit = stdIn.nextLine(); // nextLine으로 엔터를 치기 전 문자를 가져온다.
				hist.add(pgQuit);
				if (pgQuit.equals("y") || pgQuit.equals("Y") || pgQuit.equals("q") || pgQuit.equals("Q")) {
					// if문을 사용하여 위의 4개 문자 중 하나가 입력되면 while문을 빠져나가 do ~ while문으로 돌아간다.
					break;
				} else {
					System.out.println("y 또는 q만 입력하세요!!"); // 위의 문자들이 입력되지 않은 경우 다시 입력받도록 한다.
				}
			}
		} while (pgQuit.equals("y") || pgQuit.equals("Y")); // 만약 y나 Y가 입력되었을 경우 프로그램을 계속 실행시킨다.
		System.out.println("입력한 문자: " + char_list);
		System.out.println("저장된 점수: " + score_list);
		System.out.println("입력한 내역: " + hist);
		System.out.println("프로그램 종료");
	}

}
