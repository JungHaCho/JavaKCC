package kosa.menu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Order o = new Order();

		while (true) {
			System.out.println(" 메뉴를 선택하시오 >>> 1. 메뉴저장, 2.메뉴보기 3.주문 추가 4.삭제 5. 결제 기능 6. 총매출 합계 ");
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
