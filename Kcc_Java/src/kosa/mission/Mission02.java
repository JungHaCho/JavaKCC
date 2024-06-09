package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	public static final int SUB_CNT = 3;

	public static void main(String[] args) {
		// �������� ����
		// ��,��,�� ������ �Է� �ް� ������ ���(�Ǽ���)�� ����ϱ�
		Scanner sc = new Scanner(System.in);
		int korScore = Integer.parseInt(sc.nextLine());
		int engScore = Integer.parseInt(sc.nextLine());
		int mathScore = Integer.parseInt(sc.nextLine());

		int sum = korScore + engScore + mathScore;
		double avg = (double) sum / SUB_CNT;

		System.out.println("����: " + sum + " ���: " + avg);

		// ���� 90�̻� -> A����
		// 80�̻� -> B����
		// 70�̻� -> C����
		// 60�̻� -> D����
		// 50�̻� -> F����
		char grade;
		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else if (avg >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("����: " + grade);
	}

}
