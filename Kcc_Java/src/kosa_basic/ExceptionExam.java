package kosa_basic;

public class ExceptionExam {

	public static void noEquals(int a, int b)throws Exception {
		if(a == b){
			throw new Exception("���� �� �ȵ�");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			System.out.println("1");
			noEquals(10,10); // ���ܰ� �߻��ϸ� catch�� �̵��Ѵ�.��
			System.out.println("2");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("3");
			
		}finally {
			System.out.println("4");
		}
		System.out.println("5");
		System.out.println("done........");
		
	}

}
