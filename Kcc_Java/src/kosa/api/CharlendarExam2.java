package kosa.api;

import java.util.Calendar;

public class CharlendarExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2024�� �޷��� �׸�����
		// < 2024�� 6�� >
		// �� �� ȭ �� �� �� ��
		// 1
		// 2 3 4 5 6 7 8

		Calendar gc1 = Calendar.getInstance();
		int n = gc1.getActualMaximum(Calendar.DATE);
		gc1.set(2024, 1, 1);
		int week = gc1.get(Calendar.DAY_OF_WEEK);

		System.out.println("<2024�� 6��>");
		System.out.println("��\t ��\t ȭ\t ��\t ��\t ��\t ��\t");
		// week�� ��¥ ���ڰ�
		for (int i = 1; i < week; i++) {
			System.out.print("\t");
		}

		for (int i = 1; i <= n; i++) {
			System.out.print(i + "\t");
			if ((week + i - 1) % 7 == 0) {
				System.out.println();
			} else {

			}

		}

	}

}