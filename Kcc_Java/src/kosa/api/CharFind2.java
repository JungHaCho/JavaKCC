package kosa.api;

import java.util.Arrays;
import java.util.Scanner;

public class CharFind2 {

	public static String solution(String str) {
		String answer = "";
		String arr[] = str.split(" ");
		int m =0;
	//	int x =0;
		
		int len = arr.length;
		
		if(len>m){
			m=len;
	//		answer = x;
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("문자열를 입력하시오");
		String str = sc.nextLine();

		System.out.println("찾을 문자를 입력하시오");
		String s = sc.nextLine();
		
		System.out.println(solution(str));
			
		
	}
}
