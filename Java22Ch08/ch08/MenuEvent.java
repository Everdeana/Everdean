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

// �ؽ�Ʈ ���� ������ ���α׷� --> �ۼ� ������ ���Ϸ� ���� �����ϵ��� ���� 
public class MenuEvent extends JFrame{
	// �ʵ� ����
	private JTextArea ta = new JTextArea();

	// ������ ����
	public MenuEvent() {
		// TODO Auto-generated constructor stub
		super("��������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		Container c = getContentPane();
		c.add(new JScrollPane(ta));
		setSize(300, 200);
		setVisible(true);
	}
	
	// �޼��� ����	
	// �޴� ���� �޼��� ����
	private void createMenu() {
		// TODO Auto-generated method stub
		JMenu fileMenu = new JMenu("����");
		JMenuItem save = new JMenuItem("����");
		fileMenu.add(save);
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (ta.getText().length() == 0) {
					JOptionPane.showMessageDialog(MenuEvent.this, "�Էµ� ������ �����ϴ�.", "Warning!!", JOptionPane.WARNING_MESSAGE);
					return;
				} 
				String fileName = JOptionPane.showInputDialog(MenuEvent.this, "������ ���ϸ��� �Է��ϼ���:");
				if(fileName == null) {
					JOptionPane.showMessageDialog(MenuEvent.this, "������ �������� �ʽ��ϴ�.", "Warning!!", JOptionPane.WARNING_MESSAGE);
					return;
				}
				try {
					FileWriter fout = new FileWriter(fileName);
					String t = ta.getText(); // �Էµ� �ؽ�Ʈ�� ���ڿ���
					StringTokenizer st = new StringTokenizer(ta.getText(), "\n");
					while(st.hasMoreTokens()) {
						fout.write(st.nextToken()); // �� ���� ����
						fout.write("\r\n"); // ���� ���� ���� �ٿ� �Ѿ�� ���� ����
					}
					fout.close(); // ���� ��Ʈ�� �ݱ�
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
