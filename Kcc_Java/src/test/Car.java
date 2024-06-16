package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import myCar.util.CarColor;
import myCar.util.CarType;
import myCar.util.PaymentStatus;

public class Car {
	private int carUID = 1;
	private CarType type;
	private CarColor color;
	private PaymentStatus paymentStatus;
	private int carId;
	private String carNum;
	private int price;
	private int distance;
	private String birth;
	private boolean accidentAt;
	private String createdAt;
	private String updatedAt;

	public Car() {
		
	}

	public Car(CarType type, CarColor color, PaymentStatus paymentStatus, String carNum, int price, int distance,
			String birth) {
		super();

		this.type = type;
		this.color = color;
		this.paymentStatus = paymentStatus;
		this.carId = carUID++;
		this.carNum = carNum;
		this.price = price;
		this.distance = distance;
		this.birth = birth;
		this.accidentAt = false;
		this.createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		this.updatedAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}

	public void readAllCar(List<Car> readAllCar) {
		System.out.print("> 차량 전체 조회합니다.");
		for (Car car : readAllCar) {
			if (car.getCarId() != 0) {
				car.getListCar();
			}

		}

	}

//	public Car readDetailCar(Car car) {
//		System.out.print(">보고싶은 차량 고유 번호를 입력하시오.");
//		if (car.getCarId() == carId || car.getCarId() != 0) {
//			return car;
//		}
//
//		return null;
//	}

	public Car UpdateCar(Car car, int price) {

		if (car.getCarId() == carId) {

			car.setPrice(price);
			car.setUpdatedAt(updatedAt);
			System.out.println(">변경 후 정보입니다.");
			car.getCar();
		}
		return car;
	}

	public Car deleteCar(Car car) {
		if (car.getCarId() == carId) {
			car.setCarId(0);
		}
		return car;
	}

	public void getCar() {
		System.out.println(" carId=" + carId + ",  type=" + type + ", carNum=" + carNum + ", price=" + price
				+ ", distance=" + distance + ", birth=" + birth + ", accidentAt=" + accidentAt + "paymentStatus= "
				+ paymentStatus + "]");
	}

	public void getListCar() {
		System.out.println(" carId=" + carId + ", type=" + type + ", price=" + price + "color" + color + ", birth="
				+ birth + "paymentStatus= " + paymentStatus + "createdAt =" + createdAt + "updatedAt =" + updatedAt
				+ "]");

	}

	public int getCarUID() {
		return carUID;
	}

	public void setCarUID(int carUID) {
		this.carUID = carUID;
	}

	public CarType getType() {
		return type;
	}

	public void setType(CarType type) {
		this.type = type;
	}

	public CarColor getColor() {
		return color;
	}

	public void setColor(CarColor color) {
		this.color = color;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public boolean isAccidentAt() {
		return accidentAt;
	}

	public void setAccidentAt(boolean accidentAt) {
		this.accidentAt = accidentAt;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

}
