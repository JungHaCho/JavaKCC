package kosa_oop;

public class MinusAccount extends Account{

	private int creaditLine;
	
	public MinusAccount() {
		
	}

	public MinusAccount(String accountNo, String ownwerName, int d, int creaditLine) {
		super(accountNo, ownwerName, d);
		this.creaditLine = creaditLine;
	}
	
	// 오버라이딩
	// 1. 상속관계
	// 2. 메서드의 시그너처(접근제어자, 리턴형, 이름, 파라미터) 일치
	// 3. 메서드의 내용 불일치(재정의)

	@Override
	public int withdraw(int amount) throws Exception {
		// TODO Auto-generated method stub
		if(getBalance() + creaditLine <amount) {
			throw new Exception("잔액 부족");
		}
		
		int balance = getBalance();
		setBalance(balance -amount);
		return balance;
	}
	
	
}
