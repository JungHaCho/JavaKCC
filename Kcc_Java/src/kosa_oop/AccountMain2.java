package kosa_oop;

public class AccountMain2 {
	public static void main(String[] args) {

		
		Account arr[]= {
				new Account("111-111","ȫ�浿",10000),
				new CheckingAccount("111-111","ȫ�浿",20000,"222-222"),
				new MinusAccount("111-111","ȫ�浿",30000,20000)
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
		//�θ�� ����ȯ
//		Account ca = new CheckingAccount("111-111", "ȫ�浿", 10000, "222-222");
//		CheckingAccount ca2 = (CheckingAccount)ca;
//		ó������ �θ��̸� �ڽ����� ���� ����.
//		Account ca = new Account();
		//CheckingAccount ca2 = (CheckingAccount)ca;
		
//		CheckingAccount obj = (CheckingAccount)ca;
//		try {
//			if(ca instanceof CheckingAccount) {
//				ca.pay("222-222", 3000);
//			}else {
//				System.out.println("����ȯ �Ұ�");
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
//				new CheckingAccount("111-111","ȫ�浿",10000,"222-222");
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
//		MinusAccount ma = new MinusAccount("111-111","ȫ�浿",10000,10000);
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