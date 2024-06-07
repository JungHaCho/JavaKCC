package kosa_mission2;

import java.util.Arrays;
import java.util.Scanner;

public class Mission2_1 {

	public static int[] solution(int arr[]) {
		
		int answer[] = new int [arr.length];
		int cnt = 0;
		
		answer[cnt++] = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[i-1]){
				answer[cnt++] = arr[i];
			}
		}
		
		int answer2[] = new int[cnt];
		for(int i=0; i<cnt; i++) {
			answer2[i]=answer[i];
		}
		
		return answer2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// n개 입력받아
		// 1번째보다 큰수를 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("몇개?");
		
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i=0; i <arr.length; i++) {	
			arr[i] = sc.nextInt();			
		}
		
		int answer[] =solution(arr);
		
		for(int i =0; i < answer.length; i++) {
			System.out.print(answer[i]+ " ");
		}
		
	}

}
