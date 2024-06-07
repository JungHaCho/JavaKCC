package kosa.shopping;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import kosa_phone.PhoneInfo;

public class ShoppingMall {

	private List<User> userList;
	private List<Product> productList;
	private UserException userException;
	
	private Iterator<User> iterUser;
	private Iterator<Product> iterProduct;
//	private OrderList<Queue> orderList;

	public ShoppingMall() {

		userList = new LinkedList<User>();
		productList = new LinkedList<Product>();
		userException = new UserException();
		
	}

	// 고객 등록
	public void createUser() {

		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하시오 >>> ");
		String name = sc.nextLine();
		try {
			UserException.nameException(name);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.print("닉네임을 입력하시오 >>> ");
		String nickname = sc.nextLine();
		System.out.print("주소를 입력하시오 >>> ");
		String addr = sc.nextLine();
		System.out.print("나이를 입력하시오 >>> ");
		int age = sc.nextInt();

		userList.add(new User(name, nickname, addr, age));
	}

	// 고객 리스트 보기
	public void listUser() {
		iterUser = userList.iterator();
		while (iterUser.hasNext()) {
			iterUser.next().toString();
		}
	}
	// 상품 등록하기
	public void createProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품 이름을 입력하시오 >>> ");
		String name = sc.nextLine();
		try {
			UserException.nameException(name);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.print("가격을 입력하시오 >>> ");
		int price = sc.nextInt();
		String blank = sc.nextLine();
		System.out.print("재고를 입력하시오 >>> ");
		int stock = sc.nextInt();
		String blank2 = sc.nextLine();
		
		System.out.print("카테고리를 입력하시오 >>> ");
		String category = sc.nextLine();
		
		productList.add(new Product(name, price, stock, category));
	}
	
	public void listProduct() {
		iterProduct = productList.iterator();
		while (iterProduct.hasNext()) {
			iterProduct.next().toString();
		}
	}

	// 상품 주문하기
	public void createOrder() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("고객 이름을 입력하시오 >>> ");
		String customerName = sc.nextLine();
		if(customerName ==   )
		
		
	}

	// 상품 카테고리별 목록 보기
	public void getFilterProductList() {
		
	}

	// 개별 주문 목록 보기
	public void getOrderListByUser() {

	}

}
