package kosa_oop;

public class Account {

	// ���� ��ü ���� �ϱ�����
	// ��ü�κ��� ����� ������ ������ ����� ����
	// ����(������) : ���¹�ȣ, ������, �ܾ� => ������� = �ʵ�
	// �ൿ(���) : �Ա��ϴ�, ����ϴ� => ����޼���

	private String accountNo;// ���¹�ȣ
	private String ownwerName;// ������
	private int balance;// �ܾ�

	public Account() {
	} // ����Ʈ ������ (����� ��������)
		// �����ڰ� ������ �ڵ����� ����Ʈ �����ڸ� ������ش�.
		// ���������ϴ� ���� : �Ķ���Ͱ� �ִ� �����ڸ� ����ٸ� ����Ʈ ������ ���������Ѵ�.

	public Account(String accountNo, String ownwerName, int balance) {

		this.accountNo = accountNo;
		this.ownwerName = ownwerName;
		this.balance = balance;
	}

	// �Ա��ϴ�.
	public void deposit(int amount) {
		balance += amount;
	}

	// ����ϴ�.
	// ȣ���ϴ� ���忡�� �ذ��ؾ��Ѵ�.

	public int withdraw(int amount) throws Exception {

		if (balance < amount) {
			throw new Exception("�ܾ� ����");
		}

		balance -= amount;

		return amount;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnwerName() {
		return ownwerName;
	}

	public void setOwnwerName(String ownwerName) {
		this.ownwerName = ownwerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void print() {
		System.out.println("�θ�");
	}

}