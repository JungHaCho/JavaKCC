package kosa.shopping;

public enum DeliveryStatus {

	WAITING("�����"), DONE("��ۿϷ�");

	private String value;

	private DeliveryStatus(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
