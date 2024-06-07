package hw1;

import java.util.Scanner;

public class N1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*------------------------------------------------
		System.out.println("1-1 巩力");
		 
		Scanner sc = new Scanner(System.in);
		
		int num ;
		int result = 0;
		
		num = sc.nextInt();
		
		for(int down =0; down < num; down++) {
			
			for(int right= 0; right < num; right ++) {
				
				result = result + 1;			
				
				if(result < 10){
					System.out.print(" "+ result + " ");
				}else {
					System.out.print(result + " ");
				}
			}			
			System.out.println("");
		}
		*/
	

		/* ------------------------------------------------
		System.out.println("1-2 巩力");
		int num;
		int result = 25;

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int d=1; d<=num ; d++){
			for(int r=1; r<=num; r++) {

				if(r == 1){
					result = result - 4;				
					if(result < 10){
						System.out.print(" "+ result + " ");
					}else {
						System.out.print(result + " ");
					}
					
				}else {
					++result;
					if(result < 10){
						System.out.print(" "+ result + " ");
					}else {
						System.out.print(result + " ");
					}
				}
			}
			result = result-5;			
			System.out.println("");
		}
		
		*/

		/*--------------------------------------------------
		System.out.println("1-3 巩力");
		int num;
		int result = 1;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int d=1; d<=num ; d++){
			for(int r=1; r<=num; r++) {
				
				if(result < 10){
					System.out.print(" "+ result + " ");
				}else {
					System.out.print(result + " ");
				}
				result = result + 2;
			}		
			System.out.println("");
		}
		
		*/
		
		/*-----------------------------------------
		System.out.println("1-4 巩力");
		int num;
		int result = 1;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int d=1; d <= num ; d++){
			for(int r=1; r <= num-(num-d); r++) {				
				System.out.print( result++ +" ");	
			}
			System.out.println();
			result = 1;
		
		}
		*/
		
		/*-----------------------------
		System.out.println("1-5 巩力");
		int num;
		int result = 1;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int d=1; d <= num ; d++){
			for(int r=1; r <= num-(num-d); r++) {
				if(result < 10){
					System.out.print(" "+ result + " ");
				}else {
					System.out.print(result + " ");
				}
				result++;
			}
			System.out.println("");
		}
		*/
		
		/*----------------------------------
		System.out.println("1-6巩力");
		int num;
		int result = 1;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
	
		for(int d=1; d <= num ; d++){
			for(int r=0; r <= num-d; r++) {
				System.out.print(result++ + " ");	
			}
			System.out.println();
			result = 1;
		}
		 */
		/*------------------------------------
		System.out.println("1-7巩力");
		int num;
		int result = 1;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
	
		for(int d=1; d <= num ; d++){
			for(int r=0; r <= num-d; r++) {		
				if(result < 10){
					System.out.print(" "+ result + " ");
				}else {
					System.out.print(result + " ");
				}
				result++;	
			}
			System.out.println();
		}
		*/
		
		/*----------------------------------
		System.out.println("1-8巩力");
		int num;
		int result = 1;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
	
		
		for(int d=1; d <= num ; d++){
			result = d;
			for(int r=1; r <= num; r++) {
			
				System.out.print(result++);
			}
			System.out.println("");
		}
		*/
		
		/*-------------------------------
		
		System.out.println("1-9巩力");
		int num;
		int result = 1;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int d=1; d <= num ; d++){
			result = d;
			for(int r=1; r <= num; r++) {
				
				
				if(result > 5) {
					result = 1;
					System.out.print(result++);
				}else {
					System.out.print(result++);
				}
			}
			System.out.println("");
		}
		 
		 */
		
		/*----------------------------------------
		 
		
		System.out.println("1-10巩力");
		
		int num;
		int result =1;
		String blank = "   ";
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		for(int d=1; d <= num; d++) {
			for(int r=1; r <= num; r++) {
				
				if(r > num-d) {
					if(result < 10){
						System.out.print(" "+ result + " ");
					}else {
						System.out.print(result + " ");
					}
					result++;
				}else {
					System.out.print(blank);
				}
				
			}
			System.out.println("");
		}
		*/
	}

}
