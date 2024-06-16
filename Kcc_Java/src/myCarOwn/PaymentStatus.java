package myCarOwn;

public enum PaymentStatus {
	// ������ü, �������
	TRANSFERRING_MONEY("TRANSFERRING_MONEY"), // ������ü
	ON_SITE_PAYMENT("ON_SITE_PAYMENT"); // �������
	
	private final String name;

	private PaymentStatus(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
