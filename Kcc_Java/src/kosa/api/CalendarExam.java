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
		String now = gc.get(Calendar.YEAR)+ "��"
							+(gc.get(Calendar.MONTH)+1)+"��"
							+ gc.get(Calendar.DATE)+"��"
							+gc.get(Calendar.HOUR)+"��"
							+gc.get(Calendar.MINUTE)+"��";
		
		System.out.println(" ���� �ð� : "+now);
//		
//		gc.add(Calendar.DATE, 100);
//		
//
//		String future = gc.get(Calendar.YEAR)+ "��"
//							+(gc.get(Calendar.MONTH)+1)+"��"
//							+ gc.get(Calendar.DATE)+"��"
//							+gc.get(Calendar.HOUR)+"��"
//							+gc.get(Calendar.MINUTE)+"��";
//		
//		System.out.println(" 100�� �� : "+future);
//		
//		gc.set(2022,5,4);
//		gc.add(Calendar.DATE, 1000);
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//		String str = sdf.format(gc.getTime());
//		System.out.println(str);
		
		
		// 2024����� 2030����� �ڽ��� ���� �������� ?
		// Calendar.DAY_OF_WEEK => ���� <��1 ��2 ȭ3~ ��4 ��5 ��> <
		
		
//		
//		for(int i=2024; i<=2030;i++) {
//			gc.set(i,9,9);
//			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
//			String str1 = sdf1.format(gc.getTime());
//			System.out.println(str1);
//			System.out.println("����"+gc.get(Calendar.DAY_OF_WEEK));
//			
//			gc.add(Calendar.YEAR, 1);
//		}
		
//		gc.set(2024,1,1);
//		
//		gc.add(Calendar.DATE, 251);
//		
//		System.out.println("����"+gc.get(Calendar.DAY_OF_WEEK));
		
//		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
//		String str1 = sdf1.format(gc.getTime());
//		
		char week[] = {'��','��','ȭ','��','��','��','��'};
		for(int i=2024;i<=2030;i++) {
			gc.set(i,5,4);
			char c = week[gc.get(Calendar.DAY_OF_WEEK)-1];
			System.out.println(i+"���� ������ "+ c + "�����Դϴ�.");
		}
		
		
		gc.set(2024,1,1);
		
	}

}