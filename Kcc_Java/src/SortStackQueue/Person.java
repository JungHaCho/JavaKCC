package SortStackQueue;

public class Person implements Comparable<Person> {

	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Person" + name + age;
	}

	// ��������
	@Override
	public int compareTo(Person o) {

		// ���� ���� ���� ����
		if (age < o.age) {
			return -1; // �ȿ�����
		} else if (age > o.age) {
			return 1;// �̵���Ŵ
		} else {
			return 0;
		}
	}
	
	
}
