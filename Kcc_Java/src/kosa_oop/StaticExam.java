package kosa_oop;

public class StaticExam {

	int total;
	static int grandTotal;
	
	public static void add() {
		grandTotal += 10;
		// total += 20; �޸𸮰� �����Ǵ� ������ �޶� ����Ҽ� ����.
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		
	}

}
