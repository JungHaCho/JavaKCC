package kosa.shopping;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ShoppingMall shop = new ShoppingMall();

		
		while (true) {
			System.out.println("1.고객 등록하기 2.상품등록 3. 상품주문 4. 상품 카테고리별 목록보기 5. 개별목록 보기");

			String menu = sc.nextLine();
			switch (menu) {
			case "1":

				shop.createUser();
				shop.listUser();
				break;
			case "2":

				shop.createProduct();
				
				break;
			
			case "3":

				break;
			case "4":

				break;
			case "5":
				break;
			case "6":
				shop.listProduct();
				System.out.println("+666");
				break;
				
			}
		}
	}
}
