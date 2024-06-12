package kosa.io;

import java.io.File;
import java.util.Scanner;

public class FunctionMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		File file = new File("C:\\mission");
		
		while (true) {
			System.out.print(file.getAbsolutePath() + "> ");
			String str = sc.nextLine();
			
			String[] strArr = str.split(" ");
			
			if(strArr[strArr.length-1].equals("..")) {
				strArr[0] += "..";
			}
			

			switch (strArr[0]) {
			case "ls":
				Function.ls(file);
				break;
			case "cd":
				file = Function.cdChild(file, strArr[strArr.length-1]);
				break;
			case "cd..":
			case "cd ..": 
				file = Function.cdParent(file);
				break;
			case "mkdir":
				Function.mkdir(file, strArr[strArr.length-1]);
				break;
			case "cp":
				Function.cp(new File(strArr[strArr.length-1]), file);
				break;
			case "q" :
			case "Q" :
				return;
			}
		}

	}

}
