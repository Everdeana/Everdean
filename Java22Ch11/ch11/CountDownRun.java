package ch11;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/* CountDown ���α׷� �ۼ� 
 * 1. ������ �Է¹޾� �� ������ 0���� ī��Ʈ �Ѵ�. 
 * 2. ����Ǵ� ���߿� "����"��ư�� Ŭ���ϸ� ī��Ʈ �ٿ��� �����ǰ� 
 * 3. ȭ���� �ʱ�ȭ 
 * 4. UI�� ���ν����尡 ����ϰ� 
 * 5. ī��Ʈ�ٿ��� �� ���� ������� �����Ѵ�. 
 * 6. UI ������ / ��ɽ����� �и� (�߿�) �Ѵ�.   */ 
public class CountDownRun extends JFrame implements ActionListener{
	/* �ʵ� ����   */
	private JTextField input; 
	private JButton btnStart; 
	private JButton btnStop; 
	private JLabel outLabel; 
	private Thread thread;

	/* ������ ����  */
	CountDownRun(){
		setSize(250, 200); /* width, height  */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setTitle("Count Down Widget"); 
		input = new JTextField(8); 
		btnStart = new JButton("����"); 
		btnStop = new JButton("����"); 
		outLabel = new JLabel();
		/* ȭ�鿡 ��µǴ� ��Ʈ Ÿ�� ����  */ 
		outLabel.setFont(new Font("Serif", Font.BOLD, 100));
		btnStart.addActionListener(this);
		btnStop.addActionListener(this);
		setLayout(new FlowLayout()); /* layout ������ ����  */
		add(input); 
		add(btnStart); /* ���� ��ư  */ 
		add(btnStop);   /* ���� ��ư */ 
		add(outLabel);   /* ȭ�� ��� */ 
	}
	/*   �޼��� ���� */ 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnStart) { /* ���۹�ư�� Ŭ���Ǹ� */ 
			int n = Integer.parseInt(input.getText()); 
			thread = new Thread(new CountDownTask(n, outLabel)); 
			thread.start();
		} else if(e.getSource() == btnStop) { /* ������ư�� Ŭ���Ǹ� */ 
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