package kosa.io;

import java.io.FileReader;
import java.util.Arrays;

public class kosaReader {

	public static void main(String[] args) {

		// 파일(poem.txt)에 있는 문자열 데이터를 읽어오기
		FileReader reader = null;
		char arr[] = new char[10];
		
		try {
			//FileReader 생성
			
			reader = new FileReader("poem.txt");
			
			while(true) {
				Arrays.fill(arr,' ');
				int data = reader.read();
				if(data == -1)break;
				System.out.println(arr);
			}
			
//			while(true) {
//				int data = reader.read();
//				if(data == -1)break;
//				System.out.print((char)data);
//				
//			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
}
