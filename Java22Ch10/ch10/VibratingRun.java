package ch10;

/* Thread - 프로그램 내에 정의된 부분 작업
 * MultiThread - 하나의 프로세스 내에 여러 개의 Thread가 존재하고 이 Thread들이 동시에 실행되는 것 
 * Thread를 구현하는 방법
 *  1) Thread 클래스를 상속
 *  2) Runnable Interface로 구현하는 방법 
 *  ※JAVA에서는 다중 상속 불가 --> Interface를 사용하는 이유*/
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

// 진동하는 프레임을 만드는 프로그램
public class VibratingRun extends JFrame implements Runnable{

	// 필드 선언
	Thread th; // 진동 처리 스레드
	// 생성자 선언
	VibratingRun() {
		setTitle("진동프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		getContentPane().addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				if (!th.isAlive()) { // 스레드 종료 시 그냥 리턴
					return;
				}
				th.interrupt();
			}
		});
		th = new Thread(this);
		th.start(); // 진동 처리
		
	}
			
	// 메서드 선언
	public void run() {
		// TODO Auto-generated method stub
		Random r = new Random(); // 랜덤하게 프레임의 위치를 이동
		while(true) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO: handle exception
				return;
			}
			int x = getX() + r.nextInt()%5;
			// 진동하면서 이동하는 x의 새로운 위치
			int y = getY() + r.nextInt()%5;
			// 진동하면서 이동하는 y의 새로운 위치
			setLocation(x, y);
		}

	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VibratingRun();
	}

}
