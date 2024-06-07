package kosa_mission2;

import java.util.Scanner;

public class ArrayListP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = new int[3][4];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				System.out.println(arr[i].length);
				arr[i][j] = sc.nextInt();
				System.out.println("arr["+i+"]["+j+"]");
			}
		}
		
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
		
	}

}
