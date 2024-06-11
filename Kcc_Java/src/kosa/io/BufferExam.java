package kosa.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner => 키보드로 데이터 입력
		//System.in => InputStream => InputStreamReader => BufferdReader
		// 키보드 -> byte -> 문자열 -> 문자를 한줄씩 읽기 위해
		//InputStreamReader은 필터 스트림이라서 InputStream(byte)가 변환하기 위해 필요하다.
		//-> 노드 스트림이 필요하다.
//		InputStream in = System.in;
//		InputStreamReader isr = new InputStreamReader(in);
//		BufferedReader br = new BufferedReader(isr);
		
		// ctrl + z
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("output.txt"));
			
			System.out.println("입력");
			String str ="";
			while((str = br.readLine()) != null){
				str +="\n";
				bw.write(str);
			}
			System.out.println("쓰기완료");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
