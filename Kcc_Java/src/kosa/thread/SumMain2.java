package kosa.thread;

public class SumMain2 {

	public static void main(String[] args) {
		

		// t1은 1-50 합
		// t2은 51-100 합
		//main : t1+t2 = 5050 => 문제 join 해당 쓰레드 말고 다른 건 대기
		
		Thread t1 = new T1SumThread();
		Thread t2 = new Thread(new T2SumThread());
		t1.start();
		t2.start();
		
		
		System.out.println(t1+t2);
		
	}

}
