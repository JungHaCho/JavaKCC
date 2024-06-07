package kosa_basic;

public class VariableExam {

	
	public static void main(String[] args) {
		
		int num; // 변수 선언 : 메모리 할당 : 실제 값을 넣는것
		// 변수는 데이터를 담는 그릇 
		// primitive 기본형 데이터 타입 (8가지)		
		// byte short int long, float, double, boolean, char (데이터타입)
		// 데이터 종류가 달라서 데이터 타입을 다르게 함
		
		int arr[]; // 배열선언 : object type : 참조
		// 지역변수 한정 초기화해야함 (지역변수는 중괄호)
		
		num = 10;
		// 대입 연산자, 변수 초기화
		
		System.out.println(num);
		//String 클래스 (문자열), 참조형
		
		String name = "홍길동";
		System.out.println(name+"님");
		
		//변수선언 주의사항
		// 변수명 : 특수문자 X, 숫자로 시작 X, 소문자 시작, _
		
		// float 와 double 차이
		// 기본 리터럴 : 100=> int, ""=> String, 'A' => char, true => boolean, 31.4=> double
		// float a = (float)3.14; => casting 함 큰거에서 작은거로 못바꿈
		// => float a = 3.14f
		// 자바는 컴파일 언어라서 문법이 엄격해 => 캐스팅을 해야됨
		
		// casting (형변환)
		// 기준 : byte < short < int <long < float < double, 
		//int <=> char
		// 작은것이 큰것으로 가는건 괜찮음
		
		double b = 100; // 묵시적 캐스팅
	
		int c = (int)3.14; 
		// int 형은 21억 밖에 안들어가서, long을 긍융권에서 많이 씀
	
		// 강제 형변환은 데이터 손실이 발생할 수 있다.
	
		int num5 = 010;
		// 8이 나옴 = > 8진수로 변환되기 때문이다
		
	}

}
