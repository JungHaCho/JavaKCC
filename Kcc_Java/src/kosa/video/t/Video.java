package kosa.video.t;

public class Video {

	private String title;
	private String actor;
	private String sno;
	private int cnt;
	
	
	public Video(){
		
	}

	public Video(String title, String actor, String sno) {
		
		this.title = title;
		this.actor = actor;
		this.sno = sno;
		
	}

	public void show() {
		System.out.println("ȸ���� ���� ���� ��ȣ : "+ sno);
		System.out.println("ȸ���� ���� ��� ��ȣ : "+ actor);
		System.out.println("ȸ���� ���� ���� ��ȣ : "+ title);
	}
	
	public void lent() {
		System.out.println("ȸ���� ���� Ƚ�� : " + cnt++);
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	

	
}