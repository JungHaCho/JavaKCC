package myCar.domain;

import java.util.List;

public class Dealer extends Employee {

	private List<Sales> mySale;
	private List<Customer> myCustomers;
	private List<ActivityReport> myActivityReports;
	
	
	public Dealer() {
		super();
		
	}
	Car car = new Car();
	public Car addDealerCar (Car car) {
		
		car.addCar
		return car;		
	}
	
	// 딜러 이름, 번호, role 추가
	public Dealer(String name, String tel) {
		super(name, tel, "DEALER");
	}

	public Dealer(List<Sales> mySale, List<Customer> myCustomers, List<ActivityReport> myActivityReports) {
		super();
		this.mySale = mySale;
		this.myCustomers = myCustomers;
		this.myActivityReports = myActivityReports;
	}
	
	public List<Sales> getMySale() {
		return mySale;
	}
	public void setMySale(List<Sales> mySale) {
		this.mySale = mySale;
	}
	public List<Customer> getMyCustomers() {
		return myCustomers;
	}
	public void setMyCustomers(List<Customer> myCustomers) {
		this.myCustomers = myCustomers;
	}
	public List<ActivityReport> getMyActivityReports() {
		return myActivityReports;
	}
	public void setMyActivityReports(List<ActivityReport> myActivityReports) {
		this.myActivityReports = myActivityReports;
	}
	
	
	
	
}
