package kosa.mission;

import java.util.Scanner;

public class Mission03 {

	public static void main(String[] args) {
		// ������ �������� ���� ��ü �ڸ��� �� ¦��, Ȧ���� ������ ������.
		// 5�ڸ��� ex) 12345
		Scanner sc = new Scanner(System.in);
		String strNum = sc.nextLine();

		int evenCnt = 0;
		int oddCnt = 0;
		for (int i = 0; i < strNum.length(); i++) {
			if ((int) strNum.charAt(i) % 2 == 0) {
				evenCnt++;
			} else {
				oddCnt++;
			}
		}

		System.out.println("¦���� ����: " + evenCnt + "��");
		System.out.println("Ȧ���� ����: " + oddCnt + "��");
	}

}
