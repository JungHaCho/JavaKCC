package myCar.domain;

import java.time.LocalDateTime;
import java.util.List;

import myCar.util.CustomerType;

public class Customer {
    
    private Dealer myDealer;
    private List<Sales> mySales;
    private List<Car> carInterests;
    private CustomerType type;
   
    private static int customerUID =1;
    private int customerId;
    private String name;
    private String email;
    private String tel;
    private String addr;
    private String job;
    private String birth;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    
    public Customer() {}

    public Customer( Dealer myDealer, List<Sales> mySales, List<Car> carInterests, CustomerType type, int customerId, String name, String email, String tel, String addr, String job, String birth, LocalDateTime createdAt, LocalDateTime updatedAt) {
      
        this.myDealer = myDealer;
        this.mySales = mySales;
        this.carInterests = carInterests;
        this.type = type;
        this.customerId = customerUID++;
        this.name = name;
        this.email = email;
        this.tel = tel;
        this.addr = addr;
        this.job = job;
        this.birth = birth;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


    public int getCustomerUID() {
		return customerUID;
	}


	public void setCustomerUID(int customerUID) {
		this.customerUID = customerUID;
	}


	public Dealer getMyDealer() {
		return myDealer;
	}


	public void setMyDealer(Dealer myDealer) {
		this.myDealer = myDealer;
	}


	public List<Sales> getMySales() {
		return mySales;
	}


	public void setMySales(List<Sales> mySales) {
		this.mySales = mySales;
	}


	public List<Car> getCarInterests() {
		return carInterests;
	}


	public void setCarInterests(List<Car> carInterests) {
		this.carInterests = carInterests;
	}


	public CustomerType getType() {
		return type;
	}


	public void setType(CustomerType type) {
		this.type = type;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}


	@Override
    public String toString() {
        return "Customer{" +
                "customerUID=" + customerUID +
                ", myDealer=" + myDealer +
                ", mySales=" + mySales +
                ", carInterests=" + carInterests +
                ", type=" + type +
                ", customerId=" + customerId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", addr='" + addr + '\'' +
                ", job='" + job + '\'' +
                ", birth='" + birth + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
