package kosa.api;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Date now = new Date();
//		String str = now.toString();
//		System.out.println(str);
//		
//		SimpleDateFormat sdf = 
//				new SimpleDateFormat("");
//		
//		String str2 = sdf.format(now);
//		System.out.println(str2);
//	

		// 키보드 입력받기
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
	
		Date date = null;
		
		try {
			 date = df.parse("2024/06/04");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(date);
	}

}
