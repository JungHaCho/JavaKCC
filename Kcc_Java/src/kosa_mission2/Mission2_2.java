package kosa_mission2;

import java.util.Scanner;

//  130 135 148 140 145 150 153
public class Mission2_2 {

	public static int[] solution(int arr[]){
	
		int solution[] = new int [arr.length];
		int  =0;
		
		for(int  i=0; i<arr.length-1; i++) {
			for(int j =i+1; j <arr.length; j++) {
				
			}
		}
		return solution;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇명");
		int num = sc.nextInt();
		int arr[] = new int [num];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+"입력 >>> "+"\n");
			arr[i] = sc.nextInt();
		}
		
		int answer[] = solution(arr);
		
		for(int i=0; i<answer.length-1;i++) {
			System.out.print(answer[i]);
		}
		
		
	}

}
