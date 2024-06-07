package kosa.shopping;

import java.time.LocalDateTime;

public class User {

	private static int userUID =1;
	
	private int userId;
	private String name;
	private String nickname;
	private int age;
	private String address;
	private LocalDateTime createAt;

	
	public User( String name, String nickname, String addr, int age) {
		super();
		this.userId = userUID++;

		this.name = name;
		this.nickname = nickname;
		this.age = age;
		this.address = addr;
		this.createAt = LocalDateTime.now();
	}

	

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", nickname=" + nickname + ", age=" + age + ", address="
				+ address + ", createAt=" + createAt + "]";
	}



	public static int getUid() {
		return userUID;
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDateTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}
	
	
	
	
}
