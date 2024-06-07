package kosa_oop;

public class Book {

	String bookName;
	int price;
	int dc_price;
	
	public Book() {}
	public Book(String bookName, int price) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.dc_price = dc_price;
		
	}
	public Book(String bookName, int price, int dc_price) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.dc_price = dc_price;
		
	}
	
	public void discount() {
		if(price >= 30000) {
			dc_price = (int)(price * 0.75) ;
			
		}else if(price >= 20000){
			dc_price = (int)(price * 0.8) ;
			
		}else {
			dc_price = (int)(price * 0.85);
			
		}
	}
	
	public void printBook() {
		System.out.println( bookName +" 교재의 정가는 "+ price + "원 할인된 가격은 " +dc_price+"원입니다.");
	}


}
