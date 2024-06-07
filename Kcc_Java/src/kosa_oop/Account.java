package kosa_oop;

public class Account {

	// 계좌 객체 생성 하기위해
	// 객체로부터 공통된 데이터 구조와 기능을 추출
	// 상태(데이터) : 계좌번호, 계좌주, 잔액 => 멤버변수 = 필드
	// 행동(기능) : 입금하다, 출금하다 => 멤버메서드

	private String accountNo;// 계좌번호
	private String ownwerName;// 계좌주
	private int balance;// 잔액

	public Account() {
	} // 디폴트 생성자 (만들고 시작하자)
		// 생성자가 없으면 자동으로 디폴트 생성자를 만들어준다.
		// 만들어줘야하는 이유 : 파라미터가 있는 생성자를 만든다면 디폴트 생성자 만들어줘야한다.

	public Account(String accountNo, String ownwerName, int balance) {

		this.accountNo = accountNo;
		this.ownwerName = ownwerName;
		this.balance = balance;
	}

	// 입금하다.
	public void deposit(int amount) {
		balance += amount;
	}

	// 출금하다.
	// 호출하는 입장에서 해결해야한다.

	public int withdraw(int amount) throws Exception {

		if (balance < amount) {
			throw new Exception("잔액 부족");
		}

		balance -= amount;

		return amount;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnwerName() {
		return ownwerName;
	}

	public void setOwnwerName(String ownwerName) {
		this.ownwerName = ownwerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void print() {
		System.out.println("부모");
	}

}
