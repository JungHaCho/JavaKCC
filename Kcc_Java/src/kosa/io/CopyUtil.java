package kosa.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyUtil {
	// 원본파일, 새로 만드는 것도 파일 객체로 넣기
	// 디렉토리 복사 (해당

	public static void copyDirectory(File source, File dest) {
		FileInputStream infile = null;
		FileOutputStream outfile = null;
		try {
			if (source.isDirectory()) {
				dest.mkdirs();// 1. dest의 파일을 만들어라

				File fileList[] = source.listFiles();
				for (int i = 0; i < fileList.length; i++) {                               
					File sourceFile = fileList[i];
					
					if (sourceFile.isDirectory()) {												//디렉토리 일때 돌아감
						// new File(디렉토리 경로, 파일이름); : 디렉토리 경로에 파일이름인 파일을 만들어라
						File destFile1 = new File(dest, sourceFile.getName()); 	//
						copyDirectory(sourceFile, destFile1); 							//

					} else {
						File destFile = new File(dest, sourceFile.getName());		//
						copyFile(sourceFile, destFile);										//
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}

	}

	// 바이트 값을 가진 파일 1개를 복사하는 메서드
	public static void copyFile(File source, File dest) {

		System.out.println(dest.getPath());
		FileInputStream infile = null;
		FileOutputStream outfile = null;
		byte arr[] = new byte[1024];
		int data = 0;

		try {
			infile = new FileInputStream(source);
			outfile = new FileOutputStream(dest);

			// FileInputStream 클래스의 read()
			// read():byte 단위로 입력을 받으며, 더 이상 읽을 데이터가 없을 때 -1을 출력하는걸 알 수 있다.

			while ((data = infile.read(arr)) != -1) {
				outfile.write(arr, 0, data);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (outfile != null) {
					outfile.close();
				}
				if (infile != null) {
					infile.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
	}

}
