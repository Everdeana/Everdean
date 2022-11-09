package ch11;

import javax.swing.JLabel;

public class CountDownTask implements Runnable{
	/* �ʵ� ����   */
	private int count;
	private JLabel label; 
	
	/*  ������ ���� */
	CountDownTask(int count, JLabel label){
		this.count = count; 
		this.label = label; 
	}

	/* �޼��� ����  */ 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		label.setText(count+"");; 
		do {
			try {
				Thread.sleep(1000);
				label.setText(--count+"");
				
			}catch(InterruptedException e) { /* ���ͷ�Ʈ���� �߻� ó����  */ 
				label.setText("");
				break; 
			}
			
		}while(count > 0); 
	}

}