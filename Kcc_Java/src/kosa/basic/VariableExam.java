package kosa.basic;

public class VariableExam {

	public static void main(String[] args) {
		// ������ �����͸� ��� �׸� ex) ȫ�浿, 100, 3.14, true
		// byte, char, short, int, long, float, double, boolean : Primitive Type
		int num; // ���� ���� : �޸� �Ҵ�
		int arr[]; // �迭 ���� : Object Type

		num = 10;

		// ���� ���� �� �ʱ�ȭ
		int num2 = 100;

		// ���ڿ�: String
		String name = "ȫ�浿";
		System.out.println(name);

		// ���� ���� ���ǻ���
		// ������ : Ư������X, ���ڷ� ����X, �ҹ��� ����, _

		// �⺻ ���ͷ�: 100�� �⺻ ���ͷ��� int������ �Ǿ��ִ�. "" -> String��, '' -> char��, true -> boolean��, 31.4 -> double��
		float a = 3.14f; // 3.14 ��, float -> double�� ĳ�����ϱ� ���� (float) ��������� �ۼ������ �ϴµ�, 'f'��� ���ڷ� ��ü�� �� �ִ�.
		
		// ĳ����(����ȯ)
		double b = 100;
		int c = (int)3.14;
		System.out.println(c);
		
		float num3 = 3.14f;
		long num4 = 100L;
		
		int num5 = 010; // 8�������� 10�� �ƴ�, 8�� ��µȴ�.
		System.out.println(num5);
		
	}

}
