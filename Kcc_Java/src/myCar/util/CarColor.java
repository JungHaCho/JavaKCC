package myCar.util;

public enum CarColor {
	RED("Red"),
	WHITE("White"),
	BLACK("Black"),
	Green("Green");
	
	private final String name;
	
	private CarColor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	
}
