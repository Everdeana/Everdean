package ch11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/* Socket Programming
 * Server	<------->	Client
 * Back End				Front End */

public class EchoServer extends Thread{
	// Field 선언
	protected static boolean cont = true;
	protected Socket connection = null;

	// Constructor 선언
	private EchoServer(Socket clientSocket) {
		// TODO Auto-generated constructor stub
		connection = clientSocket; // this.connection = clientSocket
	}
	
	// Method 선언
	@Override
	public void run() {
		// TODO Auto-generated method stub
		BufferedReader in;
		System.out.println("클라이언트와 통신을 위한 새로운 스레드 생성");
		try {
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String msg;
			while((msg = in.readLine()) != null) {
				System.out.println("읽은 Echo: "+ msg);
			}
			in.close();
			connection.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		ServerSocket server = null;
		server = new ServerSocket(5000);
		System.out.println("서버 소켓 생성합니다.");
		
		while(cont) {
			System.out.println("연결대기 중....");
			new EchoServer(server.accept());
		}
		server.close();
		
	}

	
	

}
