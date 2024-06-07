package kosa.bank.p;

public class Account {

	private String id;
	private long balance;

	public Account() {

	}

	public Account(String id, long balance) {
		this.balance = balance;
		this.id = id;
	}

	public void deposit(long amount) {

		balance += amount;
	}

	public boolean withdraw(long amount) {
		boolean result = true;

		return result;
	}

	public void getId(String id) {
		this.id = id;
	}

	public long getBalance() {
		return balance;
	}



	
	
	
}
