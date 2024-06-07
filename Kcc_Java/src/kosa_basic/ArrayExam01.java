package kosa_basic;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//1.배열선언, 생성분리
		int arr[];
		arr = new int[5]; //배열 생성(메모리 할당)
		
		//2.배열 선언, 생성 함께
		int arr2[] = new int[5];
		arr2[0] = 10;
		arr2[1] = 20;
		
		//3.배열선언, 생성, 초기화 함께
		int arr3[] = {1,2,3,4,5};
		
		//4. 배열에 있는 내용 전체 출력 for (0~4)
		// index값을 알아야할때 사용
		// 원하는 값마 나오게 한다.
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]="+arr3[i]);
		}
		
		//향상된 for문 for(향상하는 수 : 배열)
		// 데이터만 뽑는다면 향상된 for문을 사용한다.
		// 모든 데이터를 다 뽑고 싶을때 쓴다
		 
		for(int n : arr3) {
			System.out.print(n +",");
		}
		*/
		
		//배열 사용방법
		//1. 배열에 사용될 데이터타입을 결정한다.
		//2. 배열의 크기를 결정한다. => ArrayIndexOfBoundsException 예외발생 (배열의크기를 넘김)
		//3. 배열 생성 방법 선택 => 1,2,3
		//4. 배열을 어떻게 초기화 => 직접 인덱스 접근, for문, 생성과초기화
		//5. 배열의 데이터 어떻게 출력 => for문, 향상된 for문, 직접 인덱스
		
		//퀴즈> 키보드로 붜 문자열을 입력 받아 배열에 추가한후  전체를 출력하자
		// q를 입력할때까지 입력 받는다.
		// 입력 : 홍길동
		// 입력 : 박기동
		// 입력 : q
		//>출력 : 홍길동, 박기동
		
		
		/*
		String name[] = new String[5];
		Scanner sc = new Scanner(System.in);
		int i =0;
		
		while(true) {
			System.out.println("입력 >>>> ");
			String key = sc.nextLine();

			if(key.equals("q")) break;
			name[i++] = key;
			
			for(int j=0; j<i;j++) {
				System.out.print(name[j]+",");
			}
		}
		*/
		
		
	}

}
