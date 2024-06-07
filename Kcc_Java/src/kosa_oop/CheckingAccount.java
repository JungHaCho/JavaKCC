package kosa_oop;

public class CheckingAccount extends Account {
	private String cradNo;

	public int pay(String cardNo, int amount)throws Exception{
		
		if(!this.cradNo.equals(cradNo) || getBalance() < amount) {
			throw new Exception("결재불능");
			
		}
		
		return withdraw(amount);
	}

	public CheckingAccount(){
		
	}
	public CheckingAccount(String accountNo, String ownwerName, int a, String cradNo) {
		super(accountNo, ownwerName, a);
		this.cradNo = cradNo;
	}
}
