package ch09;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/* Windows Programming ->����(widget)�� �����. 
 * �α��� ȭ�� ��� ���α׷�  
 * �Է�ȭ�� ��: ���̵� 
 * �Է�ȭ�� ��: ��й�ȣ 
 * ���̵� ���� : üũ�ڽ� 
 * ��ư 2�� : �α��� / ��� 
 *  */ 
/* �α��� �Է� ������ -- �α��� ���  ��� ������  */ 
public class LoginForm extends JFrame {
	/* �ʵ� ���� */ 
	
	/* ������ ����  */
	/* ������ (�ʵ��� �ʱ�ȭ, return (x)) �� 
	 * �޼���(Ŭ������ �����ϱ� ���� ���, return (o) ) ������  */ 
	LoginForm(String msg){
		setSize(400, 200); 
		setTitle("Login Result"); /* ����â�� �����  */ 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		JLabel label = new JLabel("Login Result windows", SwingConstants.CENTER); 
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		/* �۲� ��Ÿ�� ����   */ 
		label.setForeground(Color.blue); /* ������ ���� ����  */ 
		JLabel msgLabel = new JLabel(msg); 
		msgLabel.setFont(new Font("Consolas", Font.PLAIN, 20));
		Container container = getContentPane(); 
		container.setLayout(new FlowLayout());
		container.add(label); 
		container.add(msgLabel); 
		
	}
	
	/* �޼��� ����  */ 

}