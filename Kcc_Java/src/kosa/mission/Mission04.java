package kosa.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		// ���ڿ� ��
		String a = "abc";
		String b = "abc";

		if (a.equals(b)) {
			System.out.println("����");
		} else {
			System.out.println("Ʋ����");
		}

		// �� ������ ������ ���ڿ��� �Է� �޾�
		// ��Ģ���� ����� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("����1: ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("����2: ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("������: ");
		String operator = sc.nextLine();

		int result = -1;
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		}

		System.out.println("���> " + result);
	}

}
