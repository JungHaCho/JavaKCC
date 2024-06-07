package kosa.api.mission;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateMission1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		
		
		Date inDate = null;
		
		while(sc.hasNextLine()) {
			try {
				inDate = df.parse(sc.nextLine());
				
			}catch(Exception e){
				System.out.println("다시입력하시오");
			}
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		
		Calendar today = Calendar.getInstance();
		
		//총일수

		long day = (today.getTimeInMillis()-cal.getTimeInMillis())/(24*60*60*1000);
		System.out.println(day);
		
		int year = (int)(day/365);
		int month = (int)(day/365)/30;
		
		System.out.println("재직기간"+year+"년"+ month+"월 근속");
	}

}
