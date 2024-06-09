package kosa.shopping;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ShoppingMall shop = new ShoppingMall();

		
		while (true) {
			System.out.println("========================");
			System.out.println("1.�� ����ϱ� 2.�� ����Ʈ 3.��ǰ���  4. ��ǰ ī�װ��� ��Ϻ���  5. ��ٱ��Ͽ� �߰��ϱ� 6.������ٱ��� ��� ���� 7.��ǰ�ֹ��ϱ�(����) 8.���� �ֹ� ��� ����");
			System.out.println("========================");
			
			String menu = sc.nextLine();
			switch (menu) {
			case "1":

				System.out.println("=============�� ���=============");
				shop.createUser();
				System.out.println("================================");
				break;
			case "2":
				System.out.println("======== �� ����Ʈ==========");
				shop.listUser();
				System.out.println("=========================");
				break;
			
			case "3":
				System.out.println("===============��ǰ���===============");
				shop.createProduct();
				System.out.println("================================");
				break;
			case "4":
				System.out.println("===========��ǰī�װ��� ��Ϻ���=============");
				shop.getFilterProductList();
				System.out.println("========================");
				break;
			case "5":
				System.out.println("===========��ٱ��Ͽ� �߰��ϱ�=============");
				shop.addCartItem();
				System.out.println("========================");
				break;
			case "6":
				System.out.println("===========���� ��ٱ��� ��� ����=============");
				shop.getCartListByUser();
				System.out.println("========================");
				
				break;
			case "7":
				System.out.println("===========�ֹ��ϱ� (��ٱ��� ����)=============");
				shop.createOrder();
				System.out.println("========================");
				
				break;
			case "8":
				System.out.println("===========���� �ֹ� ��� ����=============");
				shop.getOrderListByUser();
				System.out.println("========================");
				
				break;
				
			}
		}
	}
}
