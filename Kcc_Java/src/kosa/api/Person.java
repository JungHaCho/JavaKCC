package kosa.api;

public class Person {

	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

	// 오버라이딩 하면 public boolean equals(Object obj) 을 바꾸면 안된다.
	// 캐스팅해야한다.
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p2 = (Person)obj;
		if(name.equals(p2.getName()) || age == p2.getAge()) {
			return true;
		}else {
			return false;
		}
		
	}

	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
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
	
	
}
