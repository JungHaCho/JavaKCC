package kosa.io;

import java.io.File;

public class FileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\KOSA\\Desktop\\kcc\\work\\Kcc_Java";

		File f = new File(path);

		if (f.isDirectory()) {
			System.out.println("디렉토리입니다.");
			System.out.println(f.getName() + "폴더입니다.");
			File arr[] = f.listFiles();
			for (int i = 0; i < arr.length; i++) {
				File file = arr[i];
				for (int j = 0; j < arr.length; j++) {
					if (file.isDirectory()) {
						file.listFiles();
						System.out.println("--" + file.getName());
					} else {

					}
				}
				System.out.println("**" + arr[i].getName());
			}
		} else {
			System.out.println("파일입니다.");
		}

	}

}
