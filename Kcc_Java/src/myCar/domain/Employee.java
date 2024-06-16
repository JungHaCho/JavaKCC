package myCar.domain;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Employee {

	private int empUID = 1;
	private int empId;
	private String name;
	private String tel;
	private String roll;
	private String createdAt;
	private String updateAt;
	
	
	
	public Employee() {
		
	}
	
	public Employee(String name, String tel, String roll) {
		super();
		
		this.empId = empUID++;
		this.name = name;
		this.tel = tel;
		this.roll = roll;
		this.createdAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		this.updateAt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}
	
	
	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public int getEmpUID() {
		return empUID;
	}
	public void setEmpUID(int empUID) {
		this.empUID = empUID;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}
	
	
}
