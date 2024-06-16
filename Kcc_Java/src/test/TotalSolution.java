package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import myCar.util.CarColor;
import myCar.util.CarType;
import myCar.util.PaymentStatus;

public class TotalSolution {

	public TotalSolution() {

	}

	// TODO Auto-generated method stub

	// 1. (로그인) 관리자, 딜러 메뉴가 다름
	// 2. 관리자 : 자동차 crud
	// 3. 딜러 : 차량 전체 조회, 상세조회
	// 4. 딜러 : 활동관리 crud
	Login login = new Login();

	Employee loginEmployee;
	String id;
	CarManager cm = new CarManager();
	Scanner sc = new Scanner(System.in);

	while(true)
	{
		System.out.print(">이름을 입력 하세요 : ");
		id = sc.nextLine();
		loginEmployee = login.findEmployee(id);
		if (loginEmployee instanceof Admin) {
			System.out.println("==========관리자 페이지 입니다.==========");
			System.out.println(" 1. 차량 등록       2. 차량 등록  ");
			System.out.println("===============================");
		} else if (loginEmployee instanceof Dealer) {
			System.out.println("==========딜러 페이지 입니다.==========");
			System.out.println("==============================");
		}
	}

}
