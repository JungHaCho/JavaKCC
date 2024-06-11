package kosa.io;

import java.io.File;
import java.util.Scanner;

public class MiniDosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mainF = "C:\\Users\\KOSA\\Desktop\\upload";
		
		File firstFile;
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("움직일 동작 정하기 : ls , cd, cd.. , mkdir ");
			String menu = sc.nextLine();
			switch(menu) {
			case "ls":
				firstFile = new File(mainF);
				MiniDos.lsDos(firstFile);
				break;
			case"cd":
				System.out.println(" 옮길 폴더명은?");
				String filename = sc.nextLine();
				firstFile = new File(mainF);
				mainF = MiniDos.cdDownDos(firstFile,filename);
				break;
			case"cd..":
				File nowFile = new File(mainF);
				mainF = MiniDos.cdUpDos(nowFile);
				break;
			case"mkdir":
				System.out.println("만들 디렉토리 입력하시오");
				String Dname = sc.nextLine();
				
				MiniDos.mkdirDos(mainF,Dname);
				break;
			// 파일 내용작성 :  q가 파일저장
			case"vi":
				String newname = sc.nextLine();
				
				MiniDos.vi(mainF,newname);
				break;
			}
		}
	}

}
