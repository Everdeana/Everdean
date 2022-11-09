package ch11;

public class RunnableRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new CountingTask("First")); 
		Thread t2 = new Thread(new CountingTask("Second")); 
		
		t1.start();
		t2.start();

	}

}
