package hw1;

import java.util.Scanner;

public class N2_8 {
	public static void main(String[] args) {

		
		
		System.out.println("2-8문제");
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		
		
		
		for(int i=1; i<num; i++){
			for(int b1_r=1; b1_r<=num+8; b1_r++){
				System.out.print(" ");
			}
			for(int j=num-i; j>0; j--){
				System.out.print(" ");
			}
	        for(int j=1; j<=i*2-1; j++){
	            System.out.print("*");
	        }
	        System.out.println();
	    }
		
		// ------------ 위 삼각형 -----------
		for(int d_1=0; d_1 < num; d_1++) {
			
			//1-1사분면
			for(int r1_1 = 0; r1_1 < num; r1_1++) {	
				if(r1_1 >= num-(d_1+1)) {
					System.out.print("*");				
				}else {
					System.out.print(" ");
				}	
			}
			//1-2사분면
			for(int r1_2=0; r1_2 < num; r1_2++){
				if(r1_2 > (d_1)) {
					System.out.print(" ");				
				}else if(r1_2>=1){
					System.out.print("*");
				}
			}	
			
			//2-1사분면
			for(int r1_1 = 0; r1_1 < num; r1_1++) {	
				if(r1_1 >= num-(d_1+1)) {
					System.out.print("*");				
				}else {
					System.out.print(" ");
				}	
			}
			//2-2사분면
			for(int r1_2=0; r1_2 < num; r1_2++){
				if(r1_2 > (d_1)) {
					System.out.print("*");				
				}else if(r1_2>=1){
					System.out.print("*");
				}
			}	
			
			//2-2-1사분면
			for(int r2_1 = 1; r2_1 < num; r2_1++) {	
				if(r2_1 >= num-(d_1+1)) {
					System.out.print("*");				
				}else if(r2_1 >= num) {
					
				}else {
					System.out.print("*");
				}
			}
			
			//2-2-2사분면
			for(int r2_2 = 0; r2_2 < num; r2_2++){
				if(r2_2 > (d_1)) {
					System.out.print(" ");				
				}else if(r2_2>=1){
					System.out.print("*");
				}
			}
			
			//3-1사분면
			
			for(int r3_1 = 0; r3_1 < num; r3_1++) {	
				if(r3_1 >= num-(d_1+1)) {
					System.out.print("*");				
				}else {
					System.out.print(" ");
				}	
			}
			//3-2사분면
			for(int r3_2 = 0; r3_2 <= num; r3_2++){
				if(r3_2 > (d_1)) {
					System.out.print(" ");				
				}else if(r3_2>=1){
					System.out.print("*");
				}
			}	
			
		
			System.out.println("");
		}
		
			
	}
}
