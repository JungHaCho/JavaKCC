package kosa.oop4;

public class MyThread implements Runnable {

	@Override
	public void run() {
		// 멀티스레드 작업 내용
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		MyThread my = new MyThread();
		Thread t = new Thread(my);
		t.start();
	
	}

}
