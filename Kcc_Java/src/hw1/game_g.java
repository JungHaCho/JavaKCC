package hw1;

import java.util.Scanner;

public class game_g {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 종현 A * 2
		// 종원 B * 3
		// A >= B
		// b > A --> ?일
		// ( A , B )
		// ( 7, 1 )
		// (#1 , 5일)

		// (7*2)*2)*2*2*2 < 1*3*)*3*3*3*3

		System.out.println("게임 수를 입력하시오");
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 1; i < T + 1; i++) {
			System.out.println("종현 종원 점수를 입력하세요");
			int A = sc.nextInt();
			int B = sc.nextInt();

			int cnt = 0;

			System.out.println(A + " " + B);

			while (true) {
				A = A * 2;
				B = B * 3;
				cnt++;
				if (A < B) {
					System.out.println("#" + i + " " + cnt + "일");
					break;
				}
			}

		}

	}

}
