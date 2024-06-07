package product;

import kosa.video.t.Video;

public class Customer {
	
	private String id;
	private String name;
	private int balance;
	private Product selectPrdouct;

	public void select(Product product) {
		this.selectPrdouct = product;
	}
	

	public Customer() {
		
	}
	
	public Customer(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
	
	
	

}
