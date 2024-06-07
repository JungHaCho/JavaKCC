package test_p1;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println(">1.추가 2.전체출력 3.검색 4.종료");
		String choice = sc.nextLine();
		
		while(true) {
			
			switch(choice) {
				case "1" : 
								String insert = sc.nextLine();
								
								break;
				
				case "2" : 
								break;
				case "3" : 
								break;
				case "4" : 
								break;
			}
		}
	}

}
