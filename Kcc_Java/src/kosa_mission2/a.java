package kosa_mission2;

import java.util.Scanner;

public class a {
	
	public static int solution(int arr[]) {
		
		int answer = 2;
		 int max = arr[0];
		 for(int i=1;i<arr.length;i++) {
			 if(arr[i]>max) {
				 max = arr[i];
				 answer++;
			 }
		 }
		 return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// n�� �Է¹޾�
		// 1��°���� ū���� ����Ͻÿ�
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i=0; i <num; i++) {	
			arr[i] = sc.nextInt();			
		}
	
		System.out.println(solution(arr));
	}
	
}
