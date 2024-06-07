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

	// 오름차순
	@Override
	public int compareTo(Person o) {

		// 나이 오름 차순 정렬
		if (age < o.age) {
			return -1; // 안움직임
		} else if (age > o.age) {
			return 1;// 이동시킴
		} else {
			return 0;
		}
	}
	
	
}
