package kosa.data;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Order order = new Order();
		Food food = new Food();
		System.out.println("1. �ֹ���û  2. �ֹ�ó�� 3. ����� �Ѿ� 4. ����");
		String menu = sc.nextLine();
		String menuName;
		int price;
		while (true) {
			switch (menu) {

			case "1":

				System.out.print("���� �Է�");
				menuName = sc.nextLine();
				System.out.print("���� �Է�");
				price = sc.nextInt();
				order.foodOrder(menuName, price);
				break;

			case "2":
				order.foodPulse();

				break;

			case "3":
				break;
			case "4":
				break;
			}
		}
	}
}