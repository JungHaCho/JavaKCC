package kosa.shopping;

public enum DeliveryStatus {

	WAITING("배송중"), DONE("배송완료");

	private String value;

	private DeliveryStatus(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
