package product;



public class Main {
		
	public static void main(String[] args) {
		
		
		Customer c1 = new Customer("고객1","조정하",10000);
		Customer c2 = new Customer("고객2","철원",30000);
		
		Product p1 = new Product("상품1","커피",3000,20);
		Product p2 = new Product("상품2","콜라",1000,20);
		
		
		c1.select(p1);
		
		
		
		
		
	}

}
