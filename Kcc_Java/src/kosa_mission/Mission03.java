package kosa_mission;

import java.util.Scanner;

public class Mission03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ ���� ���� ���ؼ� ���� �ڸ��� �� ¦��, Ȧ���� ������ ������.
		// 5�ڸ��� ex) 12345
		
		//¦���� ���� : 2��
		// Ȧ���� ���� 3��
		// ���ǿ����� ���
		int num = 0;
		int  even = 0; 
		int odd = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("5���� ���� �Է�");
		
		num = sc.nextInt();
		/*
		even += (num % 10000 %2 == 0) ? 1:0;
		even += (num % 1000 %2 == 0) ? 1:0;
		even += (num % 100 %2 == 0) ? 1:0;
		even += (num % 10 %2 == 0) ? 1:0;
		even += (num %2 == 0) ? 1:0;
		*/
		
		even += (num % 10000 %2 == 0) ? 1:0;
		even += (num % 1000 %10 %2 == 0) ? 1:0;
		even += (num % 100 %10 %2 == 0) ? 1:0;
		even += (num % 10 %10 %2 == 0) ? 1:0;
		even += (num %2 == 0) ? 1:0;
		
		
		odd = 5 - even;
	
		System.out.println("Ȧ�� :" +  even + " ¦�� : " + odd );

	}

}
