package kosa_board;

import java.util.Scanner;

public class Main {

	// �Խ��� 
	// �۳���, �ۼ���, ��¥, ��������
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		Manger mg = new Manger();
		
		while(true) {
			System.out.print("1. ���߰� 2. ��� 3.���� 4.�����߰� 5.���� > ");
			String menu = sc.nextLine();
			
			switch(menu) {
			
				case "1":
					mg.insert();
					break;
					
				case "2":
					mg.read();
					break;
					
				case "3":
					System.out.println("���α׷��� ����ƽ��ϴ�.");
					return;
				case "4":
					System.out.println("===============");
					System.out.print("�����߰� �� �ۼ��� �˻��Ͻÿ� >> ");
					int num = 0;
					mg.update(num);
					System.out.println("�����߰��߽��ϴ�");
					System.out.println("===============");
					break;
					
				case "5":
					System.out.println("===============");
					System.out.print("������ �ۼ��� �˻��Ͻÿ� >> ");
					String Name2 = sc.nextLine();
					mg.delete(Name2);
					System.out.println("�����߽��ϴ�.");
					System.out.println("===============");
					break;
					
						
			}
		}
		
	}

}
