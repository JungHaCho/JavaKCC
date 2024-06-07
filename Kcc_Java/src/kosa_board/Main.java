package kosa_board;

import java.util.Scanner;

public class Main {

	// 게시판 
	// 글내용, 작성자, 날짜, 삭제여부
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		Manger mg = new Manger();
		
		while(true) {
			System.out.print("1. 글추가 2. 출력 3.종료 4.내용추가 5.삭제 > ");
			String menu = sc.nextLine();
			
			switch(menu) {
			
				case "1":
					mg.insert();
					break;
					
				case "2":
					mg.read();
					break;
					
				case "3":
					System.out.println("프로그램이 종료됐습니다.");
					return;
				case "4":
					System.out.println("===============");
					System.out.print("내용추가 할 작성자 검색하시오 >> ");
					int num = 0;
					mg.update(num);
					System.out.println("내용추가했습니다");
					System.out.println("===============");
					break;
					
				case "5":
					System.out.println("===============");
					System.out.print("삭제할 작성자 검색하시오 >> ");
					String Name2 = sc.nextLine();
					mg.delete(Name2);
					System.out.println("삭제했습니다.");
					System.out.println("===============");
					break;
					
						
			}
		}
		
	}

}
