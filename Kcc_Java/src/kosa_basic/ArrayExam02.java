package kosa_basic;

public class ArrayExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2차원 배열
		//1. 모든 2차원배열의 크기 일정
		int arr[][];
		arr = new int[3][2];
		
		//2. 각 2차원크기가 다를 때 
		int arr2[][] = new int[3][];
		arr2[0] = new int[2];//[0][2]
		arr2[1] = new int[3];//[1][3]
		arr2[2] = new int[4];//[2][4]
		
		//3. 2차원 배열 선언, 생성, 초기화
		
		int arr3[][] = {{1,2},{1,3,2},{3,2,4,2}}; //int[3][]
		
		// for문 바깥 - 1차원
		// arr3.length = 1차원 배열의 갯수 :3
		for(int i =0;i<arr3.length;i++) {
			for(int j =0;j<arr3[i].length;j++) {
				System.out.println("arr3["+i+"]"+"["+j+"]"+arr3[i][j]);
			}
		}
	}

}
