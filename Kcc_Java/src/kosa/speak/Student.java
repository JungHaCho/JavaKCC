package kosa.speak;

public class Student extends Man {

	public Student(String name) {
		super(name);
	}

	public void speak() {
		System.out.println("�̸�" + super.getName());
		System.out.println("���γ� ������ ��");
	}
}