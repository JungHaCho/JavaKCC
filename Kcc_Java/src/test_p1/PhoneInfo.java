package test_p1;

public class PhoneInfo {

	String name;
	String phoneNo;
	String birth;

	public PhoneInfo(String name, String phoneNo, String birth) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}
	
	public void Print() {
		System.out.println("name"+name);
		System.out.println("phoneNo"+phoneNo);
		System.out.println("birth"+birth);
	}
	

}
