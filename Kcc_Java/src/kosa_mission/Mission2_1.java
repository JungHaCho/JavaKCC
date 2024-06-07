package kosa_mission;

import java.util.Scanner;

public class Mission2_1 {
	
	
	public static void avg(int arr[]) {
		
		double sum =0;
		for(int i=0; i <arr.length ;i++) {
			
			sum = sum + arr[i];	
		}
	
		System.out.println("---------------------------");
		System.out.println(" 총점  "+ (int)sum);
		System.out.println(" 평균  "+String.format("%.2f",(sum/3)));
		System.out.printf(" 평균  %.2f",(sum/3));
		
	}
	
/*
	public static void avg(int arr[]) {
		
			
		}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 국 영 수 키보드로 입력받아 배열 구현
		// 총점, 평균 구하기 => 메서드 정의
		
		int arr [] = new int[3];
		String subject[] = {"국어","영어","수학"};
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i <arr.length ;i++) {
			System.out.print( subject[i]+ "입력 >>>>>>>>>>>>>>");
			arr[i]=sc.nextInt();
		}
		avg(arr);
		
		/*
		int arr [] = new int[5];
		String subject[] = {"국어","영어","수학"};
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i <arr.length ;i++) {
			System.out.print( subject[i]+ "입력 >>>>>>>>>>>>>>");
			arr[i]=sc.nextInt();
			arr[3] += arr[i];
		}
		avg(arr);
		
		System.out.println();
		for(int n : arr) {
			System.out.print(n+"\t");
		}
		*/
		
	}

}
