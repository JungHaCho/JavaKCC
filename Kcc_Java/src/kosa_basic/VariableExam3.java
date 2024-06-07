package kosa_basic;

public class VariableExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 지역(로컬)변수 특징 2가지
		// 1. 반드시 초기화 후 사용해야한다.
		// 2. 선언된 변수는 정의된 범위 안에서만 사용가능한다.
		// 디폴트 값으로 초기화 해줘야함
		int num = 0;
		
		num = num+1;
		System.out.println(num);
		
		int a =0; //if가 false면 초기화안됨
		if(num == 1) {
			a = 100;
		}
		System.out.println(a);
		
		//-------------------------------------------------
		int i=1;
		for(i=0;i<10;i++) {
			System.out.println(i+",");
		}
		System.out.println("최종 i값: "+i);
		
		//변수 사용시 고민?
		//1. 어떤 종류의 데이터? => 데이터 타입
		//2. 데이터를 어디까지 사용? => 변수 선언 위치 결정
		
	
		//연산자 %
		if(11%2 ==0) {
			System.out.println("2의배수");
		}else {
			System.out.println("2의 배수 아님");
		}
		
		int num2 = 1;
		// num2 = num2 + 1;
		// num2 +=1;
		// num2 ++;
		
		System.out.println(num2);
		
		//---------------------------------
		// 값은?
		int x = 10;
		int y = 0;
		
		y = ++x;		
		System.out.println(x);
		System.out.println(y);
		
		y = x++;
		System.out.println(x);
		System.out.println(y);
		
		double d = 3.14+1; // 4.14000000000001
		if(d==4.14) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		int b =10;
		int c = 20;
		int max = (b>c) ? b : c ;
		
		
	}
}
