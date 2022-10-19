package ch09;

public class RemoteRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(15);
		rc.setVolume(10);
		rc.setVolume(-4);
		rc.setVolume(0);
		rc.turnOff();
	}
}
