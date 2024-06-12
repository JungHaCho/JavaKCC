package kosa.thread;

public class TransferThread extends Thread{

	SharedArea sharedArea;
	public TransferThread(SharedArea area) {
		// TODO Auto-generated constructor stub
		sharedArea = area;
	}

	public void run() {
		for(int i =0;i<12;i++) {
			synchronized (sharedArea) {
				try {
					sharedArea.account1.withdraw(1000000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(" 이몽룡 계좌 : 100만원인출" );
				
				sharedArea.account2.deposit(100000);
	            System.out.println("성춘향 계좌: 100만원 입금");

			}
			
		}
	}
}
