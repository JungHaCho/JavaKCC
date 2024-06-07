package kosa_oop;

public class AccountMain2 {
	public static void main(String[] args) {

		
		Account arr[]= {
				new Account("111-111","홍길동",10000),
				new CheckingAccount("111-111","홍길동",20000,"222-222"),
				new MinusAccount("111-111","홍길동",30000,20000)
		};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] instanceof CheckingAccount) {
				try {
					((CheckingAccount)arr[i]).pay("222-222", 5000);
				}catch (Exception e) {
					
				}
			}
		}
		
		System.out.println(arr[1].getBalance());
		//부모로 형변환
//		Account ca = new CheckingAccount("111-111", "홍길동", 10000, "222-222");
//		CheckingAccount ca2 = (CheckingAccount)ca;
//		처음부터 부모이면 자식으로 갈수 없다.
//		Account ca = new Account();
		//CheckingAccount ca2 = (CheckingAccount)ca;
		
//		CheckingAccount obj = (CheckingAccount)ca;
//		try {
//			if(ca instanceof CheckingAccount) {
//				ca.pay("222-222", 3000);
//			}else {
//				System.out.println("형변환 불가");
//			}
//					
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(ca2.getBalance());
//
//		
//		CheckingAccount ca = 
//				new CheckingAccount("111-111","홍길동",10000,"222-222");
//		
//		try {
//			ca.pay("222-222",3000);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(ca.getBalance());
//		
//		

//		
//		
//		MinusAccount ma = new MinusAccount("111-111","홍길동",10000,10000);
//		
//		try {
//			ma.withdraw(1000);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//	

	}
}
