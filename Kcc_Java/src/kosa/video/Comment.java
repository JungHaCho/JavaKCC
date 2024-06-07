package kosa.video;

public class Comment {

	private String writer;
	private String comment;
	
	private Board board ;
	
	
	
	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Board getBoard() {
		return board;
	}

	public Comment() {		
		board = new Board();
	}
	
	public Comment(String writer, String comment) {
		
		super();
		this.comment = comment;
		this.writer = writer;
	}
	
	public void PrintComment() {
		System.out.println("작성자"+writer);
		System.out.println("답글"+comment);
		
	}
	
	public void setBoard(Board board) {
		this.board = board;
	}
	
}
