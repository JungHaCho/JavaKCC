package kosa.phone;

import java.io.Serializable;

public class PhoneInfo implements Serializable{

	// 1. 필드 설정
	// 2. 초기화 고려

	private String name;
	private String phoneNo;
	private String brith;

	public PhoneInfo() {

	}

	public PhoneInfo(String name, String phoneNo, String brith) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.brith = brith;
	}

	public void show() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNo);
		System.out.println("생년월일 : " + brith);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getBrith() {
		return brith;
	}

	public void setBrith(String brith) {
		this.brith = brith;
	}
}