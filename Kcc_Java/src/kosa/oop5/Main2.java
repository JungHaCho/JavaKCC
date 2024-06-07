package kosa.oop5;

interface A{
	void abc();
}

class B{
	void bcd() {
		System.out.println("메서드 호출");
	}
}


public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 익명 클래스를 이용해서 abc() 오버라이딩 -> B를 생성해서 bcd()를 호출
		
		A a = new A() {
			
			@Override
			public void abc() {
				// TODO Auto-generated method stub
				B b = new B();
				b.bcd();
			}
		};
		
		//a.abc();
		
		//2. 해당내용 동일하게 람다식으로 구현

	
		A a1 = () -> {
			B b = new B();
			b.bcd();
		};
	
		//3. 인스턴스 참조 구현
		B b =  new B();
		A a3 = b::bcd; 
		
		a3.abc();
		
		
	
	}
}
