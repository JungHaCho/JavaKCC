package kosa_phone;

public class PhoneInfo{

	// 1. �ʵ� ����
	// 2. �ʱ�ȭ ���

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
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phoneNo);
		System.out.println("������� : " + brith);
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
// 1�Ⱥ���
	//
//	@Override
//	public int compareTo(PhoneInfo p) {
//		// TODO Auto-generated method stub
//		if(this.name.compareTo(p.getName())>0) {
//			return 1;
//		}else if(this.name.compareTo(p.getName())<0){
//			return -1;
//		}
//		return 0;
//	}

}
