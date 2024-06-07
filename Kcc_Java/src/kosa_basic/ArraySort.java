package kosa_basic;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,2,5};
		int result =0;
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
//		
//		for(int i=0; i<arr.length;i++) {
//			System.out.print(arr[arr.length-1-i]+",");
//		}
//		
//
//		for(int i = arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+","); 
//		}
// 
		/* Comparator ,deepToString
		 
		int arr2[][] = {{2,9},{1,90},{3,30}};
		
		Arrays.sort(arr2, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				
				// 정렬기준을 작성 => 2차원 배열 안에 1차원 첫번째 인덱스를 기준으로 오름차순
				// 오름차순 기준
				// return -1 변하지 않는다. ( 앞에 값(o2)이 크면 그대로 나온다. )
				// return 1 변한다.			 ( 앞에 값(o1)이 크면 뒤에 값과 바꾼다. )
				if(o1[0] < o2[0]) {
					return -1;
				}else if(o1[0] > o2[0]) {
					return 1;
				}else {
					return 0;	
				}
			}
		});
		
		System.out.println(Arrays.deepToString(arr2));
		*/
		
		
	}

}
