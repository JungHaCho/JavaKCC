package kosa.thread;

public class MultithreadExample1 {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new RunDigitTread());
		thread.start();
		
		for (char ch = 'ㄱ'; ch <= 'ㅎ'; ch++) {
			System.out.print(ch);
		}
	}
}
