package kosa.basic;

import java.util.Scanner;

public class VariableExam02 {

	public static void main(String[] args) {
		// Ű����κ��� ������ �Է�
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է�: ");
		int num = Integer.parseInt(sc.nextLine());

		System.out.print("���ڿ� �Է�: ");
		String str = sc.nextLine();

		System.out.println(num);
		System.out.println(str);

		// A~Z (for�� �̿�) ��ü ���
		for (int i = (int) 'A'; i <= (int) 'Z'; i++) {
			System.out.print((char) i + " ");
		}
		System.out.println();

		// int <==> String
		String num2 = "100";
		int num3 = Integer.parseInt(num2);
		int result = num3 + 100;
		System.out.println(result);

		int num4 = 10;
		String num5 = String.valueOf(num4);
		String num6 = num4 + "";

		String str2 = 7 + "7" + 7;
		System.out.println(str2);
	}
}
