package kosa.api;

import java.util.Calendar;

public class CharlendarExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2024년 달력을 그리세요
		// < 2024년 6월 >
		// 일 월 화 수 목 금 토
		// 1
		// 2 3 4 5 6 7 8

		Calendar gc1 = Calendar.getInstance();
		int n = gc1.getActualMaximum(Calendar.DATE);
		gc1.set(2024, 1, 1);
		int week = gc1.get(Calendar.DAY_OF_WEEK);

		System.out.println("<2024년 6월>");
		System.out.println("일\t 월\t 화\t 수\t 목\t 금\t 토\t");
		// week는 날짜 숫자값
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
