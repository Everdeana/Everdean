package ch11;

import javax.swing.JLabel;

public class CountDownTask implements Runnable{
	/* 필드 선언   */
	private int count;
	private JLabel label; 
	
	/*  생성자 선언 */
	CountDownTask(int count, JLabel label){
		this.count = count; 
		this.label = label; 
	}

	/* 메서드 선언  */ 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		label.setText(count+"");; 
		do {
			try {
				Thread.sleep(1000);
				label.setText(--count+"");
				
			}catch(InterruptedException e) { /* 인터럽트예외 발생 처리문  */ 
				label.setText("");
				break; 
			}
			
		}while(count > 0); 
	}

}