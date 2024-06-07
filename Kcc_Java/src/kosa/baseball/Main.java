package kosa.baseball;

import java.util.Scanner;

public class Main {
// 3개 난수 생성 받기
// 3개 키보드로 입력받기
// 비교하기
// 볼 *3 = 스트라이크
// 같은 자리 일치 : s , 다른 자리 일치 : b
// 123
// 134
// 8번째 성공

	public static void main(String[] args) {
		BaseBall b = new BaseBall();
		Scanner sc = new Scanner(System.in);

		int strike = 0;
		int ball = 0;
		int count = 0;

		int input[] = new int[3];

		do {
			System.out.println("게임도전");
			System.out.print("숫자입력(3자리)");
			for (int i = 0; i < 3; i++) {
				input[i] = sc.nextInt();
			}
			
			strike = b.countStrike(input);
			ball = b.countBall(input);			
			System.out.println(strike + "S" + ball + "B");
			count++;
			
		} while (strike != 3);
		System.out.println(count +"번째 성공했습니다.!!!");
	}

}
