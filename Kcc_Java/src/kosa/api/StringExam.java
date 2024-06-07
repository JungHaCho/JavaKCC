package kosa.api;

import java.util.Arrays;

public class StringExam {

	public static void main(String[] args) {
		
		// 1. String 객체 생성 방법과 차이점
		String str1 = "ABC";
		String str2 = "ABC";// 기존의 문자열 ABC의 주소값을 참조한다
		String str3 = new String("ABC"); // 무조건 new하면 새로운 메모리를 만든다.
		
		if(str1 == str2) {
			System.out.println("길다");
		}else {
			System.out.println("다르다");
		}
		
		//2. String 클래스 불변성의 특징
		// string 클래스 안의 어떤 메서드라도 자기자신을 변경할 수 없다.
		// string 클래스안의 메서드는 return을위해 존재한다.
		// StringBuffer,StringBuilder (가변성) 가능 
		str1.concat("DEF");
		String str4 = str1.concat(str1);
		System.out.println("str1"+str1);
		System.out.println(str4);
		
		StringBuffer sb = new StringBuffer("ABC");
		sb.append("DEF");
		System.out.println(sb);
		
		// 연산자 (+) 변경가능
		String sql = "select * from board ";
		int num = 10;
		
		if(num == 10) {
			sql += "where num = 10";
		}
		System.out.println(sql);
		
		// 해당 문자열의 위치를 파악 => indexOf("문자열")
		// => 문자열의 인덱스. 없으면 -1
		System.out.println(sql.indexOf("board"));
		
		// 문자열 길이 
		System.out.println(sql.length());
		
		for(int i=0; i<sql.length();i++) {
			System.out.print(sql.charAt(i));
		}
		System.out.println("");
		// 문자열 부분 추출
		//subString(5,10) 6번째부터 10번째
		
		//board만 출력
		System.out.println(sql.substring(sql.indexOf("board"),sql.indexOf("board")+5));
		
		// substring, indexOf
		String fileName = "kosa.jpg";
		String head = fileName.substring(0,fileName.indexOf("."));
		String pattern = fileName.substring(fileName.indexOf(".")+1,fileName.length());
		
		System.out.println(head + " " + pattern);
		
		String id = "kosa";
		String m_id = "Kosa ";
		
		// trim() 앞뒤의 공백문자를 없애줌
		if(id.equalsIgnoreCase(m_id.trim())) {
			System.out.println("같다");
		}else {
			System.out.println("틀리다");
		}
		
		//문자열 ==> String[]변환
		//split()
		//Arrays.toString(arr)
		String fruits = "사과,포도,수박,배";
		String arr[] = fruits.split(",");
		System.out.println(Arrays.toString(arr));
		
		//문자열 ==> char[] 변환
		//toCharArray()
		String str5 ="abcdef";
		char arr2[] = str5.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
		//문자열 ==> byte[] 변환
		//getBytes()
		String str6 = "abcdef";
		byte arr3[] = str6.getBytes();
		System.out.println(Arrays.toString(arr3));
		
		// 문자열 <==> 정수형
		// Integer.parseInt(str7)
		String str7 = "10";
		int num2 = Integer.parseInt(str7);
		System.out.println(num2);

		int num3 = 10;
		// String이 더큰 데이터 타입으로  로 변환된다.
		String str8 = String.valueOf(num3);
		String str9 = 10 + "";
		System.out.println(str8);
		
		
	
	}
}
