package kosa.io;

import java.io.Serializable;

public class Video implements Serializable{

	private String title;
	private String actor;
	private String sno;
	private int cnt;
	
	
	public Video(){
		
	}

	public Video( String sno,String title, String actor) {
		
		this.title = title;
		this.actor = actor;
		this.sno = sno;
		
	}

	public void show() {
		System.out.println("sno : "+ sno);
		System.out.println("actor : "+ actor);
		System.out.println("title: "+ title);
	}
	
	public void lent() {
		System.out.println("빌린 횟수 : " + cnt++);
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
