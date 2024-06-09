package kosa.mission;

import java.util.Scanner;

public class Mission2_1 {

	public static void main(String[] args) {
		// ����, ����, ���� => Ű����� �Է� �޾� �迭�� �����ϱ�
		// ����, ��� ���ϱ� => �޼��� ���� ����
		Scanner sc = new Scanner(System.in);
		String[] subject = { "����", "����", "����" };
		int[] score = new int[subject.length];
		for (int i = 0; i < score.length; i++) {
			System.out.print(subject[i] + " ���� �Է� >");
			score[i] = Integer.parseInt(sc.nextLine());
		}

		int total = calSum(score);
		String formattedAvg = String.format("%.2f", calAvg(total, score.length));
		
		System.out.println("=============================");
		System.out.println("����: " + total);
		System.out.println("���: " + formattedAvg);
		System.out.println("=============================");
	} 

	public static int calSum(int[] score) {
		int sum = 0;
		for (int i : score) {
			sum += i;
		}
		return sum;
	}

	public static double calAvg(int sum, int cnt) {
		return (double) sum / cnt;
	}

}
