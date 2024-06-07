package kosa_oop;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account; // 참조형(클래스 타입)
		account = new Account(); 	// 객체 생성 : 메모리 할당, 주소값을 전달하는 역할도 함
													// 객체 생성 => 인스턴스화 : m1 => 인스턴스변수
													
//		account.accountNo = "111-111";//객체 초기화
//		account.ownwerName = "홍길동";
//		account.balance = 10000;
		
		
		try {
			account.withdraw(30000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //
			System.out.println(e.getMessage());
		}

//		System.out.println("계좌번호: " + account.accountNo);
//		System.out.println("계좌번호: " + account.ownwerName);
//		System.out.println("계좌번호: " + account.balance);
		// new 생성자는 같은 데이터타입이여한다.

	}

}
