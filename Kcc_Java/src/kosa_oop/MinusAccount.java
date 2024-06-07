package kosa_oop;

public class MinusAccount extends Account{

	private int creaditLine;
	
	public MinusAccount() {
		
	}

	public MinusAccount(String accountNo, String ownwerName, int d, int creaditLine) {
		super(accountNo, ownwerName, d);
		this.creaditLine = creaditLine;
	}
	
	// �������̵�
	// 1. ��Ӱ���
	// 2. �޼����� �ñ׳�ó(����������, ������, �̸�, �Ķ����) ��ġ
	// 3. �޼����� ���� ����ġ(������)

	@Override
	public int withdraw(int amount) throws Exception {
		// TODO Auto-generated method stub
		if(getBalance() + creaditLine <amount) {
			throw new Exception("�ܾ� ����");
		}
		
		int balance = getBalance();
		setBalance(balance -amount);
		return balance;
	}
	
	
}
