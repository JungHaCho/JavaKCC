package product;

public class Product {
	
	private String p_id;
	private String p_name;
	private int p_price;
	private int p_num;
	
	public Product() {

	}
	
	public Product(String p_id, String p_name, int p_price, int p_num) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_price = p_price;
		this.p_num = p_num;
	}

	public String getP_id() {
		return p_id;
	}

	public void setP_id(String p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public int getP_num() {
		return p_num;
	}

	public void setP_num(int p_num) {
		this.p_num = p_num;
	}
	
	public void printProduct() {
		System.out.println("상품 번호 : "+ p_id);
		System.out.println("상품 이름: "+ p_name);
		System.out.println("상품 가격 : "+ p_price);
		System.out.println("재고 현황 : "+ p_num);
	}
	
	

}
