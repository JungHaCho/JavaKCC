package kosa.shopping;

public class Product {

	private static int productUID =1;
	
	private int productId;
	private String name;
	private int price;
	private int stock;
	private Category category;

	public Product() {
		
	}
	public Product( String name, int price, int stock, Category category) {
		super();
		this.productId = productUID++;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.category = category;
	}

	
	public String listProduct() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", stock=" + stock
				+ ", category=" + category + "]";
	}
	
	public String infoProduct() {
		return   "["+"물건이름=" + name + ", 가격=" + price + ", category=" + category  +"]";
	}
	

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	

	
}
