package myCarOwn;

import java.util.List;

public class Admin extends Employee {

	public Admin() {
	}

	public Admin(String name, String tel) {
		super(name, tel, "ADMIN");
	}

	public void addCar(Car car) {
		
	}

	public void acceptSale() {

		System.out.println("판매 승인: ");
	}

}
