package kosa.shopping;

public class Product {

	private static int productUID =1;
	
	private int productId;
	private String name;
	private int price;
	private int stock;
	private String category;

	public Product( String name, int price, int stock, String category) {
		super();
		this.productId = productUID++;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", stock=" + stock
				+ ", category=" + category + "]";
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	

	
}
