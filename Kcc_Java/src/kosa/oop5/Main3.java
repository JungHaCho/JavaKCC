package kosa.oop5;

interface AA{
	BB abc(); // BŸ�� �����Ϸ��� B�� �־����
}

class BB{
	BB(){
		System.out.println(" B ������");
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
		
		//�ν��Ͻ� ����
		
		AA a3 = BB::new; // BB��ü�� �����Ѵ�.
		a3.abc();
		
	}
}