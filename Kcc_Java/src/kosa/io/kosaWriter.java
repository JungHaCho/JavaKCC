package kosa.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class kosaWriter {

	public static void main(String[] args) {
		// 키보드로 부터 문자열을 입력받아 파일에 쓰는 예제를 구현하자
		// "q"를 입력하기 전까지 문자열을 파일에 쓰도록 하자.
		// FileWriter : writer(문자열)
		// 파일명 : poem2.txt :미리 생성 X
		// 코드 실행후 리플래쉬 f5 => 파일의 생성 확인 가능
		// close() 구현

		Scanner sc = new Scanner(System.in);
		FileWriter writer = null;
		String str = "";
		String poem = "";
		System.out.println("입력 : ");
		while (!(str = sc.nextLine()).equals("q")) {
			poem += str;
			poem += "\n";
		}
		try {
			writer = new FileWriter("poem2.txt");
			writer.write(poem);

			System.out.println("입력됐습니다.");

		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
