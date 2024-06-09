package kosa.shopping;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ShoppingMall {

	private List<User> userList;
	private List<Product> productList;
	private List<Order> orderList;
	private UserException userException;

	private Iterator<User> iterUser;
	private Iterator<Product> iterProduct;
	private Map<String, Integer> map;
	private int orderProductStock;
//	private OrderList<Queue> orderList;

	public ShoppingMall() {

		userList = new LinkedList<User>();
		productList = new LinkedList<Product>();
		orderList = new LinkedList<Order>();
		userException = new UserException();

	}

	// 고객 등록
	public void createUser() {

		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하시오 >>> ");
		String name = sc.nextLine();
		try {
			UserException.nameException(name);
		} catch (Exception e) {
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

		System.out.println();
		for (User user : userList) {
			System.out.println(user.printUserInfo());
		}
	}

	// 상품 등록하기
	public void createProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품 이름을 입력하시오 >>> ");
		String name = sc.nextLine();

		try {
			UserException.nameException(name);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.print("가격을 입력하시오 >>> ");
		int price = sc.nextInt();

		System.out.print("재고를 입력하시오 >>> ");
		int stock = sc.nextInt();

		System.out.println("1. 상의\t 2. 하의\t3. 아우터\t 4. 악세서리\t 5. 신발\t");
		System.out.print("카테고리 번호를 입력하시오 >>> ");
		int categoryIndex = sc.nextInt();
		Category category = Category.values()[categoryIndex - 1];// 0부터 시작함

		productList.add(new Product(name, price, stock, category));
	}

	// 상품 카테고리별 목록 보기
	public void getFilterProductList() {
//		map<key ,value>

		System.out.println("카테고리를 입력하시오 >>> 상의\\t  하의\\t  아우터\\t  악세서리\\t  신발\\t");

		Scanner sc = new Scanner(System.in);
		String strCategory = sc.nextLine();
		for (Product product : productList) {

			// 입력받은 strCategory와 getCategory값이 같으면 출력
			if (product.getCategory().getValue().equals(strCategory)) {
				System.out.println(product.listProduct());
			}
		}
	}

	// 장바구니 추가하기
	public void addCartItem() {
//List<Product> productList, User fromUser)

		Scanner sc = new Scanner(System.in);
		System.out.print("주문할 고객 이름을 입력하시오 >>> ");
		String customerName = sc.nextLine();
		System.out.print("주문할 상품 이름을 입력하시오 >>> ");
		String productName = sc.nextLine();
		// 결제 할때 재고 빼기위해 전역 변수로 설정
		System.out.print("주문할 상품 갯수를 입력하시오 >>> ");
		orderProductStock = sc.nextInt();

		// 고객 이름 일치
		for (User user : userList) {
			System.out.println(user.getName());
			System.out.println(customerName);
			if (user.getName().equals(customerName)) {

				// 상품 정보일치
				for (Product product : productList) {
					if (product.getName().equals(productName)) {
						// product 참조값 추가
						user.addCartItem(product);
						System.out.println(">" + product.getName() + "가 장바구니에 추가됐습니다.");
						break;
					} else {
						System.out.println("없는 제품입니다.");
					}
				}

			} else {
				System.out.println("없는 사용자 입니다.");
				break;
			}
		}

	}

	// 개별 장바구니 목록 보기
	public void getCartListByUser() {

		Scanner sc = new Scanner(System.in);
		System.out.print("개별 장바구니 목록을 볼 고객 이름을 입력하시오 >>> ");
		String orderCartCustomerName = sc.nextLine();

		for (User usercheck : userList) {
			// user 체크
			if (usercheck.getName().equals(orderCartCustomerName)) {
				// user의 저장된 상품객체들 전체 출력
				for (Product userCart : usercheck.getCart()) {
					System.out.println(userCart.infoProduct());
					
				}
				break;
			} else {
				System.out.println("없는 사용자입니다.");
			}
			break;
		}

	}

	// 상품 주문(결제하기)
	public void createOrder() {

		Scanner sc = new Scanner(System.in);
		System.out.print("결제할 고객 이름을 입력하시오 >>> ");
		String CustomerName = sc.nextLine();
		int totalPrice =0;
		
		for (User usercheck : userList) {
			if (usercheck.getName().equals(CustomerName)) {
				// 주문 목록
				for (Product userCart : usercheck.getCart()) {
					System.out.println("주문하실 목록은 >>" + userCart.infoProduct() + "입니다.");
					totalPrice += userCart.getPrice();
				}
				
				// 주문 결제 내역 추가
				orderList.add(new Order(usercheck.getCart(), usercheck));
				
				//Order클래스의 totalPrice 값을 어떻게 set하나????????????????????
				for (Order userOrder : orderList) {
					userOrder.setTotalPrice(totalPrice);
				}
				
				System.out.println("결제 됐습니다.");
				usercheck.setCart(null);
			}
		}

	}

	// 개별 주문 목록 보기
	public void getOrderListByUser() {

		Scanner sc = new Scanner(System.in);
		System.out.print("결제내역을 보고싶은 고객 이름을 입력하시오 >>> ");
		String CustomerName = sc.nextLine();

		for (User usercheck : userList) {
			if (usercheck.getName().equals(CustomerName)) {
				
				// 입력한 user이름이랑 
				// Order클래스의 fromUser 같을때 
				// orderList안에서의 order의 (인덱스??) 객체주소값을 어떻게 알 수 있나
				for (Order order : orderList) {
					order.getFromUser().get;
				}
			}
		}
	}

}
