package myCar.util;

public enum PaymentStatus {

	TRANSFERRING_MONEY("TRANSFERRING_MONEY"), 
	ON_SITE_PAYMENT("ON_SITE_PAYMENT"); 
	
	private final String name;

	private PaymentStatus(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
