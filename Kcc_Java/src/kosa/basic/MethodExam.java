package kosa.basic;

public class MethodExam {

	// �޼��� ����(for ���뼺)
	// ���� ������, (static), ������(void), �޼����̸�(�Ķ����(����))

	public static void main(String[] args) {
		repeatChar('#', 10);
		repeatChar('!', 4);
		repeatChar('*', 20);

		int sum = add(10, 20);
		System.out.println(sum);
	}

	public static void repeatChar(char word, int len) {
		for (int i = 1; i <= len; i++) {
			System.out.print(word);
		}
		System.out.println();
	}

	public static int add(int num1, int num2) {
		int sum = num1 + num2;
//		System.out.println(sum);
		return sum;
	}
}
