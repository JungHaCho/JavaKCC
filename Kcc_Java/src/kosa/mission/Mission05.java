package kosa.mission;

import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		xx: while (true) {
			System.out.println("---------1. �߰� 2. ��� 3. �˻� 4. ����---------");
			System.out.print("��ɾ� �Է�: ");
			int cmd = Integer.parseInt(sc.nextLine());

			switch (cmd) {
			case 1:
				System.out.println(">>> �޴� �߰�\n");
				break;
			case 2:
				System.out.println(">>> ���\n");
				break;
			case 3:
				System.out.println(">>> �˻�\n");
				break;
			case 4:
				System.out.println(">>> ����\n");
				break xx;
			}

		}

	}

}
