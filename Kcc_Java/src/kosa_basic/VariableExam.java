package kosa_basic;

public class VariableExam {

	
	public static void main(String[] args) {
		
		int num; // ���� ���� : �޸� �Ҵ� : ���� ���� �ִ°�
		// ������ �����͸� ��� �׸� 
		// primitive �⺻�� ������ Ÿ�� (8����)		
		// byte short int long, float, double, boolean, char (������Ÿ��)
		// ������ ������ �޶� ������ Ÿ���� �ٸ��� ��
		
		int arr[]; // �迭���� : object type : ����
		// �������� ���� �ʱ�ȭ�ؾ��� (���������� �߰�ȣ)
		
		num = 10;
		// ���� ������, ���� �ʱ�ȭ
		
		System.out.println(num);
		//String Ŭ���� (���ڿ�), ������
		
		String name = "ȫ�浿";
		System.out.println(name+"��");
		
		//�������� ���ǻ���
		// ������ : Ư������ X, ���ڷ� ���� X, �ҹ��� ����, _
		
		// float �� double ����
		// �⺻ ���ͷ� : 100=> int, ""=> String, 'A' => char, true => boolean, 31.4=> double
		// float a = (float)3.14; => casting �� ū�ſ��� �����ŷ� ���ٲ�
		// => float a = 3.14f
		// �ڹٴ� ������ ���� ������ ������ => ĳ������ �ؾߵ�
		
		// casting (����ȯ)
		// ���� : byte < short < int <long < float < double, 
		//int <=> char
		// �������� ū������ ���°� ������
		
		double b = 100; // ������ ĳ����
	
		int c = (int)3.14; 
		// int ���� 21�� �ۿ� �ȵ���, long�� �����ǿ��� ���� ��
	
		// ���� ����ȯ�� ������ �ս��� �߻��� �� �ִ�.
	
		int num5 = 010;
		// 8�� ���� = > 8������ ��ȯ�Ǳ� �����̴�
		
	}

}
