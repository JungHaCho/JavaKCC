package kosa_mission;

import java.util.Scanner;

public class Mission2_1 {
	
	
	public static void avg(int arr[]) {
		
		double sum =0;
		for(int i=0; i <arr.length ;i++) {
			
			sum = sum + arr[i];	
		}
	
		System.out.println("---------------------------");
		System.out.println(" ����  "+ (int)sum);
		System.out.println(" ���  "+String.format("%.2f",(sum/3)));
		System.out.printf(" ���  %.2f",(sum/3));
		
	}
	
/*
	public static void avg(int arr[]) {
		
			
		}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �� �� �� Ű����� �Է¹޾� �迭 ����
		// ����, ��� ���ϱ� => �޼��� ����
		
		int arr [] = new int[3];
		String subject[] = {"����","����","����"};
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i <arr.length ;i++) {
			System.out.print( subject[i]+ "�Է� >>>>>>>>>>>>>>");
			arr[i]=sc.nextInt();
		}
		avg(arr);
		
		/*
		int arr [] = new int[5];
		String subject[] = {"����","����","����"};
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i <arr.length ;i++) {
			System.out.print( subject[i]+ "�Է� >>>>>>>>>>>>>>");
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
