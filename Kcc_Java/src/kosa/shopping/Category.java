package kosa.shopping;

public enum Category {

	TOP("����"), BOTTOM("����"), OUTER("�ƿ���"), ACCESSORY("�Ǽ�����"), SHOES("�Ź�");

	private String value;

	private Category(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
