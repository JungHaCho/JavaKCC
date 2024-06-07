package kosa.shopping;

public enum Category {

	TOP("상의"), BOTTOM("하의"), OUTER("아우터"), ACCESSORY("악세서리"), SHOES("신발");

	private String value;

	private Category(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
