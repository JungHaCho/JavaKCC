package kosa.api;

import java.util.Scanner;

public class CharFind {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열를 입력하시오");
		String str = sc.nextLine();
		
		System.out.println("찾을 문자를 입력하시오");
		char c = sc.next().charAt(0);
		
		// 문자열을 문자배열에 넣기
		System.out.println(solution(str,c));
	}
	
	public static int solution(String str, char c) {
		int answer = 0;
		//Computercooler
		str = str.toUpperCase();
		c =Character.toUpperCase(c);
		
		for(int i =0; i< str.length();i++) {
			if(str.charAt(i) == c)answer++;
		}
		
//		for(char x : str.toCharArray()) {
//			if(x == c) answer++;
//		}
		return answer;
	}
}
