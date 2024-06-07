package kosa.oop5;

interface AA{
	BB abc(); // B타입 리턴하려면 B가 있어야함
}

class BB{
	BB(){
		System.out.println(" B 생성자");
	}
	
}

public class Main3 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		AA a1 = new AA() {
			
			@Override
			public BB abc() {
				// TODO Auto-generated method stub
				return new BB();
			}
		}; 
			
		a1.abc();
		
		AA a2 = () ->  new BB();
		a2.abc();
		
		//인스턴스 참조
		
		AA a3 = BB::new; // BB객체를 리턴한다.
		a3.abc();
		
	}
}
