package ch10;

/* Thread - ���α׷� ���� ���ǵ� �κ� �۾�
 * MultiThread - �ϳ��� ���μ��� ���� ���� ���� Thread�� �����ϰ� �� Thread���� ���ÿ� ����Ǵ� �� 
 * Thread�� �����ϴ� ���
 *  1) Thread Ŭ������ ���
 *  2) Runnable Interface�� �����ϴ� ��� 
 *  ��JAVA������ ���� ��� �Ұ� --> Interface�� ����ϴ� ����*/
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

// �����ϴ� �������� ����� ���α׷�
public class VibratingRun extends JFrame implements Runnable{

	// �ʵ� ����
	Thread th; // ���� ó�� ������
	// ������ ����
	VibratingRun() {
		setTitle("����������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		getContentPane().addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				if (!th.isAlive()) { // ������ ���� �� �׳� ����
					return;
				}
				th.interrupt();
			}
		});
		th = new Thread(this);
		th.start(); // ���� ó��
		
	}
			
	// �޼��� ����
	public void run() {
		// TODO Auto-generated method stub
		Random r = new Random(); // �����ϰ� �������� ��ġ�� �̵�
		while(true) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO: handle exception
				return;
			}
			int x = getX() + r.nextInt()%5;
			// �����ϸ鼭 �̵��ϴ� x�� ���ο� ��ġ
			int y = getY() + r.nextInt()%5;
			// �����ϸ鼭 �̵��ϴ� y�� ���ο� ��ġ
			setLocation(x, y);
		}

	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VibratingRun();
	}

}
