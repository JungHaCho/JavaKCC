package kosa_mission;

import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.추가2.출력3.검색4.종료
		// while
		
		String choice ="";
		String st ="";
		String st_r ="";
		String sr ="";
		
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("메뉴 선택하시오.\n 1.추가2.출력3.검색4.종료");
			choice = sc.nextLine();
			switch(choice) {
				case "1":
					System.out.println("추가할 문자를 입력하시오");
					st = sc.nextLine();
					st_r = st_r + st;
					break;
					
				case "2":
					System.out.println("출력합니다 >>>"+ st);
					break;
					
				case "3":
					System.out.println("검색할 단어를 입력하시오");	
					sr = sc.nextLine();
					if(st_r.contains(sr)) {
						System.out.println("검색 결과"+ st_r);
					}
					break;
					
				case "4":				
					System.out.println("종료합니다.");
					return;
			}
		}
		
	}

}
