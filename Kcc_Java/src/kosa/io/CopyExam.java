package kosa.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CopyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileWriter writer = null;
		FileReader reader = null;
		char arr[] = new char[10];
//		String s = "";

		try {
			reader = new FileReader("poem2.txt");
			writer = new FileWriter("poem3.txt");

			while (true) {

				Arrays.fill(arr,' ');
				int data = reader.read(arr);
				if(data == -1) break;
				writer.write(arr);
//				int data = 0;
//				data = reader.read();
//
//				if (data == -1) {
//					break;
//				}
//
//				s += (char) data;
			}

			System.out.println("복사완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
				reader.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
