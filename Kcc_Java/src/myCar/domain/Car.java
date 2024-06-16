package myCar.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import myCar.util.CarColor;
import myCar.util.CarType;
import myCar.util.PaymentStatus;

public class Car {
	private static int carUID = 1;
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

	public void getListCar() {
		System.out.println(" carId=" + carId + ",  type=" + type + ", carNum=" + carNum + ", price=" + price
				+ ", birth=" + birth + "paymentStatus= " + paymentStatus + "]");
	}

	public void getCar() {
		System.out.println(" carId=" + carId + ", type=" + type + ", price=" + price + "color" + color + ", birth="
				+ birth + "paymentStatus= " + paymentStatus + ", distance=" + distance + ", accidentAt=" + accidentAt
				+ "createdAt =" + createdAt + "updatedAt =" + updatedAt + "]");

	}
	
	public void addCar() {
		
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
