package kosa_mission;

import java.util.Scanner;

public class LoopExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while : �ʱ�� -> ���ǽ� -> ��ɹ� -> ������ : ��������
		//1~10���� ��
		/*
		int sum = 0;
		int i = 1;
		while(i<=10) {
			sum +=i;
			i++;
		}
		
		System.out.println("1~10���� ��: " + sum);
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
		
		//for�� : �ʱ��->���ǽ�->��ɹ�->������ : ���� ����
	/*
		int sum = 0;
		for(int i = 1;i<=10;i++) {
			sum += i;
		}
		System.out.println("1~10���� ��:" + sum);
*/	
		
		
		//1~100���� 2�ǹ���� 3�� ����� �ƴ� ���ڸ� ����Ͻÿ�
		
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
		
		// do ~ while : ��ɹ��� 1���� �����ؾ��ؼ�
		// Ű����� ���� ���ڸ� �Է� �ޱ�
		// ��ȿ�� �˻��Ҷ�
		// ������ �Է��ϸ� ���� �Է� �޵��� �ϱ� ����
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 int n = 0;
		 
		do {
			System.out.println("�Է� : ");
			n = sc.nextInt();
		}while(n<0);
		
		System.out.println("�Է� ���" + n);
		*/
		
		//b>a ,�Է¹޾� b-a��� ���
		// 
		/*
		
		int a =0;
		int b=0;
		
		do {
			System.out.println("�Է� : ");
			a = sc.nextInt();
			b = sc.nextInt();
		}while(a>b);
			
		System.out.println(b-a);	
		*/
		
		
//		int a = (int)(Math.random()*9) +1;
//		System.out.println();
	
		// ������ ���� 3�� ��ø�� ���� �ȳ�����

		/* 
		  ���� ���ϱ�
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
