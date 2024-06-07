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

	// �� ���
	public void createUser() {

		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��Ͻÿ� >>> ");
		String name = sc.nextLine();
		try {
			UserException.nameException(name);
		}catch(Exception e) {
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
		iterUser = userList.iterator();
		while (iterUser.hasNext()) {
			iterUser.next().toString();
		}
	}
	// ��ǰ ����ϱ�
	public void createProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ǰ �̸��� �Է��Ͻÿ� >>> ");
		String name = sc.nextLine();
		try {
			UserException.nameException(name);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.print("������ �Է��Ͻÿ� >>> ");
		int price = sc.nextInt();
		String blank = sc.nextLine();
		System.out.print("��� �Է��Ͻÿ� >>> ");
		int stock = sc.nextInt();
		String blank2 = sc.nextLine();
		
		System.out.print("ī�װ��� �Է��Ͻÿ� >>> ");
		String category = sc.nextLine();
		
		productList.add(new Product(name, price, stock, category));
	}
	
	public void listProduct() {
		iterProduct = productList.iterator();
		while (iterProduct.hasNext()) {
			iterProduct.next().toString();
		}
	}

	// ��ǰ �ֹ��ϱ�
	public void createOrder() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �̸��� �Է��Ͻÿ� >>> ");
		String customerName = sc.nextLine();
		if(customerName ==   )
		
		
	}

	// ��ǰ ī�װ��� ��� ����
	public void getFilterProductList() {
		
	}

	// ���� �ֹ� ��� ����
	public void getOrderListByUser() {

	}

}
