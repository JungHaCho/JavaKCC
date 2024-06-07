package kosa_basic;

public class CallByExam {

	public static int change(int num) {
		num += 10;
		return num;
	}
	
	public static void change2(int brr[]) {
		brr[0] = 200;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		// 갑에 의한 호출
		// 원본 값이 변하지 않는다.
		// 스코프가 다름 , 값을 변경하고 싶으면 return값을 사용해야한다.
		
//		int num = 10;
//		num = change(num);
//		System.out.println(num);

		int arr[] = {100};
	
		change2(arr);
		System.out.println(arr[0]);
	}
}
