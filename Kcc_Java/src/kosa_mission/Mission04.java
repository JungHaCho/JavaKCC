package kosa_mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
		String a = "abc";
		String b = "abc";
		
		// ������ = �ּҰ����� ��
		// equals / equalignore
		
		
		if(a.equals(b)) {
			
		}
	*/	
		
		// �������� ������ ���ڿ��� �Է� �޾� 
		// ��Ģ���� ����� ����Ͻÿ�.(����)
		// ex> 
		//���� 1
		//���� 2
		//������
		// ��� 
		
		int num1 =0;
		int num2 =0;
		String a = "";
		int result =0;
		
		Scanner sc =new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.nextLine();
		a = sc.nextLine();
		
		if( a.equals("+")) {
			result = num1 + num2;
		}else if( a.equals("-")) {
			result = num1 - num2;
		}else if( a.equals("*")) {
			result = num1 * num2;
		}else if( a.equals("/")) {
			result = num1 / num2;
		}
		
		System.out.println( "���> "+ result);
		
	}

}
