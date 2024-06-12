package kosa.thread;

public class SumMain {

	public static void main(String[] args) {
		

		// t1은 1-50 합
		// t2은 51-100 합
		//main : t1+t2 = 5050 => 문제 join 해당 쓰레드 말고 다른 건 대기
		
		SumThread2 t1 = new SumThread2(0,50);
		SumThread2 t2 = new SumThread2(51,100);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch(Exception e) {
			
		}
		
		System.out.println("합계 : "+ ( t1.getTotal()+t2.getTotal()));
		
	}

}
