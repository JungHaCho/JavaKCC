package kosa_mission;

import java.util.Scanner;

public class Mission2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 10 13 10 12 15 12 39 30 23 11 11 25 50 53 15 19 27 29 37 27 19 13 30 13 19
		 * 
		 * => 155
		 */
		Scanner sc = new Scanner(System.in);

		int arr[][];
		int num = sc.nextInt();
		int max = Integer.MIN_VALUE;
		
		int sum = 0;

		arr = new int[num][num];
		
		// 입력 & 가로 합-------------------------------------------
		for (int d = 0; d < arr.length; d++) {
			sum = 0;
			for (int r = 0; r < arr[d].length; r++) {
				arr[d][r] = sc.nextInt();

				sum += arr[d][r];
			}

			if (max < sum) {
				max = sum;
			}
			
		}
		
		// 세로 합-------------------------------------------------------
		// 00 01 02         04 13 22 31 40
		// 10 11          2
		// 20     22
		// 30         
		// 40
			
		for (int d = 0; d < arr.length; d++) {
			sum = 0;
			for (int r = 0; r < arr[d].length; r++) {
				sum += arr[r][d];
			}

			if (max < sum) {
				max = sum;
			}			
		}
		
		sum = 0;
		
		// 대각선 합(\)-------------------------------------------------
		for (int d = 0; d < arr.length; d++) {
			sum += arr[d][d];
			
		}
		if (max < sum) {
			max = sum;
		}
		
		// 대각선 합(/)-------------------------------------------------------
		sum = 0;
		
		for (int d = 0; d < arr.length; d++) {
			for (int r = (arr.length-1); r >= 0 ; r--) {
				sum += arr[d][r];	
			}
		}
		if (max < sum) {
			max = sum;
		}
		
		System.out.println(max);
	}

}
