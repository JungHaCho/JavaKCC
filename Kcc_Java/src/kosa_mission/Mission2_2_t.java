package kosa_mission;

public class Mission2_2_t {
	
	public static void main(String[] args) {
		
		int score[][] = {
				{90,80,70},
				{50,40,30},
		};
		
		int kortotal = 0;
		int engtotal = 0;
		int mattotal = 0;
		
		System.out.println("번호 국어 영어 수학 총점 평균");
		
		for(int i =0; i <score.length; i++) {
			int sum = 0;
			int avg = 0;
			
			kortotal += score[i][0];
			engtotal += score[i][1];
			mattotal += score[i][2];
		
			System.out.print((i+1)+"\t");
			for(int j =0;j<score[i].length;j++) {
				sum += score[i][j];
				System.out.print(score[i][j] + "\t");
			}
			
			avg = sum/score[i].length;
			System.out.print(sum + "\t");
			System.out.print(avg + "\t");
			System.out.println();
		}
		
		System.out.println("================");
		System.out.print("\t"+kortotal);
		System.out.print("\t"+engtotal);
		System.out.print("\t"+mattotal);
		System.out.println();
		
		
		System.out.print("\t"+kortotal/score.length);
		System.out.print("\t"+engtotal/score.length);
		System.out.print("\t"+mattotal/score.length);
	}
}
	