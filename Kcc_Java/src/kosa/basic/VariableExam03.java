package kosa.basic;

public class VariableExam03 {

	public static void main(String[] args) {
		// ����(����)���� Ư¡ 2����
		// 1. �ݵ�� �ʱ�ȭ �� ����ؾ� �Ѵ�.
		// 2. ����� ������ ���ǵ� ���� �ȿ����� ��� �����ϴ�.

		int num = 0;

		num = num + 1;
		System.out.println(num);

		int a = 0;
		if (num == 1) {
			a = 100;
		}

		System.out.println("a: " + a);

		int i = 1;
		for (; i <= 10; i++) {
			System.out.print(i + ", ");
		}

		System.out.println(i);

		// ���� ��� �� ���
		// 1. � ������ ������? => ������ Ÿ�� ���� ����
		// 2. ������ ��� ���� => ���� ���� ��ġ ����

		// ������ %
		System.out.println(10 % 3);

		if (11 % 2 == 0) {
			System.out.println("2�� ��� O");
		} else {
			System.out.println("2�� ��� X");
		}

		// ���� ���� ������
		int num2 = 1;
		num2 += 1;

		// ���� ������
		num2++;

		System.out.println(num2);

		int b = 10;
		int c = 20;

		int max = (b > c) ? b : c;

		System.out.println(max);
	}

}
