package kosa.api;

import java.util.Scanner;

public class CharFind {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��Ͻÿ�");
		String str = sc.nextLine();
		
		System.out.println("ã�� ���ڸ� �Է��Ͻÿ�");
		char c = sc.next().charAt(0);
		
		// ���ڿ��� ���ڹ迭�� �ֱ�
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