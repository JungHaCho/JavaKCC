package kosa_mission;

import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.�߰�2.���3.�˻�4.����
		// while
		
		String choice ="";
		String st ="";
		String st_r ="";
		String sr ="";
		
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("�޴� �����Ͻÿ�.\n 1.�߰�2.���3.�˻�4.����");
			choice = sc.nextLine();
			switch(choice) {
				case "1":
					System.out.println("�߰��� ���ڸ� �Է��Ͻÿ�");
					st = sc.nextLine();
					st_r = st_r + st;
					break;
					
				case "2":
					System.out.println("����մϴ� >>>"+ st);
					break;
					
				case "3":
					System.out.println("�˻��� �ܾ �Է��Ͻÿ�");	
					sr = sc.nextLine();
					if(st_r.contains(sr)) {
						System.out.println("�˻� ���"+ st_r);
					}
					break;
					
				case "4":				
					System.out.println("�����մϴ�.");
					return;
			}
		}
		
	}

}
