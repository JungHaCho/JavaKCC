package kosa_board;

import java.util.Scanner;

public class Manger {
	// (��ü) �Խ��ǵ��� �̿��ؼ� ��ȣ�ۿ��ϴ°�
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
		
		System.out.print("���ۼ��� >> ");
		String boardName = sc.nextLine();
		System.out.print("������ >> ");
		String boardTittle = sc.nextLine();
		System.out.print("�۳��� >> ");
		String boardText = sc.nextLine();
		System.out.print("�ۼ��� >> ");
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
		
		// �̸��� ���ٸ� �۳��� ����
		for(int i=0;i<count;i++) {
			if(bi[i].getBoardNo() == boardNo) {
				String str = bi[i].getBoardText();
				System.out.println("�߰����� >>");
				String sub_str = sc.nextLine();
				str = str + sub_str;
				System.out.println("�������� >>"+str);
				bi[i].Print();
			}
		}
		
	}
	
	//delete
	public void delete(int boardNo) {
		
		// �̸��� ���ٸ� �۳��� ����
		for(int i=0;i<count;i++) {
			if(bi[i].getBoardNo() == boardNo) {
				bi[i]= null;
			}
		}
		
	}
	
}
