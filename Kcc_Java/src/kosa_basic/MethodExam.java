package kosa_basic;

import java.util.Scanner;

public class MethodExam {

	// �޼��� ����
	// ���������� static, ������void, �޼ҵ��̸�(�Ķ����(����))
	
	public static void  S(int num,char c) {
		
		
		for(int  i =0; i<num;i++) {
			
			System.out.print(c);
		}
		System.out.println("");
		
	}
	
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = add(10,20);
		
//		Scanner sc =new  Scanner(System.in);
//		
//		S(10,'#');
//		S(20,'*');
	}

}
