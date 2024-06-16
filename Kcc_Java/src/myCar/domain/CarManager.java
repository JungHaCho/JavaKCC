package myCar.domain;

import java.util.ArrayList;

import java.util.List;

import myCar.util.CarColor;
import myCar.util.CarType;
import myCar.util.PaymentStatus;

public class CarManager {
	List<Car> cars = new ArrayList<Car>();

	public void addCar(int type, int color, int paymentStatus, String carNum, int price,
			int distance, String birth) {
		CarType carType = CarType.values()[type-1];
		CarColor carColor = CarColor.values()[type-1];
		PaymentStatus payStatus = PaymentStatus.values()[type-1];
		cars.add(new Car( carType, carColor, payStatus, carNum, price, distance, birth));
	}

	public void getListCar() {
		System.out.print("> 차량 전체 조회합니다.");
		for (Car car : cars) {
			if (car != null) {
				car.getListCar();
			}

		}
	}

	public void getCar(int searchNum) {
		System.out.print("> 차량 세부사항 조회합니다.");
		for (Car car : cars) {
			if (searchNum == car.getCarId()) {
				car.getCar();
			}
		}
	}

	public void editCar( int searchNum ,int price) {
		System.out.print("> 차량 정보 수정합니다.");
		for (Car car : cars) {
			if (searchNum == car.getCarId()) {
				car.setPrice(price);
			}
		}
	}

	public void deleteCar(int searchNum) {
		System.out.print("> 차량 정보 삭제합니다.");
		Car searchCar = null;
		for (Car car : cars) {
			if (searchNum == car.getCarId()) {
				searchCar = car;
			}
		}
		cars.remove(searchCar);
	}


}
