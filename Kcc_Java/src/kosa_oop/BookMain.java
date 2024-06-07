package kosa_oop;

import java.util.Scanner;

public class BookMain {
	
	
	public static void main(String[] args) {
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		//같은 데이터 타입의 (클래스)객체를 넣을 수 있다. 
		Book arr[] = {
				new Book("JAVA",30000),
				new Book("JSP",20000),
				new Book("Oracle",15000)
		};
		
		for(Book b : arr) {
			b.discount();
			b.printBook();
			total +=b.dc_price;
		}
		
		System.out.println("총합 : "+total);
	}
	
}
