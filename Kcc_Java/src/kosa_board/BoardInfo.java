package kosa_board;

public class BoardInfo {
	
	// �Խ��� 
	// �۳���,�� ����, �ۼ���, ��¥,
	// �Խ����� �Ѱ��� ��ü�� ���� ��
	
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
		System.out.println("�� ��ȣ �ۼ��� >> "+ boardNo);
		System.out.println("�� �ۼ��� >> "+ boardName);
		System.out.println("�� ���� >> "+ boardTittle);
		System.out.println("�� ���� >> "+ boardText);
		System.out.println("�ۼ����� >> "+ boardDate);
		System.out.println("===============");
		
	}

	
	
	
	
}
