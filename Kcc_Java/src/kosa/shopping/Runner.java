package kosa.shopping;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ShoppingMall shop = new ShoppingMall();

		
		while (true) {
			System.out.println("1.�� ����ϱ� 2.��ǰ��� 3. ��ǰ�ֹ� 4. ��ǰ ī�װ��� ��Ϻ��� 5. ������� ����");

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
