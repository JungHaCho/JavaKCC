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
	// MenuItem ��ü�� ����� �����ϰ�, �ֹ� �߰�, ����, ���� ���, �Ѹ��� �հ���� �����մϴ�.

	// �޴� ����
	public void addMenuList() {
		sc = new Scanner(System.in);

		System.out.println("������ 1. Appetizer 2. MainCourse 3.Dessert ������ �����Ͻÿ�");
		int menu2 = sc.nextInt();
		String blank = sc.nextLine();

		System.out.print("�����̸�:");
		String name = sc.nextLine();

		System.out.print("���İ���:");
		String price = sc.nextLine();

		System.out.print("���ļ���:");
		String description = sc.nextLine();

		if (menu2 == 1) {
			System.out.print("Appetizer�� Į�θ��� ");
			String calories = sc.nextLine();

			arr[count++] = new Appetizer(name, price, description, calories);

		} else if (menu2 == 2) {

			System.out.print("MainCourse�� ä������ �Ļ� ���� ����");
			String vegetarian = sc.nextLine();

			arr[count++] = new MainCourse(name, price, description, vegetarian);

		} else if (menu2 == 3) {
			System.out.print("����� ");
			String drinks = sc.nextLine();

			System.out.print("����Ʈ ������");
			String sort = sc.nextLine();
			arr[count++] = new Dessert(name, price, description, drinks, sort);

		} else {

			arr[count++] = new MenuItem(name, price, description);

		}

	}
	
	//�޴� ����
	public void orderMenuList() {
		System.out.println(" ========= 1. Appetizer 2. MainCourse 3.Dessert ��� ========= ");

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
				System.out.println("�޴� ��ü ���");
				arr[i].show();
			}
		}
	}

	// �ֹ� �߰�
	public void orderlplusMenu() {
		System.out.print("�ֹ��� ���� �̸�:");
		sc = new Scanner(System.in);

		String name = sc.nextLine();

		int idx = -1;

		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				int price = Integer.parseInt(arr[i].getPrice());
				System.out.println(name+ "�� ������ >> "+price+"�Դϴ�.");
				arrOrder[countOrder++] = new MenuItem(name,Integer.toString(price));
				
				idx = i;
			}
		}
		System.out.print("�� �ֹ�������"+countOrder +"�� �Դϴ�.");
		
		if (idx == -1) {
			System.out.println("�������� �ʽ��ϴ�.");
		}
		
	}

	// �ֹ� ����
	public void orderDeleteMenu() {

		System.out.print("������ ���� �̸�:");
		sc = new Scanner(System.in);

		String name = sc.nextLine();
		for (int i = 0; i < countOrder; i++) {
			if (name.equals(arrOrder[i].getName())) {
				
				arrOrder[countOrder-1] = arrOrder[countOrder];
				
				System.out.println("�����ƽ��ϴ�.");
			}
		}
		
	}

	// �ֹ� ����
	public void orderPayMenu() {

		System.out.println("�ֹ� ������ ");
		for (int i = 0; i < countOrder; i++) {
			
			System.out.println(i+"�� ������ "+arrOrder[i].getName()+"������"+arrOrder[i].getPrice());
		}
	}

	// ���հ�
	public void orderSum() {
		int price = 0;
			for (int i = 0; i < countOrder; i++) {
			
			price =Integer.parseInt(arrOrder[i].getPrice());
			totalPrice += price;
			
		}
		System.out.println("�� ������" + totalPrice);
		
	}
}