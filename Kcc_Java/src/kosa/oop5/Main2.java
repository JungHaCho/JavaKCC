package kosa.oop5;

interface A{
	void abc();
}

class B{
	void bcd() {
		System.out.println("�޼��� ȣ��");
	}
}


public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. �͸� Ŭ������ �̿��ؼ� abc() �������̵� -> B�� �����ؼ� bcd()�� ȣ��
		
		A a = new A() {
			
			@Override
			public void abc() {
				// TODO Auto-generated method stub
				B b = new B();
				b.bcd();
			}
		};
		
		//a.abc();
		
		//2. �ش系�� �����ϰ� ���ٽ����� ����

	
		A a1 = () -> {
			B b = new B();
			b.bcd();
		};
	
		//3. �ν��Ͻ� ���� ����
		B b =  new B();
		A a3 = b::bcd; 
		
		a3.abc();
		
		
	
	}
}