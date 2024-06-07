package test;

public class PhoneInfo {

	String name;
	String phoneNo;
	String birth;

	public PhoneInfo(String name, String phoneNo, String birth) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}

	public void print() {
		System.out.println(name);
		System.out.println(phoneNo);
		System.out.println(birth);
	}

}
