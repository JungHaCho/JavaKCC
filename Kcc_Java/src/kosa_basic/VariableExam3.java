package kosa_basic;

public class VariableExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ����(����)���� Ư¡ 2����
		// 1. �ݵ�� �ʱ�ȭ �� ����ؾ��Ѵ�.
		// 2. ����� ������ ���ǵ� ���� �ȿ����� ��밡���Ѵ�.
		// ����Ʈ ������ �ʱ�ȭ �������
		int num = 0;
		
		num = num+1;
		System.out.println(num);
		
		int a =0; //if�� false�� �ʱ�ȭ�ȵ�
		if(num == 1) {
			a = 100;
		}
		System.out.println(a);
		
		//-------------------------------------------------
		int i=1;
		for(i=0;i<10;i++) {
			System.out.println(i+",");
		}
		System.out.println("���� i��: "+i);
		
		//���� ���� ���?
		//1. � ������ ������? => ������ Ÿ��
		//2. �����͸� ������ ���? => ���� ���� ��ġ ����
		
	
		//������ %
		if(11%2 ==0) {
			System.out.println("2�ǹ��");
		}else {
			System.out.println("2�� ��� �ƴ�");
		}
		
		int num2 = 1;
		// num2 = num2 + 1;
		// num2 +=1;
		// num2 ++;
		
		System.out.println(num2);
		
		//---------------------------------
		// ����?
		int x = 10;
		int y = 0;
		
		y = ++x;		
		System.out.println(x);
		System.out.println(y);
		
		y = x++;
		System.out.println(x);
		System.out.println(y);
		
		double d = 3.14+1; // 4.14000000000001
		if(d==4.14) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		int b =10;
		int c = 20;
		int max = (b>c) ? b : c ;
		
		
	}
}
