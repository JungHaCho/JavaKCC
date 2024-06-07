package kosa_mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
		String a = "abc";
		String b = "abc";
		
		// 참조값 = 주소값으로 비교
		// equals / equalignore
		
		
		if(a.equals(b)) {
			
		}
	*/	
		
		// 두정수와 연산자 문자열을 입력 받아 
		// 사칙연산 결과를 출력하시오.(계산기)
		// ex> 
		//정수 1
		//정수 2
		//연사자
		// 결과 
		
		int num1 =0;
		int num2 =0;
		String a = "";
		int result =0;
		
		Scanner sc =new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.nextLine();
		a = sc.nextLine();
		
		if( a.equals("+")) {
			result = num1 + num2;
		}else if( a.equals("-")) {
			result = num1 - num2;
		}else if( a.equals("*")) {
			result = num1 * num2;
		}else if( a.equals("/")) {
			result = num1 / num2;
		}
		
		System.out.println( "결과> "+ result);
		
	}

}
