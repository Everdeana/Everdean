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

/* �α��� �Է��� ���� ������ ���α׷�  
 * * �α��� ȭ�� ��� ���α׷�  
 * �Է�ȭ�� ��: ���̵� 
 * �Է�ȭ�� ��: ��й�ȣ 
 * ���̵� ���� : üũ�ڽ� 
 * ��ư 2�� : �α��� / ��� 
 * ���(extends) --> �θ� Ŭ������ ���� �ʵ�, ������, �޼��带 
 * �ڽ� Ŭ������ ��� �޴´�.
 * FlowLayout
 * ������Ʈ���� ���ʿ��� ���������� �Ϸķ� ��ġ�Ѵ�.
 * �����̳� ũ�⸦ �Ѿ�� �ڵ����� �Ʒ��� ��ġ�Ѵ�.
 * �����ڷ� ���Ĺ���� �������� �� �ִ�.
 * GridLayout 
 * ������Ʈ���� ��� ���� ��ġ�Ѵ�.
 * ������Ʈ�� ũ��� �����̳��� ũ�⿡ �ڵ����� ��������. */ 
public class LoginFrame extends JFrame{ 
	// �ڽ� Ŭ������ �θ� Ŭ������ ��� ��û --> �ڽ� Ŭ�������� extends
	// ���� ��� --> �������̽�
	/* �ʵ� ����  */
	private JButton btnLogin; /* (�α���) ��ư Ÿ�� (Ŭ����)��ü ����  */
	private JButton btnCancel; /*(���) ��ư Ÿ�� ��ü ����   */
	private JTextField inputId; /* ���̵� �Է� ��ü ����  */
	private JTextField inputPasswd; /*��й�ȣ �Է� ��ü ����  */
	private JCheckBox storeId; 
	
	/*  ������ ���� */ 
	LoginFrame(){
		setTitle("Login Start"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2, 10, 3));
		// ��ư �̺�Ʈ ó��
		LoginListener listener = new LoginListener();
		// ���̵�� ��й�ȣ�� ȭ�鿡 �������� ����
		JLabel labelId = new JLabel("���̵�", JLabel.RIGHT);
		JLabel labelPasswd = new JLabel("��й�ȣ", JLabel.RIGHT);
		inputId = new JTextField(8);
		inputPasswd = new JPasswordField(8);
		// üũ�ڽ��� �α���/��� ��ư
		storeId = new JCheckBox("���̵� ����", true);
		btnLogin = new JButton("�α���");
		btnCancel = new JButton("���");
		btnLogin.addActionListener(listener);
		btnCancel.addActionListener(listener);
		
		panel.add(labelId);
		panel.add(inputId); // ���̵� ����
		panel.add(labelPasswd);
		panel.add(inputPasswd); // ��й�ȣ ����
		panel.add(new JLabel());
		panel.add(storeId); // ���̵� ���� üũ�ڽ�
		panel.add(btnLogin); // ��ư �α���
		panel.add(btnCancel); // ��ư ���
		add(panel);
		pack();
		
	}
	
	// �޼��� ����
	// Interface: �������̽� �̿�(��ü�� ��ü�� ������ �ִ� Ŭ����)
	// ��ư �̺�Ʈ ó��
	/* �������̽��� �߻� Ŭ������ �����ϴ�.
	 * �߻� Ŭ���� ó�� �߻� �޼��带 ������. 
	 * �������̽��� ���� ��Ӱ� ����� ��� ���� 
	 * �������̽��� �ܺθ� ���� ������ �ִ� �ٸ� ������ �ϴ� ���̴�.*/
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
					JOptionPane.showMessageDialog(null, "���̵�� ��й�ȣ�� Ȯ���ϼ���");
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

