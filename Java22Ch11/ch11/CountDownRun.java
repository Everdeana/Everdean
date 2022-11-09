package ch11;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/* CountDown 프로그램 작성 
 * 1. 정수를 입력받아 그 수에서 0까지 카운트 한다. 
 * 2. 진행되는 도중에 "중지"버튼을 클릭하면 카운트 다운이 중지되고 
 * 3. 화면이 초기화 
 * 4. UI는 메인스레드가 담당하고 
 * 5. 카운트다운은 별 개의 스레드로 구현한다. 
 * 6. UI 스레드 / 기능스레드 분리 (중요) 한다.   */ 
public class CountDownRun extends JFrame implements ActionListener{
	/* 필드 선언   */
	private JTextField input; 
	private JButton btnStart; 
	private JButton btnStop; 
	private JLabel outLabel; 
	private Thread thread;

	/* 생성자 선언  */
	CountDownRun(){
		setSize(250, 200); /* width, height  */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle("Count Down Widget"); 
		input = new JTextField(8); 
		btnStart = new JButton("시작"); 
		btnStop = new JButton("중지"); 
		outLabel = new JLabel();
		/* 화면에 출력되는 폰트 타입 설정  */ 
		outLabel.setFont(new Font("Serif", Font.BOLD, 100));
		btnStart.addActionListener(this);
		btnStop.addActionListener(this);
		setLayout(new FlowLayout()); /* layout 디자인 설정  */
		add(input); 
		add(btnStart); /* 시작 버튼  */ 
		add(btnStop);   /* 중지 버튼 */ 
		add(outLabel);   /* 화면 출력 */ 
	}
	/*   메서드 선언 */ 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnStart) { /* 시작버튼이 클릭되면 */ 
			int n = Integer.parseInt(input.getText()); 
			thread = new Thread(new CountDownTask(n, outLabel)); 
			thread.start();
		} else if(e.getSource() == btnStop) { /* 중지버튼이 클릭되면 */ 
			if(thread != null && thread.isAlive()) {
				input.setText("");
				thread.interrupt();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new CountDownRun()).setVisible(true);
	}

}