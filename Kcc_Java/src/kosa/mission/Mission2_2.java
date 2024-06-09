package kosa.mission;

public class Mission2_2 {

	public static void main(String[] args) {
		// ���� ���� ���α׷����� ���� ���� ������ �����ϱ�
		// ��ȣ ���� ���� ���� ���� ���
		// 1 90 80 70 240 80
		// 2 50 40 30 120 40
		// ==============
		// 140 120 100
		// 70 60 50

		int[][] scores = { { 90, 80, 70 }, { 50, 40, 30 } };
		print(scores);
	}

	public static int calSum(int[] score) {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		return sum;
	}

	public static double calAvg(int sum, int size) {
		return (double) sum / size;
	}

	public static void print(int[][] scores) {
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		int[] subjectSum = new int[scores[0].length];
		
		// ��� ������ ���հ� ���
		for (int i = 0; i < scores.length; i++) {
			int total = calSum(scores[i]);
			String formattedAvg = String.format("%.2f", calAvg(total, scores[i].length));
			System.out.printf("%d\t", i + 1);

			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
				subjectSum[j] += scores[i][j];
			}

			System.out.print(total + "\t");
			System.out.println(formattedAvg + " ");
		}

		System.out.println("====================");
		
		// ���� ����
		System.out.print("\t");
		for (int sum : subjectSum) {
			System.out.print(sum + "\t");
		} 
		System.out.println();
		
		// ���� ���
		System.out.print("\t");
		for (int sum : subjectSum) {
			String subAvg = String.format("%.2f", calAvg(sum, scores.length));
			System.out.print(subAvg + " ");
		}
		System.out.println();
	}
}
