package kosa.speak;

public class Student extends Man {

	public Student(String name) {
		super(name);
	}

	public void speak() {
		System.out.println("이름" + super.getName());
		System.out.println("공부나 열심히 해");
	}
}
