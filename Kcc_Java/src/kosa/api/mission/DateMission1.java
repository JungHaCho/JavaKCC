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
		System.out.println("�Է�");
		
		
		Date inDate = null;
		
		while(sc.hasNextLine()) {
			try {
				inDate = df.parse(sc.nextLine());
				
			}catch(Exception e){
				System.out.println("�ٽ��Է��Ͻÿ�");
			}
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		
		Calendar today = Calendar.getInstance();
		
		//���ϼ�

		long day = (today.getTimeInMillis()-cal.getTimeInMillis())/(24*60*60*1000);
		System.out.println(day);
		
		int year = (int)(day/365);
		int month = (int)(day/365)/30;
		
		System.out.println("�����Ⱓ"+year+"��"+ month+"�� �ټ�");
	}

}