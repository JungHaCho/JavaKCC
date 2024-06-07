package test;

import java.util.Scanner;

import kosa_oop.Book;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Manager manager = new Manager();

		flag: while (true) {

			System.out.println(">1.추가 2.전체출력 3.검색 4.종료");
			System.out.print(">메뉴 : ");
			String choice = sc.nextLine();

			switch (choice) {

			case "1":
				System.out.print(">이름 : ");
				String name = sc.nextLine();
				System.out.print(">전화번호 : ");
				String phoneNo = sc.nextLine();
				System.out.print(">생년월일 : ");
				String birth = sc.nextLine();
				

				PhoneInfo phoneInfo = new PhoneInfo(name, phoneNo, birth);
				manager.add(phoneInfo);

				break;

			case "2":

				manager.printList();
				break;

			case "3":
				System.out.print("검색할 이름을 입력하시오");
				String name1 = sc.nextLine();
				manager.search(name1);
				break;
				
			case "4":
				System.out.println("프로그램 종료");
				break flag;
			}
		}
	}

}
