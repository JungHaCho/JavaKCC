package kosa.api;

import java.util.Arrays;
import java.util.Scanner;

public class CharFind3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String result ="";
		
		str.toCharArray();
		
		// ���� 
		char arr[] = str.toCharArray();
		
		for(int i=0; i< arr.length ;i++) {
			if(Character.isDigit(arr[i])) {
				result += arr[i];
			}
		}
		System.out.println(Integer.parseInt(result));
		
		
	}

}