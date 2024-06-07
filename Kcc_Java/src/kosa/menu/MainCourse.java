package kosa.menu;

public class MainCourse extends MenuItem{

	public String vegetarian;
	
	public MainCourse() {
		
	}

	public MainCourse(String name, String price, String description, String vegetarian) {
		super(name, price, description);
		this.vegetarian = vegetarian;
	}

	public void show() {
		super.show();
		System.out.println("MainCourse 채식주의 식단 : >>"+ vegetarian);
	}
	
	public String getVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(String vegetarian) {
		this.vegetarian = vegetarian;
	}
	
	
	
}
