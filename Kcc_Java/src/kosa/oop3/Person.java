package kosa.oop3;

public class Person {

	private String name;
	private Role role;

	public Person() {

	}

	public Person(String name, Role role) {
		super();
		this.name = name;
		this.role = role;

	}

	public void doit() {
		System.out.println("�̸�" + name);
		role.doing();
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}