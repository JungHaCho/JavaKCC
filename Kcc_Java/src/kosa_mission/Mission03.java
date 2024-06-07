package kosa_mission;

import java.util.Scanner;

public class Mission03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 임의의 정수 값에 대해서 전테 자리수 중 짝수, 홀수의 개수를 구하자.
		// 5자리수 ex) 12345
		
		//짝수의 개수 : 2개
		// 홀수의 개수 3개
		// 조건연산자 사용
		int num = 0;
		int  even = 0; 
		int odd = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("5가지 숫자 입력");
		
		num = sc.nextInt();
		/*
		even += (num % 10000 %2 == 0) ? 1:0;
		even += (num % 1000 %2 == 0) ? 1:0;
		even += (num % 100 %2 == 0) ? 1:0;
		even += (num % 10 %2 == 0) ? 1:0;
		even += (num %2 == 0) ? 1:0;
		*/
		
		even += (num % 10000 %2 == 0) ? 1:0;
		even += (num % 1000 %10 %2 == 0) ? 1:0;
		even += (num % 100 %10 %2 == 0) ? 1:0;
		even += (num % 10 %10 %2 == 0) ? 1:0;
		even += (num %2 == 0) ? 1:0;
		
		
		odd = 5 - even;
	
		System.out.println("홀수 :" +  even + " 짝수 : " + odd );

	}

}
