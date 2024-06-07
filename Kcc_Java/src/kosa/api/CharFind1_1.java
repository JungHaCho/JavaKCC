package kosa.api;

import java.util.Scanner;

public class CharFind1_1 {

	public void solution() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String result ="" ;
		int count =0;
		str.toUpperCase();
		char c = sc.nextLine().charAt(0);
		
		char arr[] = str.toCharArray();
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i] == c) {
				count++;
				System.out.println();
			}
		}
		
		System.out.println(result);
	}

}
