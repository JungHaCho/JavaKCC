package kosa.thread;

public class RunDigitTread implements Runnable {

	public void run() {
	
		for(char ch ='a' ; ch <= 'z'; ch++) {
			System.out.print(ch);
		}
	}
}
