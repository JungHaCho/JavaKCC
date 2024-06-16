package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import myCar.util.CarColor;
import myCar.util.CarType;
import myCar.util.PaymentStatus;

public class CarManager {

	private List<Car> carList;
	static Car car1 = new Car();

	public CarManager() {
		this.carList = new ArrayList<Car>(Dummy.setCarData());
		carList = new ArrayList<Car>();

	}

	public void addCarList(Car car) {
		carList.add(car1.createCar(car.getType(), car.getColor(), car.getPaymentStatus(), car.getCarNum(),
				car.getPrice(), car.getDistance(), car.getBirth()));
	}

	public void readAllCarList() {

		if (carList.isEmpty()) {
			System.out.println("등록된 차량이 없습니다.");
			return;
		}

		// Car 클래스의 readAllCar 메서드 호출
		car1.readAllCar(carList);

	}

	public void readDetailCarList() {
		for (Car car : carList) {
			car1.readDetailCar(car);
		}

	}

	public Car UpdateCarList(Car car, int price) {
		Car car3 = null;
		for (Car car2 : carList) {
			car3 = car1.UpdateCar(car2, price);
		}
		return car3;
	}

	public static void main(String[] args) {
		CarManager cm = new CarManager();
		Car car = new Car(CarType.CONVERTIBLE, CarColor.RED, PaymentStatus.TRANSFERRING_MONEY, "1111", 2000000, 2000,"2021");
		Car carinsert1 = new Car(CarType.HATCHBACK, CarColor.RED, PaymentStatus.TRANSFERRING_MONEY, "22222", 2000000, 2000,"2021");
		cm.addCarList(carinsert1);
		cm.addCarList(car);
		cm.readAllCarList();
		cm.readDetailCarList();
	}
}
