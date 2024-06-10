package kosa.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class kosaWriter {

	public static void main(String[] args) {
		// Ű����� ���� ���ڿ��� �Է¹޾� ���Ͽ� ���� ������ ��������
		// "q"�� �Է��ϱ� ������ ���ڿ��� ���Ͽ� ������ ����.
		// FileWriter : writer(���ڿ�)
		// ���ϸ� : poem2.txt :�̸� ���� X
		// �ڵ� ������ ���÷��� f5 => ������ ���� Ȯ�� ����
		// close() ����

		Scanner sc = new Scanner(System.in);
		FileWriter writer = null;
		String str = "";
		String poem = "";
		System.out.println("�Է� : ");
		while (!(str = sc.nextLine()).equals("q")) {
			poem += str;
			poem += "\n";
		}
		try {
			writer = new FileWriter("poem2.txt");
			writer.write(poem);

			System.out.println("�Էµƽ��ϴ�.");

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
