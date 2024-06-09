package kosa.oop.member;

public class Member {
	// ȸ�������� ���� Ŭ������ ��ü�� ���� �� ����غ���
	private String name;
	private int age;
	private String addr;

	public Member() {
	}

	public Member(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

}
