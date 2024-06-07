package kosa_phone;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Manager {

	/*
	 * ## Company
	 * 
	 * 회사동료 (부서: dept, 직책 : postion)
	 * 
	 * Universe - major, year
	 * 
	 * 1. 추가
	 * 
	 * 1. 일반(전체) 2. 회사 (동료)3.동창(동창)
	 * 
	 * 2.회사
	 * 
	 * 1. 동창
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

		System.out.println("1. 일반(전체) 2. 회사 (동료)3.동창(동창) 입력하세요");

		int menu2 = sc.nextInt();
		String blank = sc.nextLine();
		System.out.print("이름:");
		String name = sc.nextLine();

		System.out.print("전화번호:");
		String phoneNo = sc.nextLine();

		System.out.print("생년월일:");
		String birth = sc.nextLine();

		if (menu2 == 1) {

//			arr[count++] = new PhoneInfo(name, phoneNo, birth);
			list.add(new PhoneInfo(name, phoneNo, birth));
		} else if (menu2 == 2) {

			System.out.print("부서:");
			String dept = sc.nextLine();

			System.out.print("직책:");
			String position = sc.nextLine();
//			arr[count++] = new Company(name, phoneNo, birth, dept, position);
			list.add(new Company(name, phoneNo, birth, dept, position));
		} else {
			System.out.print("전공:");
			String major = sc.nextLine();

			System.out.print("날:");
			String year = sc.nextLine();
//			arr[count++] = new Universe(name, phoneNo, birth, major, year);
			list.add(new Universe(name, phoneNo, birth, major, year));
		}

	}

	public void listPhoneInfo() {
		System.out.println(" ========= 1. 일반(전체)  2. (동료)  3.(동창) 출력 ========= ");

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
		System.out.print("이름:");
		DateInput.s();
		sc = DateInput.sc;

		String name = sc.nextLine();

		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				System.out.print(name + "찾았습니다 ");

			} else {
				System.out.println("못찾았습니다");
			}
		}

	}

	public void updatePhoneInfo() {
		// 이름을 입력 => 해당 phoneInfo 추출 => 수정 전화번호 입력 => 전화번호 수정이 완료
		System.out.print("이름:");
		DateInput.s();
		sc = DateInput.sc;

		String name = sc.nextLine();

		int idx = -1;

		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				System.out.print("수정 전화번호 >> ");
				String phoneNo = sc.nextLine();
				list.get(i).setPhoneNo(phoneNo);
				idx = i;
			}
		}
		if (idx == -1) {
			System.out.println("존재하지 않습니다.");
		}
	}

	public void deletePhoneInfo() {
		// 이름입력 -> 대상객체 검색 => 인덱스 찾기 => 해당 객체 삭제
		// 인덱스 줄이기
		System.out.print("이름:");
		String name = sc.nextLine();

		int idx = -1;
		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				list.remove(list.get(i));
			}
		}
//		if (idx == -1) {
//			System.out.println("존재하지 않습니다.");
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
		System.out.print("이름:");
		String name = sc.nextLine();

	}

}
