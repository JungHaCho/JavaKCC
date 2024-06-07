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
		
		System.out.println("평균"+ avg);
		
		//학점 90점 => a학점
		// 80이상 => b학점
		// 70이상 => c학점
		// 60이상 => d학점
		// 50이상 => f학점
		
		/*
		if( avg >= 90) {
			System.out.println("A학점입니다.");
		}else if(avg >= 80) {
			System.out.println("B학점입니다.");
		}else if(avg >= 70) { 
			System.out.println("C학점입니다.");
		}else if(avg >= 60) { 
			System.out.println("d학점입니다.");
		}else{ 
			System.out.println("f학점입니다.");
		}
		
		*/
		
		// switch로 변환
		/*
		switch (avg) {
			case '>= 90' :
						System.out.println();
		}
		*/
		
		
	}

}
