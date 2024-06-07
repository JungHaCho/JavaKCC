package kosa.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// GregorianCalendar gc = new GregorianCalendar();
		//System.out.println(gc);
		
		Calendar gc = Calendar.getInstance();
		String now = gc.get(Calendar.YEAR)+ "년"
							+(gc.get(Calendar.MONTH)+1)+"월"
							+ gc.get(Calendar.DATE)+"일"
							+gc.get(Calendar.HOUR)+"시"
							+gc.get(Calendar.MINUTE)+"분";
		
		System.out.println(" 현재 시간 : "+now);
//		
//		gc.add(Calendar.DATE, 100);
//		
//
//		String future = gc.get(Calendar.YEAR)+ "년"
//							+(gc.get(Calendar.MONTH)+1)+"월"
//							+ gc.get(Calendar.DATE)+"일"
//							+gc.get(Calendar.HOUR)+"시"
//							+gc.get(Calendar.MINUTE)+"분";
//		
//		System.out.println(" 100일 후 : "+future);
//		
//		gc.set(2022,5,4);
//		gc.add(Calendar.DATE, 1000);
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//		String str = sdf.format(gc.getTime());
//		System.out.println(str);
		
		
		// 2024년부터 2030년까지 자신의 생일 무슨요일 ?
		// Calendar.DAY_OF_WEEK => 요일 <일1 월2 화3~ 수4 목5 일> <
		
		
//		
//		for(int i=2024; i<=2030;i++) {
//			gc.set(i,9,9);
//			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
//			String str1 = sdf1.format(gc.getTime());
//			System.out.println(str1);
//			System.out.println("요일"+gc.get(Calendar.DAY_OF_WEEK));
//			
//			gc.add(Calendar.YEAR, 1);
//		}
		
//		gc.set(2024,1,1);
//		
//		gc.add(Calendar.DATE, 251);
//		
//		System.out.println("요일"+gc.get(Calendar.DAY_OF_WEEK));
		
//		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
//		String str1 = sdf1.format(gc.getTime());
//		
		char week[] = {'일','월','화','수','목','금','토'};
		for(int i=2024;i<=2030;i++) {
			gc.set(i,5,4);
			char c = week[gc.get(Calendar.DAY_OF_WEEK)-1];
			System.out.println(i+"년의 생인은 "+ c + "요일입니다.");
		}
		
		
		gc.set(2024,1,1);
		
	}

}
