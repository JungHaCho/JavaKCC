package hw1;

import java.util.Scanner;

public class N2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*-------------------------------------
		System.out.println("2-1����");
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
				
		for(int d=0; d < num; d++){
			for(int r=0; r<num; r++){
				System.out.print("*");
			}
			System.out.println("");
		}
		*/
		
		/*------------------------------
		System.out.println("2-2����");
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		for(int d=0; d < num; d++) {
			
			for(int r=0; r <= num- (num-d); r++){
				System.out.print("*");
			}
			System.out.println("");
		}
		*/
		
		/*----------------------------------
		System.out.println("2-3����");
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int d = 0; d < num ;d++){
			
			for(int r = 0; r < num; r++){
				
				if(r >= (num-(d+1))){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
		
		*/
		
		/*--------------------------------------------
		System.out.println("2-4����");
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int d=0; d < num; d++) {
			for(int r = 0; r < num; r++) {	
				if(r >= num-(d+1)) {
					System.out.print("*");				
				}else {
					System.out.print(" ");
				}	
			}
			for(int sub=1; sub <= num- (num-d); sub++){
				System.out.print("*");
			}		
			System.out.println("");
		}
		*/
		
		/*-------------------------------------
		 
		 */
		/*--------------------------------------------
		System.out.println("2-5����");
		
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		// ------------ �� �ﰢ�� -----------
		for(int d=0; d < num; d++) {
			//1��и�
			for(int r = 0; r < num; r++) {	
				if(r >= num-(d+1)) {
					System.out.print("*");				
				}else {
					System.out.print(" ");
				}	
			}
			//2��и�
			for(int sub=1; sub <= num- (num-d); sub++){
				System.out.print("*");
			}		
			System.out.println("");
		
		}
		
		// ------------ �Ʒ� �ﰢ�� -------------
		for(int d_2 = 1; d_2 < num; d_2++) {
			// 3��и�
			for(int r_d2 = 0; r_d2 <num; r_d2++) {
				if(r_d2 >= d_2){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			// 4��и�
			for(int sub_r2=1; sub_r2 < num - d_2; sub_r2++) {
				
				System.out.print("*");
			}
			System.out.println("");
		}
		*/
		
		/* ----------------------------------------------------
		System.out.println("2-6����");
		
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		// ------------ �� �ﰢ�� -----------
		for(int d_1=0; d_1 < num; d_1++) {
			
			//1-1��и�
			for(int r1_1 = 0; r1_1 < num; r1_1++) {	
				if(r1_1 >= num-(d_1+1)) {
					System.out.print("*");				
				}else {
					System.out.print(" ");
				}	
			}
			//1-2��и�
			for(int r1_2=0; r1_2 < num; r1_2++){
				if(r1_2 > (d_1)) {
					System.out.print(" ");				
				}else if(r1_2>=1){
					System.out.print("*");
				}
			}	
			
			//2-1��и�
			for(int r2_1 = 0; r2_1 < num; r2_1++) {	
				if(r2_1 >= num-(d_1+1)) {
					System.out.print("*");				
				}else {
					System.out.print(" ");
				}	
			}
			//2-2��и�
			for(int r2_2 = 0; r2_2 <= num; r2_2++){
				if(r2_2 > (d_1)) {
					System.out.print(" ");				
				}else if(r2_2>=1){
					System.out.print("*");
				}
			}
			
			System.out.println("");
		}
		
		// ------------ �Ʒ� �ﰢ�� -------------
		for(int d_2 = 1; d_2 < num; d_2++) {
			
			// 1-3��и�
			for(int r1_3 = 0; r1_3 <num; r1_3++) {
				if(r1_3 >= d_2){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			// 1-4��и�
			
			for(int r1_4 = 1; r1_4 <num; r1_4++) {
				if(r1_4 >= num - d_2){
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			
			// 2-3��и�
			for(int r2_3 = 0; r2_3 <num; r2_3++) {
				if(r2_3 >= d_2){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			// 2-4��и�	
			for(int r2_4 = 1; r2_4 <num; r2_4++) {
				if(r2_4 >= num - d_2){
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			
			System.out.println("");
		}
		*/
		
		/*---------------------------------------------
		
		System.out.println("2-7����");
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		// ------------ �� �ﰢ�� -----------
		for(int d_1=0; d_1 < num; d_1++) {
			
			//1-1��и�
			for(int r1_1 = 0; r1_1 < num; r1_1++) {	
				if(r1_1 >= num-(d_1+1)) {
					System.out.print("*");				
				}else {
					System.out.print(" ");
				}	
			}
			//1-2��и�
			for(int r1_2=0; r1_2 < num; r1_2++){
				if(r1_2 > (d_1)) {
					System.out.print(" ");				
				}else if(r1_2>=1){
					System.out.print("*");
				}
			}	
			
			//2-1��и�
			for(int r1_1 = 0; r1_1 < num; r1_1++) {	
				if(r1_1 >= num-(d_1+1)) {
					System.out.print("*");				
				}else {
					System.out.print(" ");
				}	
			}
			//2-2��и�
			for(int r1_2=0; r1_2 < num; r1_2++){
				if(r1_2 > (d_1)) {
					System.out.print("*");				
				}else if(r1_2>=1){
					System.out.print("*");
				}
			}	
			
			//2-2-1��и�
			for(int r2_1 = 0; r2_1 < num; r2_1++) {	
				if(r2_1 >= num-(d_1+1)) {
					System.out.print("*");				
				}else {
					System.out.print("*");
				}	
			}
			
			//2-2-2��и�
			for(int r2_2 = 0; r2_2 < num; r2_2++){
				if(r2_2 > (d_1)) {
					System.out.print(" ");				
				}else if(r2_2>=1){
					System.out.print("*");
				}
			}
			
			//3-1��и�
			
			for(int r3_1 = 0; r3_1 < num; r3_1++) {	
				if(r3_1 >= num-(d_1+1)) {
					System.out.print("*");				
				}else {
					System.out.print(" ");
				}	
			}
			//3-2��и�
			for(int r3_2 = 0; r3_2 <= num; r3_2++){
				if(r3_2 > (d_1)) {
					System.out.print(" ");				
				}else if(r3_2>=1){
					System.out.print("*");
				}
			}	
			
		
			System.out.println("");
		}
		*/
		
		/*-----------------------------------
		
		System.out.println("2-9����");
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int d = 0; d <= num+1; d++) {
			
			System.out.print("$");
			if(d == 0 || d > num) {
				for(int r = 0; r < num; r++){
					System.out.print("$");
				}
			}else {
				for(int r = 0; r < num; r++){
					System.out.print("*");
				}
			}
			
			System.out.print("$");
			System.out.println("");
		
		*/
		
		/*--------------------------
		 
		System.out.println("2-10����");
		int num,enter;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int d = 0; d <= num; d++) {
			
			if(d == 0) {
				System.out.println("*");
			}else {
				for(int r = 0; r <= d; r++){	
					if(r == 0 || r+1 > d) {
						System.out.print("*");
					}else {
						System.out.print("@");
					}
				}
				System.out.println("") ;
			}
			
		}
		// ------------ �Ʒ� �ﰢ�� -------------
		for(int d_2 = 0; d_2 < num; d_2++) {
					
			if(d_2 == 0) {	
			}else {	
				for(int r2=1; r2 < num - d_2; r2++) {		
					System.out.print("@");	
				}
					System.out.println("*");
			}
			System.out.print("*");
		}
		 
		 
		 */
		/*
		 ----------------------��ǰ-------------------------
		System.out.println("2-8����");
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
				
		for(int d=0; d < num; d++) {
			
			for(int blank = num-(d+1); blank > d; blank--){
				System.out.print("0");
			}
			for(int star = 0; star < d+1; star++){
				System.out.print("*");
			}
			
			System.out.println("");
		}
		 */
	}

}
