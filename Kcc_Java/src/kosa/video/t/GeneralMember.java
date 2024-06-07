package kosa.video.t;

public class GeneralMember extends Video{

	private String id;
	private String name;
	private String address;
	private int lentNum;

	private Video rentalVideo;


	public GeneralMember() {
		
	}
	
	public GeneralMember(String id, String name, String address) {
		
		this.id = id;
		this.name = name;
		this.address = address;
	
		
	}
	
	
	public void rental(Video video) {
		this.rentalVideo = video;
	}
	
	public void show() {
		System.out.println("회원 아이디: "+ id);
		System.out.println("회원 이름: "+ name);
		System.out.println("회원 주소: "+ address);
		System.out.println(" 빌린 횟수 : "+ lentNum);
		rentalVideo.show();
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Video getRentalVideo() {
		return rentalVideo;
	}

	public void setRentalVideo(Video rentalVideo) {
		this.rentalVideo = rentalVideo;
	}
	


	
	
	
	
}
