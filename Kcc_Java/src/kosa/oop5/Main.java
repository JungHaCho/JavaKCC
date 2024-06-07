package kosa.oop5;

public class Main {

	public static void main(String[] args) {

		MyType myType = new MyType() {

			@Override
			public void hello() {
				System.out.println("hi");
			}

		};

		myType.hello();

		MyType my2 = () -> {
			System.out.println("람다식 형식입니다.");
		};
		my2.hello();

		MyType my3 = () -> System.out.println("람다식형식 2입니다.");
		my3.hello();

		YourType you = (String message) -> {
			System.out.println("메세지 " + message);
		};
		you.talk("hello1");

		YourType you2 = (String message) -> System.out.println("메세지 " + message);
		you2.talk("hello2");

//		
//		MyNumber myNum = (num1, num2) -> {
//			if (num1 > num2) {
//				return num1;
//			}
//			return num2;
//		};
//
//		System.out.println(myNum.getMax(2, 1));
		
		MyNumber myNum = (num1, num2) -> (num1 > num2) ? num1:num2;
		
		
		Runnable r = () -> {
			for(int i =1;i<=10;i++) {
				try {
					Thread.sleep(1000);
				}catch(Exception e){}
				System.out.println(i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
	}

}
