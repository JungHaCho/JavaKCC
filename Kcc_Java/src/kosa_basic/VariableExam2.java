package kosa_basic;

import java.util.Scanner;

public class VariableExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//키보드로부터 데이터 입력
		Scanner sc = new Scanner(System.in);
		
		// 정수값을 입력 후 문자열 입력할때 나타나는 오류
		// 1. sc.nextLine(); 하나 더 받기
		// 2. casting 하기 (nextLine으로 통일)
		// int num = integer.parseInt(sc.nextLine());
		
		
		// integer.parseInt에서 int num에 100빵을 입력하면 
		// 나타나는 NumberFormatException 오류
		
//		System.out.print("정수 입력: ");
//		int num = sc.nextInt(); // 10 + enter
		
//		System.out.print("문자열 입력: ");
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
