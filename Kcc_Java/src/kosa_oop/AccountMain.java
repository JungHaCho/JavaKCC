package kosa_oop;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account; // ������(Ŭ���� Ÿ��)
		account = new Account(); 	// ��ü ���� : �޸� �Ҵ�, �ּҰ��� �����ϴ� ���ҵ� ��
													// ��ü ���� => �ν��Ͻ�ȭ : m1 => �ν��Ͻ�����
													
//		account.accountNo = "111-111";//��ü �ʱ�ȭ
//		account.ownwerName = "ȫ�浿";
//		account.balance = 10000;
		
		
		try {
			account.withdraw(30000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); //
			System.out.println(e.getMessage());
		}

//		System.out.println("���¹�ȣ: " + account.accountNo);
//		System.out.println("���¹�ȣ: " + account.ownwerName);
//		System.out.println("���¹�ȣ: " + account.balance);
		// new �����ڴ� ���� ������Ÿ���̿��Ѵ�.

	}

}
