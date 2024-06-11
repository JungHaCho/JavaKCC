package kosa_phone.k;

public class Company extends PhoneInfo{

	private String dept;
	private String position;
	
	
	public Company() {
	
	} 
	
	
	public Company(String name, String phoneNo, String brith, String dept, String position) {
		super(name, phoneNo, brith);
		this.dept = dept;
		this.position = position;
	}


	public void Companyshow() {
		super.show();
		System.out.println("�μ�"+dept);
		System.out.println("��å"+position);
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
}
