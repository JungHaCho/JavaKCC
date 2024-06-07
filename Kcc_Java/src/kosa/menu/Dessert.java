package kosa.menu;

public class Dessert extends MenuItem{

	public String drinks;
	public String sort;
	
	public Dessert() {
		
	}
	
	public Dessert(String name, String price, String description,String drinks, String sort) {
		super(name, price, description);
		this.drinks = drinks;
		this.sort = sort;
	}
	
	public void show() {
		super.show();
		System.out.println("디저트 음료는? : >>"+ drinks);
		System.out.println("디저트 종류는 (아이스크림, 쿠키) : >>"+ sort);
		
	}

	public String getDrinks() {
		return drinks;
	}

	public void setDrinks(String drinks) {
		this.drinks = drinks;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}


	
	
}
