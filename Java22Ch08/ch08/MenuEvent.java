package ch08;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

// 텍스트 문서 편집기 프로그램 --> 작성 내용은 파일로 저장 가능하도록 구현 
public class MenuEvent extends JFrame{
	// 필드 선언
	private JTextArea ta = new JTextArea();

	// 생성자 선언
	public MenuEvent() {
		// TODO Auto-generated constructor stub
		super("파일저장");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		Container c = getContentPane();
		c.add(new JScrollPane(ta));
		setSize(300, 200);
		setVisible(true);
	}
	
	// 메서드 선언	
	// 메뉴 생성 메서드 선언
	private void createMenu() {
		// TODO Auto-generated method stub
		JMenu fileMenu = new JMenu("파일");
		JMenuItem save = new JMenuItem("저장");
		fileMenu.add(save);
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (ta.getText().length() == 0) {
					JOptionPane.showMessageDialog(MenuEvent.this, "입력된 내용이 없습니다.", "Warning!!", JOptionPane.WARNING_MESSAGE);
					return;
				} 
				String fileName = JOptionPane.showInputDialog(MenuEvent.this, "저장할 파일명을 입력하세요:");
				if(fileName == null) {
					JOptionPane.showMessageDialog(MenuEvent.this, "파일을 저장하지 않습니다.", "Warning!!", JOptionPane.WARNING_MESSAGE);
					return;
				}
				try {
					FileWriter fout = new FileWriter(fileName);
					String t = ta.getText(); // 입력된 텍스트를 문자열로
					StringTokenizer st = new StringTokenizer(ta.getText(), "\n");
					while(st.hasMoreTokens()) {
						fout.write(st.nextToken()); // 한 라인 쓰기
						fout.write("\r\n"); // 라인 끝에 다음 줄에 넘어가는 문자 삽입
					}
					fout.close(); // 파일 스트림 닫기
				} catch (IOException e1) {
					// TODO: handle exception
					
				}
			}
		});
		JMenuBar mb = new JMenuBar();
		mb.add(fileMenu);
		setJMenuBar(mb);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuEvent();
	}

}
