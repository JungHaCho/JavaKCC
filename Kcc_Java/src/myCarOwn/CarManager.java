package myCarOwn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import myCar.domain.Car;
import myCar.util.CarColor;
import myCar.util.CarType;
import myCar.util.PaymentStatus;

public class CarManager {

	private List<Car> carList;

	public CarManager() {
//		this.carList = new ArrayList<Car>(Dummy.setCarData());

		this.carList = new ArrayList<>();

	}

	public void addCarList(Car car) {
		carList.add(new Car(car.getType(), car.getColor(), car.getPaymentStatus(), car.getCarNum(), car.getPrice(),
				car.getDistance(), car.getBirth()));
	}

	public void readAllCarList() {

		if (carList.isEmpty()) {
			System.out.println("등록된 차량이 없습니다.");
			return;
		}
		for (Car car : carList) {
			car.printAllCar();
			System.out.println("");
		}
	}

	public void readDetailCarList(Car carInsert) {

		for (Car car : carList) {
			if (car.getCarId() == carInsert.getCarId()) {
				car.printAllCar();
			}
		}
	}

	public void UpdateCarList(Car carInsert, int price) {

		for (Car car : carList) {
			if (car.getCarId() == carInsert.getCarId()) {
				car.setPrice(price);
				car.printDetailCar();
			}
		}

	}

	public void DeleteCarList(Car carInsert) {

		Iterator<Car> iterator = carList.iterator();
		while (iterator.hasNext()) {
			Car car = iterator.next();
			if (car.getCarId() == carInsert.getCarId()) {
				iterator.remove();
				System.out.println("차량 ID " + car.getCarId() + " 삭제되었습니다.");
				return;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//
//		CarManager carManager = new CarManager();
//		carManager.addCarList(new Car(CarType.CONVERTIBLE, CarColor.RED, PaymentStatus.TRANSFERRING_MONEY, "1111", 2000000, 2000,
//				"2021"));
//		carManager.addCarList(new Car(CarType.HATCHBACK, CarColor.BLACK, PaymentStatus.TRANSFERRING_MONEY, "1111", 2000000, 2000,
//				"2022"));
//		carManager.addCarList(new Car(CarType.SUV, CarColor.BLACK, PaymentStatus.TRANSFERRING_MONEY, "1111", 2000000, 2000,
//				"2023"));
//
//		carManager.readAllCarList();
//			carManager.readDetailCarList(car);
////			carManager.DeleteCarList(car2);
//
	}

}
