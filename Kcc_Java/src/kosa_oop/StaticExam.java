package kosa_oop;

public class StaticExam {

	int total;
	static int grandTotal;
	
	public static void add() {
		grandTotal += 10;
		// total += 20; 메모리가 생성되는 시점이 달라서 사용할수 없다.
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		
	}

}
