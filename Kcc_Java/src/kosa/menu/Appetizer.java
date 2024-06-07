package kosa.menu;

public class Appetizer extends MenuItem{

	public String calories;
	
	public Appetizer() {
		
	}

	public Appetizer(String name, String price,String description, String calories) {
		super(name, price, description);
		this.calories = calories;
	}
	
	public void show() {
		super.show();
		System.out.println("Appetizer Į�θ���??  : >>"+ calories);
	}

	public String getCalories() {
		return calories;
	}

	public void setCalories(String calories) {
		this.calories = calories;
	}
	
	
	
}
