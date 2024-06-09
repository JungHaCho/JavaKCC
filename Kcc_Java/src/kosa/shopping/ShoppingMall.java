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

	// �� ���
	public void createUser() {

		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��Ͻÿ� >>> ");
		String name = sc.nextLine();
		try {
			UserException.nameException(name);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.print("�г����� �Է��Ͻÿ� >>> ");
		String nickname = sc.nextLine();
		System.out.print("�ּҸ� �Է��Ͻÿ� >>> ");
		String addr = sc.nextLine();
		System.out.print("���̸� �Է��Ͻÿ� >>> ");
		int age = sc.nextInt();

		userList.add(new User(name, nickname, addr, age));
	}

	// �� ����Ʈ ����
	public void listUser() {

		System.out.println();
		for (User user : userList) {
			System.out.println(user.printUserInfo());
		}
	}

	// ��ǰ ����ϱ�
	public void createProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ǰ �̸��� �Է��Ͻÿ� >>> ");
		String name = sc.nextLine();

		try {
			UserException.nameException(name);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.print("������ �Է��Ͻÿ� >>> ");
		int price = sc.nextInt();

		System.out.print("��� �Է��Ͻÿ� >>> ");
		int stock = sc.nextInt();

		System.out.println("1. ����\t 2. ����\t3. �ƿ���\t 4. �Ǽ�����\t 5. �Ź�\t");
		System.out.print("ī�װ� ��ȣ�� �Է��Ͻÿ� >>> ");
		int categoryIndex = sc.nextInt();
		Category category = Category.values()[categoryIndex - 1];// 0���� ������

		productList.add(new Product(name, price, stock, category));
	}

	// ��ǰ ī�װ��� ��� ����
	public void getFilterProductList() {
//		map<key ,value>

		System.out.println("ī�װ��� �Է��Ͻÿ� >>> ����\\t  ����\\t  �ƿ���\\t  �Ǽ�����\\t  �Ź�\\t");

		Scanner sc = new Scanner(System.in);
		String strCategory = sc.nextLine();
		for (Product product : productList) {

			// �Է¹��� strCategory�� getCategory���� ������ ���
			if (product.getCategory().getValue().equals(strCategory)) {
				System.out.println(product.listProduct());
			}
		}
	}

	// ��ٱ��� �߰��ϱ�
	public void addCartItem() {
//List<Product> productList, User fromUser)

		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹ��� �� �̸��� �Է��Ͻÿ� >>> ");
		String customerName = sc.nextLine();
		System.out.print("�ֹ��� ��ǰ �̸��� �Է��Ͻÿ� >>> ");
		String productName = sc.nextLine();
		// ���� �Ҷ� ��� �������� ���� ������ ����
		System.out.print("�ֹ��� ��ǰ ������ �Է��Ͻÿ� >>> ");
		orderProductStock = sc.nextInt();

		// �� �̸� ��ġ
		for (User user : userList) {
			System.out.println(user.getName());
			System.out.println(customerName);
			if (user.getName().equals(customerName)) {

				// ��ǰ ������ġ
				for (Product product : productList) {
					if (product.getName().equals(productName)) {
						// product ������ �߰�
						user.addCartItem(product);
						System.out.println(">" + product.getName() + "�� ��ٱ��Ͽ� �߰��ƽ��ϴ�.");
						break;
					} else {
						System.out.println("���� ��ǰ�Դϴ�.");
					}
				}

			} else {
				System.out.println("���� ����� �Դϴ�.");
				break;
			}
		}

	}

	// ���� ��ٱ��� ��� ����
	public void getCartListByUser() {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� ��ٱ��� ����� �� �� �̸��� �Է��Ͻÿ� >>> ");
		String orderCartCustomerName = sc.nextLine();

		for (User usercheck : userList) {
			// user üũ
			if (usercheck.getName().equals(orderCartCustomerName)) {
				// user�� ����� ��ǰ��ü�� ��ü ���
				for (Product userCart : usercheck.getCart()) {
					System.out.println(userCart.infoProduct());
					
				}
				break;
			} else {
				System.out.println("���� ������Դϴ�.");
			}
			break;
		}

	}

	// ��ǰ �ֹ�(�����ϱ�)
	public void createOrder() {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� �̸��� �Է��Ͻÿ� >>> ");
		String CustomerName = sc.nextLine();
		int totalPrice =0;
		
		for (User usercheck : userList) {
			if (usercheck.getName().equals(CustomerName)) {
				// �ֹ� ���
				for (Product userCart : usercheck.getCart()) {
					System.out.println("�ֹ��Ͻ� ����� >>" + userCart.infoProduct() + "�Դϴ�.");
					totalPrice += userCart.getPrice();
				}
				
				// �ֹ� ���� ���� �߰�
				orderList.add(new Order(usercheck.getCart(), usercheck));
				
				//OrderŬ������ totalPrice ���� ��� set�ϳ�????????????????????
				for (Order userOrder : orderList) {
					userOrder.setTotalPrice(totalPrice);
				}
				
				System.out.println("���� �ƽ��ϴ�.");
				usercheck.setCart(null);
			}
		}

	}

	// ���� �ֹ� ��� ����
	public void getOrderListByUser() {

		Scanner sc = new Scanner(System.in);
		System.out.print("���������� ������� �� �̸��� �Է��Ͻÿ� >>> ");
		String CustomerName = sc.nextLine();

		for (User usercheck : userList) {
			if (usercheck.getName().equals(CustomerName)) {
				
				// �Է��� user�̸��̶� 
				// OrderŬ������ fromUser ������ 
				// orderList�ȿ����� order�� (�ε���??) ��ü�ּҰ��� ��� �� �� �ֳ�
				for (Order order : orderList) {
					order.getFromUser().get;
				}
			}
		}
	}

}
