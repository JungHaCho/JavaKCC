package kosa_mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k;
		int eng;
		int math;
	
		Scanner sc = new Scanner(System.in);
		int avg;
		
		
		k = sc.nextInt();
		eng = sc.nextInt();
		math= sc.nextInt();
		
		int total = k+eng+math;
		 avg =(int)((k+eng+math)/3.0);
		
		System.out.println("���"+ avg);
		
		//���� 90�� => a����
		// 80�̻� => b����
		// 70�̻� => c����
		// 60�̻� => d����
		// 50�̻� => f����
		
		/*
		if( avg >= 90) {
			System.out.println("A�����Դϴ�.");
		}else if(avg >= 80) {
			System.out.println("B�����Դϴ�.");
		}else if(avg >= 70) { 
			System.out.println("C�����Դϴ�.");
		}else if(avg >= 60) { 
			System.out.println("d�����Դϴ�.");
		}else{ 
			System.out.println("f�����Դϴ�.");
		}
		
		*/
		
		// switch�� ��ȯ
		/*
		switch (avg) {
			case '>= 90' :
						System.out.println();
		}
		*/
		
		
	}

}
