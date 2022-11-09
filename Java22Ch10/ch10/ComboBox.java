package ch10;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/* �޺� �ڽ����� ���α׷� �ۼ�
 * ��� --> ������ ���α׷��� --> JFrame
 *  - �޺��ڽ�(UI)
 *  - �̺�Ʈ ó�� */
public class ComboBox extends JFrame{

	// �ʵ� ����
	String[] contents = {"Apple", "Java", "Python"};
	/* <�ڹ��� �ڷ���>
	 *  1) �⺻��: ����, �Ǽ�, ����, ����
	 *  2) ������: �迭, Ŭ����, �������̽�, ������*/ 
	ImageIcon[] images = { // �̹��� ������ �迭 ����
			new ImageIcon("Images/Apple.jpg"),
			new ImageIcon("Images/Java.png"), 
			new ImageIcon("Images/Python.png") };
	
	JLabel imgLabel = new JLabel(images[0]); // �̹����� ����� ���̺�
	
	// ������ ����
	public ComboBox() {
		// TODO Auto-generated constructor stub
		setTitle("�޺� �ڽ� ����");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JComboBox combo = new JComboBox(contents);
		// �޺� �ڽ� ����
		c.add(combo);
		c.add(imgLabel);
		
		// �̺�Ʈ ó�� --> �޺��ڽ��� Action �����ʸ� ����ϰ� ���õ� �׸��� �̹����� ��� 
		combo.addActionListener(new ActionListener() {
			@Override // ���콺 ������ ��ư - source - override implements method 
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			JComboBox cb = 	(JComboBox) e.getSource();  // �޺��ڽ� �˾Ƴ���  
			int index = cb.getSelectedIndex();  // �޺��ڽ��� ���õ� �������� ���ؽ�
			imgLabel.setIcon(images[index]);  // ���ؽ��� �̹����� �̹��� ���̺� ���
			}
		});
		setSize(600, 600); 
		setVisible(true); 
	}
	// �޼��� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ComboBox();
	}
}
