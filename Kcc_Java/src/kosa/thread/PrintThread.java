package kosa.thread;

public class PrintThread extends Thread {

	SharedArea sharedArea;

	public PrintThread(SharedArea area) {
		// TODO Auto-generated constructor stub
		sharedArea = area;

	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			synchronized (sharedArea) {

				int sum = sharedArea.account1.getBalance() + sharedArea.account2.getBalance();
				System.out.println("합계" + sum);
				try {
					Thread.sleep(1);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

}
