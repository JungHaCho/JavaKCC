package kosa_mission;

import java.util.Scanner;

public class LoopExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while : 초기식 -> 조건식 -> 명령문 -> 증감식 : 수직방향
		//1~10까지 합
		/*
		int sum = 0;
		int i = 1;
		while(i<=10) {
			sum +=i;
			i++;
		}
		
		System.out.println("1~10까지 합: " + sum);
	*/
		/*
		int i =1;
		int result =0;
		
		while(i<=9){
			result = 7*i;
			System.out.println("7 * "+ i +" = "+result);
			i++;
		}
		*/
		
		//for문 : 초기식->조건식->명령문->증감식 : 수평 방향
	/*
		int sum = 0;
		for(int i = 1;i<=10;i++) {
			sum += i;
		}
		System.out.println("1~10까지 합:" + sum);
*/	
		
		
		//1~100까지 2의배수와 3의 배수가 아닌 숫자만 출력하시오
		
		/*
		for(int i =1;i<=100;i++) {
			if(((i % 2) != 0) && ((i%3) !=0)) {
				System.out.println(i);
			}
				
		}
		*/
		/*
		for(int i =1;i<=100;i++) {
			if((i % 2 == 0) || (i%3 ==0)) {
				continue;
			}
			System.out.println(i);
		}
		*/
		
		// do ~ while : 명령문을 1번은 시작해야해서
		// 키보드로 부터 숫자를 입력 받기
		// 유효성 검사할때
		// 음수를 입력하면 새로 입력 받도록 하기 위함
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 int n = 0;
		 
		do {
			System.out.println("입력 : ");
			n = sc.nextInt();
		}while(n<0);
		
		System.out.println("입력 결과" + n);
		*/
		
		//b>a ,입력받아 b-a결과 출력
		// 
		/*
		
		int a =0;
		int b=0;
		
		do {
			System.out.println("입력 : ");
			a = sc.nextInt();
			b = sc.nextInt();
		}while(a>b);
			
		System.out.println(b-a);	
		*/
		
		
//		int a = (int)(Math.random()*9) +1;
//		System.out.println();
	
		// 임의의 난수 3개 중첩된 값이 안나오게

		/* 
		  난수 구하기
		int a = (int)(Math.random()*9) +1;
		System.out.println();
		 */
		/*
		while(true) {
			int a= (int)(Math.random()*9) +1;
			int b= (int)(Math.random()*9) +1;
			int c= (int)(Math.random()*9) +1;
			if(a == b || b == c || a ==c) {
				continue;
			}
			System.out.println(a+ " "+b+ " "+c);
			break;
		}
		*/
		/*
		int a,b,c;
		
		a= (int)(Math.random()*9) +1;
		do {
			b= (int)(Math.random()*9) +1;
		}while(a==b)
		do {
				
		}while(b==c || a==c)
	
		c= (int)(Math.random()*9) +1;
		
		*/
		
		
	}

}
