package kosa.menu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Order o = new Order();

		while (true) {
			System.out.println(" �޴��� �����Ͻÿ� >>> 1. �޴�����, 2.�޴����� 3.�ֹ� �߰� 4.���� 5. ���� ��� 6. �Ѹ��� �հ� ");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "1":
				o.addMenuList();
				break;
			case "2":
				o.orderMenuList();
				break;

			case "3":
				o.orderlplusMenu();
				break;
			case "4":
				o.orderDeleteMenu();
				break;
			case "5":
				o.orderPayMenu();
				break;
			case "6":
				o.orderSum();
				break;

			}
		}

	}
}