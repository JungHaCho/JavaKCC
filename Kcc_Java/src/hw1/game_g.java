package hw1;

import java.util.Scanner;

public class game_g {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� A * 2
		// ���� B * 3
		// A >= B
		// b > A --> ?��
		// ( A , B )
		// ( 7, 1 )
		// (#1 , 5��)

		// (7*2)*2)*2*2*2 < 1*3*)*3*3*3*3

		System.out.println("���� ���� �Է��Ͻÿ�");
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 1; i < T + 1; i++) {
			System.out.println("���� ���� ������ �Է��ϼ���");
			int A = sc.nextInt();
			int B = sc.nextInt();

			int cnt = 0;

			System.out.println(A + " " + B);

			while (true) {
				A = A * 2;
				B = B * 3;
				cnt++;
				if (A < B) {
					System.out.println("#" + i + " " + cnt + "��");
					break;
				}
			}

		}

	}

}
