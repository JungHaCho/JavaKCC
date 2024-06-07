package kosa.api.mission;

import java.util.Calendar;

import java.util.Scanner;

public class DateMission {

	public static void calDate(String str) {
		// ����� �� �ڸ���
		String arr[] = str.split("/");

		// 2024/06/04
		// 2014/06/04 ��¥ �Է� �ޱ�
		Calendar gc1 = Calendar.getInstance();

		int year = Integer.parseInt(arr[0]);
		int month = Integer.parseInt(arr[1]);
		int date = Integer.parseInt(arr[2]);

		// ���� ��¥ �ޱ�
		gc1.getTime();
		int nowYear = gc1.get(Calendar.YEAR);
		int nowMonth = gc1.get(Calendar.MONTH);
		int nowDate = gc1.get(Calendar.DATE);

		// ����
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

		System.out.println("��� >> " + yearResult + "��" + monthResult + "����" + dateResult + "��°");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ű����� ��¥ �Է¹޾�
		// 2014/06/04 �Է¹޾� ��� ��� ������

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		calDate(str);

	}

}