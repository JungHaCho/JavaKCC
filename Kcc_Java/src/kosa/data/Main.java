package kosa.data;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Order order = new Order();
		Food food = new Food();
		System.out.println("1. 주문요청  2. 주문처리 3. 매출액 총액 4. 종료");
		String menu = sc.nextLine();
		String menuName;
		int price;
		while (true) {
			switch (menu) {

			case "1": //

				System.out.print("음식 입력");
				menuName = sc.nextLine();
				System.out.print("가격 입력");
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
