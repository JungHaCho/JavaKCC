package kosa_board;

import java.util.Scanner;

public class Manger {
	// (객체) 게시판들이 이용해서 상호작용하는것
	/*
	 * private String boardName;
	private String boardTittle;
	 private String boardText;
	private String boardDate;
	 **/
	BoardInfo bi[] ;
	int count;
	Scanner sc;
	int boardNo = 0;

	public Manger() {
		bi = new BoardInfo[10];
		sc = new Scanner(System.in);
	}
	
	// insert
	public void insert() {
		
		System.out.println("==============");
		boardNo += 1; 
		
		System.out.print("글작성자 >> ");
		String boardName = sc.nextLine();
		System.out.print("글제목 >> ");
		String boardTittle = sc.nextLine();
		System.out.print("글내용 >> ");
		String boardText = sc.nextLine();
		System.out.print("작성일 >> ");
		String boardDate = sc.nextLine();
		System.out.println("===============");
		
		
		bi[count++] = new BoardInfo(boardNo,boardName,boardTittle,boardText,boardDate);
		
	}
	
	// read All
	public void read() {
		
		for(int i=0;i<count;i++) {
			if(bi[i] == null) {
				continue;
			}
			bi[i].Print();
		}
		
	}
	
	// update
	public void update(int boardNo) {
		
		// 이름이 같다면 글내용 수정
		for(int i=0;i<count;i++) {
			if(bi[i].getBoardNo() == boardNo) {
				String str = bi[i].getBoardText();
				System.out.println("추가내용 >>");
				String sub_str = sc.nextLine();
				str = str + sub_str;
				System.out.println("수정내용 >>"+str);
				bi[i].Print();
			}
		}
		
	}
	
	//delete
	public void delete(int boardNo) {
		
		// 이름이 같다면 글내용 수정
		for(int i=0;i<count;i++) {
			if(bi[i].getBoardNo() == boardNo) {
				bi[i]= null;
			}
		}
		
	}
	
}
