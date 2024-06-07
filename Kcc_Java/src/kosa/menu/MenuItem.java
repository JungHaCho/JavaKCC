package kosa.menu;

public class MenuItem {
	
	private String name;
	private String price;
	private String description;
	
	
	public MenuItem() {
		
	}
	
	public MenuItem(String name, String price) {
		super();
		this.name = name;
		this.price = price;
		
	}

	

	public MenuItem(String name, String price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}


	public void show() {
		System.out.println("���� �̸� >>" + name);
		System.out.println("���� ���� >>" + price);
		System.out.println("���� ���� >>" + description);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
