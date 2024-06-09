package kosa.shopping;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ShoppingMall shop = new ShoppingMall();

		
		while (true) {
			System.out.println("========================");
			System.out.println("1.고객 등록하기 2.고객 리스트 3.상품등록  4. 상품 카테고리별 목록보기  5. 장바구니에 추가하기 6.개별장바구니 목록 보기 7.상품주문하기(결제) 8.개별 주문 목록 보기");
			System.out.println("========================");
			
			String menu = sc.nextLine();
			switch (menu) {
			case "1":

				System.out.println("=============고객 등록=============");
				shop.createUser();
				System.out.println("================================");
				break;
			case "2":
				System.out.println("======== 고객 리스트==========");
				shop.listUser();
				System.out.println("=========================");
				break;
			
			case "3":
				System.out.println("===============상품등록===============");
				shop.createProduct();
				System.out.println("================================");
				break;
			case "4":
				System.out.println("===========상품카테고리별 목록보기=============");
				shop.getFilterProductList();
				System.out.println("========================");
				break;
			case "5":
				System.out.println("===========장바구니에 추가하기=============");
				shop.addCartItem();
				System.out.println("========================");
				break;
			case "6":
				System.out.println("===========개별 장바구니 목록 보기=============");
				shop.getCartListByUser();
				System.out.println("========================");
				
				break;
			case "7":
				System.out.println("===========주문하기 (장바구니 결제)=============");
				shop.createOrder();
				System.out.println("========================");
				
				break;
			case "8":
				System.out.println("===========개별 주문 목록 보기=============");
				shop.getOrderListByUser();
				System.out.println("========================");
				
				break;
				
			}
		}
	}
}
