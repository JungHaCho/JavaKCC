package randomSeat;

public class Student {
	
	private String studentNo;
	private String name;
	private int age;
	private String addr;
	private String tell;
	private Seat seat;
	
	public void Student(){
	
	}

	public Student(String studentNo, String name, int age, String addr, String tell, Seat seat) {
		super();
		this.studentNo = studentNo;
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.tell = tell;
		this.seat = seat;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTell() {
		return tell;
	}

	public void setTell(String tell) {
		this.tell = tell;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	

	
	
	
	
	
	

}
