package kosa_mission;

public class Mission2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 성적관리 프로그램에서 여러명의 성적을 구현해 보자.
		// 번호 국어 영어 수학 총점 평균
		// 1    90  80  70  240  80
		// 2    50  40  30  120  40
		// =================
			 // 140  120 100
			//  70   60    50
		
		int score[][] = {
				{90,80,70},
				{50,40,30},
		};
		int sum =0 ;
		
		for(int d = 0; d < score.length; d++) {
			System.out.print(" "+(d+1)+" ");
			for(int r = 0; r < score[d].length; r++) {
				System.out.print(" "+score[d][r]);
				sum = sum + score[d][r];
			}
			
			System.out.println(" "+sum+" " + sum/3);
			sum =0;
		}
		
		System.out.println("================");
		int r = 0;
		int arr[];
		
		for(int d = 0; d < score.length; d++) {
			System.out.print(" "+(d+1)+" ");
			
			for(r = 0; r < score[d].length; r++) {
				arr = new int [score[d].length];
				arr[r] = arr[r-1] + score[d][r];
				
			}
			
			
			 
			System.out.print("");
		}
		
		
		
		
	}

}
