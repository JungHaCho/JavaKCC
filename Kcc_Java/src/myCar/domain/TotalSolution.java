package myCar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import myCar.util.CarColor;
import myCar.util.CarType;
import myCar.util.PaymentStatus;

public class TotalSolution {
	
	
	public void add(int carTypeIdx, int carColorIdx, int carpayStatusIdx,String carNum, int price, int distance,String birth) {
		CarManager carManager = new CarManager();
		Dealer dealer = new Dealer();
		
		Car newDealerCar =  dealer.addCar(addCar);
		carManager.addCar(carTypeIdx, carColorIdx, carpayStatusIdx, carNum, price, distance, birth);
	}
	
	// TODO Auto-generated method stub

	// 1. (로그인) 관리자, 딜러 메뉴가 다름
	// 2. 관리자 : 자동차 crud
	// 3. 딜러 : 차량 전체 조회, 상세조회
	// 4. 딜러 : 활동관리 crud
	
	
}
