package kosa_basic;

public class ArrayExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2���� �迭
		//1. ��� 2�����迭�� ũ�� ����
		int arr[][];
		arr = new int[3][2];
		
		//2. �� 2����ũ�Ⱑ �ٸ� �� 
		int arr2[][] = new int[3][];
		arr2[0] = new int[2];//[0][2]
		arr2[1] = new int[3];//[1][3]
		arr2[2] = new int[4];//[2][4]
		
		//3. 2���� �迭 ����, ����, �ʱ�ȭ
		
		int arr3[][] = {{1,2},{1,3,2},{3,2,4,2}}; //int[3][]
		
		// for�� �ٱ� - 1����
		// arr3.length = 1���� �迭�� ���� :3
		for(int i =0;i<arr3.length;i++) {
			for(int j =0;j<arr3[i].length;j++) {
				System.out.println("arr3["+i+"]"+"["+j+"]"+arr3[i][j]);
			}
		}
	}

}
