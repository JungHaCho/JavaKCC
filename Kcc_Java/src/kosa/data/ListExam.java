package kosa.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ListExam {

	public static void main(String[] args) {
		new ArrayList()
//		int arr[] = new int[6];
//		int num = (int) Math.random();
//
//		for (int i = 0; i < arr.length; i++) {
//			if (i == 0) {
//				arr[0] = num;
//			} else {
//				if (num == arr[i]) {
//					arr[i] = (int) Math.random();
//				}
//			}
//			System.out.println(i+">>>>"+arr[i]);
//		}
		
//		Random r = new Random();
//		
//		int arr[] = new int[6];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = r.nextInt(45) +1;
//			for(int j=0;j<i;j++) {
//				if(arr[i] == arr[j]) {
//					i = i-1;
//				}
//			}
//		}
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		
		Random r = new Random();
// list 자료구조
//		List<Integer> list = new ArrayList<Integer>();
//		
//		while(true) {
//			int n = r.nextInt(45) + 1;
//			if(list.contains(n)) {
//				continue;
//			}else {
//				list.add(n);
//			}
//			if(list.size() ==6) break;
//		}
//		
//		Collections.sort(list);
//		System.out.println(list);

		// set 구현 treeSet 중복 허용x
		Set<Integer> set = new TreeSet<Integer>();
		
		for(int i=0;set.size()<6;i++) {
			set.add(r.nextInt(45)+1);
		}
	
		System.out.println(set);
	
	}
}
