package ch09;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/* Windows Programming ->위젯(widget)을 만든다. 
 * 로그인 화면 출력 프로그램  
 * 입력화면 단: 아이디 
 * 입력화면 단: 비밀번호 
 * 아이디 저장 : 체크박스 
 * 버튼 2개 : 로그인 / 취소 
 *  */ 
/* 로그인 입력 윈도우 -- 로그인 결과  출력 윈도우  */ 
public class LoginForm extends JFrame {
	/* 필드 선언 */ 
	
	/* 생성자 선언  */
	/* 생성자 (필드의 초기화, return (x)) 와 
	 * 메서드(클래스를 실행하기 위한 기능, return (o) ) 차이점  */ 
	LoginForm(String msg){
		setSize(400, 200); 
		setTitle("Login Result"); /* 윈도창의 제목글  */ 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		JLabel label = new JLabel("Login Result windows", SwingConstants.CENTER); 
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		/* 글꼴 스타일 설정   */ 
		label.setForeground(Color.blue); /* 윈도우 내부 배경색  */ 
		JLabel msgLabel = new JLabel(msg); 
		msgLabel.setFont(new Font("Consolas", Font.PLAIN, 20));
		Container container = getContentPane(); 
		container.setLayout(new FlowLayout());
		container.add(label); 
		container.add(msgLabel); 
		
	}
	
	/* 메서드 선언  */ 

}