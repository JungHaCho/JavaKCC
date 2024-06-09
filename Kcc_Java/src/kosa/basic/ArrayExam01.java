package kosa.basic;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
//		// 1. �迭 ����, ���� �и�
//		int arr[]; // �迭 ����
//		arr = new int[5]; // �迭 ����(�޸� �Ҵ�)
//
//		// 2. �迭 ����, ���� �Բ�
//		int arr2[] = new int[5];
//		arr2[0] = 10;
//		arr2[1] = 20;
//
//		// 3. �迭����, ����, �ʱ�ȭ �Բ�
//		int arr3[] = { 1, 2, 3, 4, 5 };
//
//		// �迭�� �ִ� ���� ��ü ��� for
//		for (int i = 0; i < arr3.length; i++) {
//			System.out.println("arr3[" + i + "]=" + arr3[i]);
//		}
//
//		// ���� for��
//		for (int n : arr3) {
//			System.out.print(n + ", ");
//		}

		// �迭 ��� ���
		// 1. �迭�� ���� ������ Ÿ���� �����Ѵ�.
		// 2. �迭�� ũ�⸦ �����Ѵ�. => ArrayIndexOfBoundsException ���� �߻�
		// 3. �迭 ���� ��� ���� => 1, 2, 3
		// 4. �迭�� ��� �ʱ�ȭ => ���� �ε��� ����, for��, ������ �ʱ�ȭ
		// 5. �迭�� ������ ��� ��� => for��, ���� for��, �ε����� ���� ���� ����

		// ����> Ű����κ��� ���ڿ��� �Է� �޾� �迭�� �߰��� �� ��ü�� �������
		Scanner sc = new Scanner(System.in);
		String[] results = new String[100];

		int idx = 0;
		while (true) {
			System.out.print(">�Է� : ");
			String ipt = sc.nextLine();

			if (ipt.equals("q")) {
				break;
			}

			results[idx++] = ipt;
		}

		System.out.print(">���: ");
		for (int i = 0; i < idx; i++) {
			if (i == idx - 1) {
				System.out.print(results[i]);
			} else {
				System.out.print(results[i] + ", ");
			}
		}
	}
}
