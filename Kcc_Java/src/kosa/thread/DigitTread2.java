package kosa.thread;

public class DigitTread2 extends Thread {

	public void run() {
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.print(cnt);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
