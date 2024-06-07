package kosa.api.mission;

import java.util.Calendar;

import java.util.Scanner;

public class DateMission {

	public static void calDate(String str) {
		// 년월일 로 자르기
		String arr[] = str.split("/");

		// 2024/06/04
		// 2014/06/04 날짜 입력 받기
		Calendar gc1 = Calendar.getInstance();

		int year = Integer.parseInt(arr[0]);
		int month = Integer.parseInt(arr[1]);
		int date = Integer.parseInt(arr[2]);

		// 현재 날짜 받기
		gc1.getTime();
		int nowYear = gc1.get(Calendar.YEAR);
		int nowMonth = gc1.get(Calendar.MONTH);
		int nowDate = gc1.get(Calendar.DATE);

		// 뺀값
		int yearResult = nowYear - year;
		int monthResult = (nowMonth + 1) - month;
		int dateResult = nowDate - date;

		if (dateResult < 0) {
			monthResult += -1;
			dateResult = dateResult + gc1.getActualMaximum(nowMonth);

			if (monthResult < 0) {
				yearResult += -1;
				monthResult = monthResult + 12;
			}
		}

		System.out.println("결과 >> " + yearResult + "년" + monthResult + "개월" + dateResult + "일째");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드로 날짜 입력받아
		// 2014/06/04 입력받아 몇년 몇개월 재직중

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		calDate(str);

	}

}
