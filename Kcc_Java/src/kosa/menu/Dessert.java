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
		System.out.println("����Ʈ �����? : >>"+ drinks);
		System.out.println("����Ʈ ������ (���̽�ũ��, ��Ű) : >>"+ sort);
		
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
