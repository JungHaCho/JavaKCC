package kosa.io;

import java.io.File;

public class FileMission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.바이트 스트림을 이용해서 이미지 파일을 복사해보자.
		
//		String source = "C:\\Users\\KOSA\\Desktop\\work\\Kcc_Java\\image.JPG";
//		String dest ="C:\\Users\\KOSA\\Desktop\\upload\\image.JPG";
//	
		
//		File sourcefile = new File(source);
//		File destfile = new File(dest);
//		CopyUtil.copyFile(sourcefile,destfile);
		
		
		//2. 디렉토리 복사를 구현하자.
		String source ="C:\\Users\\KOSA\\Desktop\\kcc\\phoneInfo";
		String dest ="C:\\Users\\KOSA\\Desktop\\upload\\phoneInfo";// 디렉토리
		
		CopyUtil.copyDirectory(new File(source),new File(dest));
	
	}

}
