package kosa_basic;

import java.util.Scanner;

public class VariableExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ű����κ��� ������ �Է�
		Scanner sc = new Scanner(System.in);
		
		// �������� �Է� �� ���ڿ� �Է��Ҷ� ��Ÿ���� ����
		// 1. sc.nextLine(); �ϳ� �� �ޱ�
		// 2. casting �ϱ� (nextLine���� ����)
		// int num = integer.parseInt(sc.nextLine());
		
		
		// integer.parseInt���� int num�� 100���� �Է��ϸ� 
		// ��Ÿ���� NumberFormatException ����
		
//		System.out.print("���� �Է�: ");
//		int num = sc.nextInt(); // 10 + enter
		
//		System.out.print("���ڿ� �Է�: ");
//		String str = sc.nextLine();
		
//		System.out.println(num);
//		System.out.println(str);
	
		char ch ='A';
		//System.out.println((int)ch);
		
		for(int i=0;i<26;i++) {
			System.out.print(ch);
			ch +=1;
		}

		//int <==> String
		System.out.println("");
		String num2 = "100";
		int num3 = Integer.parseInt(num2);
		int result = num3 + 100;
		System.out.println(result);
		
		int num4 = 10;
		String num5 = String.valueOf(num4);
		String num6 = num4+"";
		
		String str = 7 + "7" + 7;
		System.out.println(str);
		
		
	}

}
