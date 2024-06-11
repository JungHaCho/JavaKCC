package kosa.phone;

public class Universe extends PhoneInfo{

	private String major;
	private String year;
	
	public Universe() {
		
	}
	public Universe(String name, String phoneNo, String brith, String major, String year) {
		super(name, phoneNo, brith);
		this.major = major;
		this.year = year;
		
	}
	
	public void Univershow() {
		super.show();
		System.out.println("전공" + major);
		System.out.println("날짜" + year);
	
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	
	
}
