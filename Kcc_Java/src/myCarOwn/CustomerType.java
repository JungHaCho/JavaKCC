package myCarOwn;

public enum CustomerType {
	PERSONAL("PERSONAL"), // ���� 
	CORPORATION("CORPORATION"); // ����

	private final String type;
	
	private CustomerType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
