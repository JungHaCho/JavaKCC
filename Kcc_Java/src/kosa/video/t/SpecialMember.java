package kosa.video.t;

public class SpecialMember extends GeneralMember{

	
	private int bonus;
	
	public SpecialMember(){
		super();
	}
	
	public SpecialMember(String id, String name, String address, int bonus) {
		super(id, name, address);
		this.bonus =bonus;
	}
	
	public void show() {
		super.show();
		System.out.println("bonus >>>>"+ bonus);
	}

	@Override
	public Video getRentalVideo() {
		// TODO Auto-generated method stub
		return super.getRentalVideo();
	}
	
	public void specialPrint() {
		System.out.println("½ºÆä¼È¸â¹ö");
	}
	
	
}
