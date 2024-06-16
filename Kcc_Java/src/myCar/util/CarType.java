package myCar.util;

public enum CarType {
	SEDAN("Sedan", "Models"),
	SUV("SUV", "ModelX"),
    HATCHBACK("Hatchback", "ModelY"),
    CONVERTIBLE("Convertible", "ModelC");
	
	private final String brandName;
	private final String modelName;
	
	private CarType(String brandName, String modelName) {
		this.brandName = brandName;
		this.modelName = modelName;
	}

	public String getBrandName() {
		return brandName;
	}

	public String getModelName() {
		return modelName;
	}
	
}
