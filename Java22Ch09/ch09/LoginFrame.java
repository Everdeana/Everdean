package ch09;


import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/* 로그인 입력을 위한 윈도우 프로그램  
 * * 로그인 화면 출력 프로그램  
 * 입력화면 단: 아이디 
 * 입력화면 단: 비밀번호 
 * 아이디 저장 : 체크박스 
 * 버튼 2개 : 로그인 / 취소 
 * 상속(extends) --> 부모 클래스로 부터 필드, 생성자, 메서드를 
 * 자식 클래스가 상속 받는다.
 * FlowLayout
 * 컴포넌트들을 왼쪽에서 오른쪽으로 일렬로 배치한다.
 * 컨테이너 크기를 넘어서면 자동으로 아래로 배치한다.
 * 생성자로 정렬방식을 지정해줄 수 있다.
 * GridLayout 
 * 컴포넌트들을 행과 열로 배치한다.
 * 컴포넌트의 크기는 컨테이너의 크기에 자동으로 맞춰진다. */ 
public class LoginFrame extends JFrame{ 
	// 자식 클래스가 부모 클레스에 상속 요청 --> 자식 클래스에서 extends
	// 다중 상속 --> 인터페이스
	/* 필드 선언  */
	private JButton btnLogin; /* (로그인) 버튼 타입 (클래스)객체 선언  */
	private JButton btnCancel; /*(취소) 버튼 타입 객체 선언   */
	private JTextField inputId; /* 아이디 입력 객체 선언  */
	private JTextField inputPasswd; /*비밀번호 입력 객체 선언  */
	private JCheckBox storeId; 
	
	/*  생성자 선언 */ 
	LoginFrame(){
		setTitle("Login Start"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2, 10, 3));
		// 버튼 이벤트 처리
		LoginListener listener = new LoginListener();
		// 아이디와 비밀번호가 화면에 보여지는 구문
		JLabel labelId = new JLabel("아이디", JLabel.RIGHT);
		JLabel labelPasswd = new JLabel("비밀번호", JLabel.RIGHT);
		inputId = new JTextField(8);
		inputPasswd = new JPasswordField(8);
		// 체크박스와 로그인/취소 버튼
		storeId = new JCheckBox("아이디 저장", true);
		btnLogin = new JButton("로그인");
		btnCancel = new JButton("취소");
		btnLogin.addActionListener(listener);
		btnCancel.addActionListener(listener);
		
		panel.add(labelId);
		panel.add(inputId); // 아이디 영역
		panel.add(labelPasswd);
		panel.add(inputPasswd); // 비밀번호 영역
		panel.add(new JLabel());
		panel.add(storeId); // 아이디 저장 체크박스
		panel.add(btnLogin); // 버튼 로그인
		panel.add(btnCancel); // 버튼 취소
		add(panel);
		pack();
		
	}
	
	// 메서드 선언
	// Interface: 인터페이스 이용(객체와 객체를 연결해 주는 클래스)
	// 버튼 이벤트 처리
	/* 인터페이스는 추상 클래스와 유사하다.
	 * 추상 클래스 처럼 추상 메서드를 가진다. 
	 * 인터페이스는 다중 상속과 비슷한 기능 제공 
	 * 인터페이스는 외부를 서로 연결해 주는 다리 역할을 하는 것이다.*/
	public class LoginListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == btnLogin) {
				String id = inputId.getText();
				String passwd = new String(((JPasswordField)inputPasswd).getPassword());
				if(id.equals("test") && passwd.equals("1234")) {
					String msg = "id=" + id + ", password=" + passwd + ", storeId=" + (storeId.isSelected()? true: false);
					(new LoginForm(msg)).setVisible(true);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 확인하세요");
					inputPasswd.setText("");
					inputId.selectAll();
					inputId.requestFocus(true);
				}
			} else if(e.getSource() == btnCancel){
				inputId.setText("");
				inputPasswd.setText("");
				inputId.requestFocus(true);
				
			}
		}
		
	}
	public static void main(String[] args) {
		(new LoginFrame()).setVisible(true);
	}
	

}

