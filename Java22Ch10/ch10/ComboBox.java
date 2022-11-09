package ch10;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/* 콤보 박스위젯 프로그램 작성
 * 상속 --> 윈도우 프로그래밍 --> JFrame
 *  - 콤보박스(UI)
 *  - 이벤트 처리 */
public class ComboBox extends JFrame{

	// 필드 선언
	String[] contents = {"Apple", "Java", "Python"};
	/* <자바의 자료형>
	 *  1) 기본형: 정수, 실수, 논리형, 문자
	 *  2) 참조형: 배열, 클래스, 인터페이스, 열거형*/ 
	ImageIcon[] images = { // 이미지 아이콘 배열 선언
			new ImageIcon("Images/Apple.jpg"),
			new ImageIcon("Images/Java.png"), 
			new ImageIcon("Images/Python.png") };
	
	JLabel imgLabel = new JLabel(images[0]); // 이미지를 출력할 레이블
	
	// 생성자 선언
	public ComboBox() {
		// TODO Auto-generated constructor stub
		setTitle("콤보 박스 위젯");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JComboBox combo = new JComboBox(contents);
		// 콤보 박스 생성
		c.add(combo);
		c.add(imgLabel);
		
		// 이벤트 처리 --> 콤보박스에 Action 리스너를 등록하고 선택된 항목의 이미지를 출력 
		combo.addActionListener(new ActionListener() {
			@Override // 마우스 오른쪽 버튼 - source - override implements method 
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			JComboBox cb = 	(JComboBox) e.getSource();  // 콤보박스 알아내기  
			int index = cb.getSelectedIndex();  // 콤보박스의 선택된 아이템의 인텍스
			imgLabel.setIcon(images[index]);  // 인텍스의 이미지를 이미지 레이블에 출력
			}
		});
		setSize(600, 600); 
		setVisible(true); 
	}
	// 메서드 선언
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ComboBox();
	}
}
