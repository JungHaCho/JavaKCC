package kosa_phone;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Manager {

	/*
	 * ## Company
	 * 
	 * ȸ�絿�� (�μ�: dept, ��å : postion)
	 * 
	 * Universe - major, year
	 * 
	 * 1. �߰�
	 * 
	 * 1. �Ϲ�(��ü) 2. ȸ�� (����)3.��â(��â)
	 * 
	 * 2.ȸ��
	 * 
	 * 1. ��â
	 */
//	private PhoneInfo arr[];
	private Scanner sc;
	private int count;

	private List<PhoneInfo> list;
	private Iterator<PhoneInfo> it;

	public Manager() {
//		arr = new PhoneInfo[10];
		list = new LinkedList<PhoneInfo>();

	}

	public void addPhoneInfo() {

		DateInput.s();
		sc = DateInput.sc;

		System.out.println("1. �Ϲ�(��ü) 2. ȸ�� (����)3.��â(��â) �Է��ϼ���");

		int menu2 = sc.nextInt();
		String blank = sc.nextLine();
		System.out.print("�̸�:");
		String name = sc.nextLine();

		System.out.print("��ȭ��ȣ:");
		String phoneNo = sc.nextLine();

		System.out.print("�������:");
		String birth = sc.nextLine();

		if (menu2 == 1) {

//			arr[count++] = new PhoneInfo(name, phoneNo, birth);
			list.add(new PhoneInfo(name, phoneNo, birth));
		} else if (menu2 == 2) {

			System.out.print("�μ�:");
			String dept = sc.nextLine();

			System.out.print("��å:");
			String position = sc.nextLine();
//			arr[count++] = new Company(name, phoneNo, birth, dept, position);
			list.add(new Company(name, phoneNo, birth, dept, position));
		} else {
			System.out.print("����:");
			String major = sc.nextLine();

			System.out.print("��:");
			String year = sc.nextLine();
//			arr[count++] = new Universe(name, phoneNo, birth, major, year);
			list.add(new Universe(name, phoneNo, birth, major, year));
		}

	}

	public void listPhoneInfo() {
		System.out.println(" ========= 1. �Ϲ�(��ü)  2. (����)  3.(��â) ��� ========= ");

		int menu2 = sc.nextInt();
		String blank = sc.nextLine();

		if (menu2 == 1) {
//			for (PhoneInfo el : list) {
//				el.show();
//			}
			it = list.iterator();
			while (it.hasNext()) {
				it.next().show();
			}

		} else if (menu2 == 2) {
			for (PhoneInfo p : list) {
				if (p instanceof Company) {
					((Company) p).Companyshow();
				}
			}
	
//			it = list.iterator();
//			while (it.hasNext()) {
//				if ((it.next()) instanceof Company) {
//					((Company) it.next()).Companyshow();
//				}
//				
//			}

		} else if (menu2 == 3) {
			for (PhoneInfo p : list) {
				if (p instanceof Universe) {
					((Universe) p).Univershow();
				}
			}
//			it = list.iterator();
//			while (it.hasNext()) {
//				if (it.next() instanceof Universe) {
//					((Universe) it.next()).Univershow();
//				}
//				it.next().show();
//			}
		}
	}

	public void searchPhoneInfo() {
		System.out.print("�̸�:");
		DateInput.s();
		sc = DateInput.sc;

		String name = sc.nextLine();

		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				System.out.print(name + "ã�ҽ��ϴ� ");

			} else {
				System.out.println("��ã�ҽ��ϴ�");
			}
		}

	}

	public void updatePhoneInfo() {
		// �̸��� �Է� => �ش� phoneInfo ���� => ���� ��ȭ��ȣ �Է� => ��ȭ��ȣ ������ �Ϸ�
		System.out.print("�̸�:");
		DateInput.s();
		sc = DateInput.sc;

		String name = sc.nextLine();

		int idx = -1;

		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				System.out.print("���� ��ȭ��ȣ >> ");
				String phoneNo = sc.nextLine();
				list.get(i).setPhoneNo(phoneNo);
				idx = i;
			}
		}
		if (idx == -1) {
			System.out.println("�������� �ʽ��ϴ�.");
		}
	}

	public void deletePhoneInfo() {
		// �̸��Է� -> ���ü �˻� => �ε��� ã�� => �ش� ��ü ����
		// �ε��� ���̱�
		System.out.print("�̸�:");
		String name = sc.nextLine();

		int idx = -1;
		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				list.remove(list.get(i));
			}
		}
//		if (idx == -1) {
//			System.out.println("�������� �ʽ��ϴ�.");
//		} else {
//			for (int i = idx; i < list.size(); i++) {
//				if (i == list.size() - 1) {
//					list = null;
//				} else {
//					arr[i] = arr[i + 1];
//				}
//			}
//			count--;
//		}

	}

	public void addSub() {
		System.out.print("�̸�:");
		String name = sc.nextLine();

	}

}