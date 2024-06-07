package kosa.oop4;

public class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e){}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread my = new MyThread();
		
		t.start();
	}

}
