package kosa_mission;

public class LoopExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단
		/*
		for(int i =2;i<=9;i++) {
			System.out.println(i+"단 >>>"+i);
			for(int j =1;j<=9;j++) {
				System.out.println(i + "*" +j +"="+ i*j);
			}
		
		}
		*/
		
		//퀴즈 > 4x +5y = 60 x,y모든 경우릐 수
/*		
		int x =0;
		int y =0;
	
		

	for(x=0;x<=12;x++) {
		for(y=0;y<=12;y++) {
			System.out.println(y);
			if((4*x)+(5*y) ==60) {
				System.out.println("x : "+x+"y : "+y);
				break outerLabel;
			}
		}
		
	}
		
*/
/*
	for(int i=1;i<=5;i++) {
		
		for(int j =1;j<= i;j++) {
			System.out.print("*");
			
		}
		System.out.println("");
	}
	*/
		/*
		 
		for(int i=1;i<=5;i++) {
			for(int j =5;j>=i;j--) {
				System.out.print("*");
				
			}
			System.out.println("");
		} 
		 
		 */
	/*
	  배열
	  
	  쓰지않는 공간도 메모리에 잡힌다.
	  확장성이 부족하다
	  자료형을 다양하게 못쓴다.
	  
	  실제 들어간 데이터 개수를 모른다
	  -> 자료구조의 의미
		-> 배열의 사용함의 불편함때문에 배열을 나눔
	
	배열을 선언한다 
	-> 배열을 참조할 수있는 공간을 만든다.
	-> 배열은 주소를 참조할 수 있는 주소값을 말한다.
	 arr = new int[3] // new연산자를 사용해서 배열의 크기를 할당해줘야한다.
	  배열은 주소값을 할당해줘야한다 => 메모리를 할당한다.

	  
	 */	
		
	}

}
