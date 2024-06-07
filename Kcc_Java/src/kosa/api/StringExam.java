package kosa.api;

import java.util.Arrays;

public class StringExam {

	public static void main(String[] args) {
		
		// 1. String ��ü ���� ����� ������
		String str1 = "ABC";
		String str2 = "ABC";// ������ ���ڿ� ABC�� �ּҰ��� �����Ѵ�
		String str3 = new String("ABC"); // ������ new�ϸ� ���ο� �޸𸮸� �����.
		
		if(str1 == str2) {
			System.out.println("���");
		}else {
			System.out.println("�ٸ���");
		}
		
		//2. String Ŭ���� �Һ����� Ư¡
		// string Ŭ���� ���� � �޼���� �ڱ��ڽ��� ������ �� ����.
		// string Ŭ�������� �޼���� return������ �����Ѵ�.
		// StringBuffer,StringBuilder (������) ���� 
		str1.concat("DEF");
		String str4 = str1.concat(str1);
		System.out.println("str1"+str1);
		System.out.println(str4);
		
		StringBuffer sb = new StringBuffer("ABC");
		sb.append("DEF");
		System.out.println(sb);
		
		// ������ (+) ���氡��
		String sql = "select * from board ";
		int num = 10;
		
		if(num == 10) {
			sql += "where num = 10";
		}
		System.out.println(sql);
		
		// �ش� ���ڿ��� ��ġ�� �ľ� => indexOf("���ڿ�")
		// => ���ڿ��� �ε���. ������ -1
		System.out.println(sql.indexOf("board"));
		
		// ���ڿ� ���� 
		System.out.println(sql.length());
		
		for(int i=0; i<sql.length();i++) {
			System.out.print(sql.charAt(i));
		}
		System.out.println("");
		// ���ڿ� �κ� ����
		//subString(5,10) 6��°���� 10��°
		
		//board�� ���
		System.out.println(sql.substring(sql.indexOf("board"),sql.indexOf("board")+5));
		
		// substring, indexOf
		String fileName = "kosa.jpg";
		String head = fileName.substring(0,fileName.indexOf("."));
		String pattern = fileName.substring(fileName.indexOf(".")+1,fileName.length());
		
		System.out.println(head + " " + pattern);
		
		String id = "kosa";
		String m_id = "Kosa ";
		
		// trim() �յ��� ���鹮�ڸ� ������
		if(id.equalsIgnoreCase(m_id.trim())) {
			System.out.println("����");
		}else {
			System.out.println("Ʋ����");
		}
		
		//���ڿ� ==> String[]��ȯ
		//split()
		//Arrays.toString(arr)
		String fruits = "���,����,����,��";
		String arr[] = fruits.split(",");
		System.out.println(Arrays.toString(arr));
		
		//���ڿ� ==> char[] ��ȯ
		//toCharArray()
		String str5 ="abcdef";
		char arr2[] = str5.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
		//���ڿ� ==> byte[] ��ȯ
		//getBytes()
		String str6 = "abcdef";
		byte arr3[] = str6.getBytes();
		System.out.println(Arrays.toString(arr3));
		
		// ���ڿ� <==> ������
		// Integer.parseInt(str7)
		String str7 = "10";
		int num2 = Integer.parseInt(str7);
		System.out.println(num2);

		int num3 = 10;
		// String�� ��ū ������ Ÿ������  �� ��ȯ�ȴ�.
		String str8 = String.valueOf(num3);
		String str9 = 10 + "";
		System.out.println(str8);
		
		
	
	}
}