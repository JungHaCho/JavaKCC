package test;

import java.util.Scanner;

import kosa_oop.Book;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Manager manager = new Manager();

		flag: while (true) {

			System.out.println(">1.�߰� 2.��ü��� 3.�˻� 4.����");
			System.out.print(">�޴� : ");
			String choice = sc.nextLine();

			switch (choice) {

			case "1":
				System.out.print(">�̸� : ");
				String name = sc.nextLine();
				System.out.print(">��ȭ��ȣ : ");
				String phoneNo = sc.nextLine();
				System.out.print(">������� : ");
				String birth = sc.nextLine();
				

				PhoneInfo phoneInfo = new PhoneInfo(name, phoneNo, birth);
				manager.add(phoneInfo);

				break;

			case "2":

				manager.printList();
				break;

			case "3":
				System.out.print("�˻��� �̸��� �Է��Ͻÿ�");
				String name1 = sc.nextLine();
				manager.search(name1);
				break;
				
			case "4":
				System.out.println("���α׷� ����");
				break flag;
			}
		}
	}

}