package kosa.thread;

public class MultithreadExample2 {

	public static void main(String[] args) {
		Thread thread = new RunDigitTread();
		thread.start();
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
