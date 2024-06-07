package kosa.menu;

import java.util.Scanner;

public class Order {

	private MenuItem arr[];
	private MenuItem arrOrder[];
	private Scanner sc;
	private int count;
	private int countOrder;
	private int totalPrice;
	
	public Order() {

		arr = new MenuItem[10];
		arrOrder = new MenuItem[10];
	}
	// MenuItem 객체의 목록을 저장하고, 주문 추가, 삭제, 결제 기능, 총매출 합계등을 제공합니다.

	// 메뉴 저장
	public void addMenuList() {
		sc = new Scanner(System.in);

		System.out.println("저장할 1. Appetizer 2. MainCourse 3.Dessert 종류를 선택하시오");
		int menu2 = sc.nextInt();
		String blank = sc.nextLine();

		System.out.print("음식이름:");
		String name = sc.nextLine();

		System.out.print("음식가격:");
		String price = sc.nextLine();

		System.out.print("음식설명:");
		String description = sc.nextLine();

		if (menu2 == 1) {
			System.out.print("Appetizer의 칼로리는 ");
			String calories = sc.nextLine();

			arr[count++] = new Appetizer(name, price, description, calories);

		} else if (menu2 == 2) {

			System.out.print("MainCourse의 채식주의 식사 가능 여부");
			String vegetarian = sc.nextLine();

			arr[count++] = new MainCourse(name, price, description, vegetarian);

		} else if (menu2 == 3) {
			System.out.print("음료는 ");
			String drinks = sc.nextLine();

			System.out.print("디저트 종류는");
			String sort = sc.nextLine();
			arr[count++] = new Dessert(name, price, description, drinks, sort);

		} else {

			arr[count++] = new MenuItem(name, price, description);

		}

	}
	
	//메뉴 보기
	public void orderMenuList() {
		System.out.println(" ========= 1. Appetizer 2. MainCourse 3.Dessert 출력 ========= ");

		int menu2 = sc.nextInt();
		String blank = sc.nextLine();

		if (menu2 == 1) {
			for (int i = 0; i < count; i++) {
				if (arr[i] instanceof Appetizer) {
					((Appetizer) arr[i]).show();
				}
			}
		} else if (menu2 == 2) {
			for (int i = 0; i < count; i++) {
				if (arr[i] instanceof MainCourse) {
					((MainCourse) arr[i]).show();
				}
			}
		} else if (menu2 == 3) {
			for (int i = 0; i < count; i++) {
				((Dessert) arr[i]).show();
			}
		} else {
			for (int i = 0; i < count; i++) {
				System.out.println("메뉴 전체 출력");
				arr[i].show();
			}
		}
	}

	// 주문 추가
	public void orderlplusMenu() {
		System.out.print("주문할 음식 이름:");
		sc = new Scanner(System.in);

		String name = sc.nextLine();

		int idx = -1;

		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				int price = Integer.parseInt(arr[i].getPrice());
				System.out.println(name+ "의 가격은 >> "+price+"입니다.");
				arrOrder[countOrder++] = new MenuItem(name,Integer.toString(price));
				
				idx = i;
			}
		}
		System.out.print("총 주문내용은"+countOrder +"개 입니다.");
		
		if (idx == -1) {
			System.out.println("존재하지 않습니다.");
		}
		
	}

	// 주문 삭제
	public void orderDeleteMenu() {

		System.out.print("삭제할 음식 이름:");
		sc = new Scanner(System.in);

		String name = sc.nextLine();
		for (int i = 0; i < countOrder; i++) {
			if (name.equals(arrOrder[i].getName())) {
				
				arrOrder[countOrder-1] = arrOrder[countOrder];
				
				System.out.println("삭제됐습니다.");
			}
		}
		
	}

	// 주문 결제
	public void orderPayMenu() {

		System.out.println("주문 내역은 ");
		for (int i = 0; i < countOrder; i++) {
			
			System.out.println(i+"번 음식은 "+arrOrder[i].getName()+"가격은"+arrOrder[i].getPrice());
		}
	}

	// 총합계
	public void orderSum() {
		int price = 0;
			for (int i = 0; i < countOrder; i++) {
			
			price =Integer.parseInt(arrOrder[i].getPrice());
			totalPrice += price;
			
		}
		System.out.println("총 가격은" + totalPrice);
		
	}
}
