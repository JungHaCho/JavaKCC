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

		System.out.println("���ڿ��� �Է��Ͻÿ�");
		String str = sc.nextLine();

		System.out.println("ã�� ���ڸ� �Է��Ͻÿ�");
		String s = sc.nextLine();
		
		System.out.println(solution(str));
			
		
	}
}