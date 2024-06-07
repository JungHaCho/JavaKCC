package kosa.video;

import java.util.ArrayList;
import java.util.List;

import kosa.relation.Student;

public class Board {

	private String title;
	private String contents;
	private List<Comment> comments;
	
	public Board() {
		
		comments = new ArrayList<Comment>();
	}
		
	public Board(String title, String contents) {
		super();
		this.title = title;
		this.contents = contents;
		
	} 
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void PrintBoard() {
		
		System.out.println("제목"+title);
		System.out.println("내용"+contents);
		
		for(Comment commentAddress : comments) {
			System.out.println(commentAddress.getComment());
		}
	}
	
	
}
