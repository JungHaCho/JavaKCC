package myCar.domain;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarManager cm = new CarManager();
		Scanner sc = new Scanner(System.in);
		int carMenu;

		while (true) {
			System.out.println("1. 차등록 2. 전체 차량 조회 3. 차량 세부정보 조회 4. 차량정보 수정 차량 삭제 ");
			carMenu = sc.nextInt();
			int searchNum =0;
			int changePrice =0;
			switch (carMenu) {

			case 1:

				System.out.println("==========차 등록 페이지 ===========");
				System.out.println("차 카테고리 종류를 입력하세요");
				System.out.println("(1) SEDAN(2) SUV(3) Hatchback (4) Convertible");
				System.out.print(">");
				int carTypeIdx =  sc.nextInt();

				System.out.println("차 색상 입력하세요");
				System.out.println("(1)Red(2) White(3) Black (4) Green");
				System.out.print(">");
				int carColorIdx = sc.nextInt();

				System.out.println(" 결재 상태를 입력하세요");
				System.out.println("(1) 결재종료 (2) 결재대기 (3) 결재중");
				System.out.print(">");
				int carpayStatusIdx = sc.nextInt();

				System.out.println("차 번호판을 입력하세요");
				System.out.print(">");
				String blank = sc.nextLine();
				String carNum = sc.nextLine();

				System.out.println(" 결재 금액을 입력하세요");
				System.out.print(">");
				int price = sc.nextInt();

				System.out.println("주행거리 입력하세요");
				System.out.print(">");
				int distance = sc.nextInt();

				System.out.println("연식을 입력하세요");
				System.out.print(">");
				String blank2 = sc.nextLine();
				String birth = sc.nextLine();

				cm.addCar(carTypeIdx, carColorIdx, carpayStatusIdx, carNum, price, distance, birth);

				break;
			case 2:
				System.out.println("\n============차 전체정보 가져오기============");
				cm.getListCar();
				break;

			case 3:
				System.out.println("\n===========차 세부정보 가져오기=============");
				System.out.println("차량 고유번호를 입력하세요");
				System.out.print(">");
				searchNum = sc.nextInt();
				cm.getCar(searchNum);
				break;
			case 4:
				System.out.println("\n===========차 정보 수정하기=============");
				System.out.println("차량 고유번호를 입력하세요");
				System.out.print(">");
				searchNum = sc.nextInt();
				System.out.println("변경하실 차량 가격을 입력하세요");
				System.out.print(">");
				changePrice = sc.nextInt();
				cm.editCar(searchNum, changePrice);
				System.out.println("> 성공적으로 변경됐습니다.");
				
				break;
			case 5:
				System.out.println("\n===========차 정보 삭제하기=============");
				System.out.println("차량 고유번호를 입력하세요");
				System.out.print(">");
				searchNum = sc.nextInt();
				cm.deleteCar(searchNum);
				System.out.println("> 성공적으로 삭제됐습니다.");
				break;
			}

		}
	}
}
