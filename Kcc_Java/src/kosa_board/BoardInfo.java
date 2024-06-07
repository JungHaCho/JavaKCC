package kosa_board;

public class BoardInfo {
	
	// 게시판 
	// 글내용,글 제목, 작성자, 날짜,
	// 게시판의 한개의 객체를 위한 것
	
	private String boardText;
	private String boardTittle;
	private String boardName;
	private String boardDate;
	private int boardNo;
	
	public BoardInfo() {
		
	}
	
	public BoardInfo(int boardNo, String boardName, String boardTittle,String boardText, String boardDate) {
		
		this.boardNo =boardNo;
		this.boardText = boardText;
		this.boardTittle = boardTittle;
		this.boardName = boardName;
		this.boardDate = boardDate;
	}
	
	
	
	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardText() {
		return boardText;
	}
	public void setBoardText(String boardText) {
		this.boardText = boardText;
	}
	public String getBoardTittle() {
		return boardTittle;
	}
	public void setBoardTittle(String boardTittle) {
		this.boardTittle = boardTittle;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public String getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}

	public void Print(){
		System.out.println("===============");
		System.out.println("글 번호 작성자 >> "+ boardNo);
		System.out.println("글 작성자 >> "+ boardName);
		System.out.println("글 제목 >> "+ boardTittle);
		System.out.println("글 내용 >> "+ boardText);
		System.out.println("작성일자 >> "+ boardDate);
		System.out.println("===============");
		
	}

	
	
	
	
}
