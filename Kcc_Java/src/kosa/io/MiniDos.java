package kosa.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class MiniDos {

	// ls 파일목록 출력
	public static void lsDos(File firstFile) {

		File list[] = firstFile.listFiles();
		for (int i = 0; i < list.length; i++) {
			if (list[i].isDirectory()) {
				System.out.println();
				System.out.println("**" + list[i].getName() + "**");
				lsDos(list[i]);
			} else {

				System.out.println("--" + list[i].getName());

			}
		}
	}

	// cd 파일 : 자식 디렉토리 이동
	public static String cdDownDos(File firstFile, String filename) {
		String movePath = firstFile.getPath() + "\\" + filename;
		String path = "";
		try {
			File downFile = new File(movePath);
			File list[] = firstFile.listFiles();

			for (int i = 0; i < list.length; i++) {

				if ((list[i].getName().equals(filename))) {
					System.out.println(list[i].getPath());
					path = list[i].getPath();
					break;
				} else {

				}

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return path;
	}

	// cd.. : 부모 디렉토리 이동
	public static String cdUpDos(File nowFile) {

		String nowpath = nowFile.getPath();
		String upDospath = nowpath.substring(0, nowpath.lastIndexOf("\\"));
		System.out.println(upDospath);

		return upDospath;
	}

	// mkdir kosa : 새로운 디렉토리 생성
	public static void mkdirDos(String mainF, String Dname) {

		File newDname = new File(mainF, Dname);
		newDname.mkdirs();
		System.out.println("폴더 생성");

	}

	public static void vi(String mainF, String newname) {

		File newTextFile = new File(mainF, newname);
		FileWriter fileWrite = null;
		BufferedReader bf = null;
		try {
			fileWrite = new FileWriter(newTextFile);
			bf = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				String str = bf.readLine();
				if (str.equals("q"))
					break;
				fileWrite.write(str);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fileWrite.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
