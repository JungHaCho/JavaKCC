package kosa_basic;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//1.�迭����, �����и�
		int arr[];
		arr = new int[5]; //�迭 ����(�޸� �Ҵ�)
		
		//2.�迭 ����, ���� �Բ�
		int arr2[] = new int[5];
		arr2[0] = 10;
		arr2[1] = 20;
		
		//3.�迭����, ����, �ʱ�ȭ �Բ�
		int arr3[] = {1,2,3,4,5};
		
		//4. �迭�� �ִ� ���� ��ü ��� for (0~4)
		// index���� �˾ƾ��Ҷ� ���
		// ���ϴ� ���� ������ �Ѵ�.
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]="+arr3[i]);
		}
		
		//���� for�� for(����ϴ� �� : �迭)
		// �����͸� �̴´ٸ� ���� for���� ����Ѵ�.
		// ��� �����͸� �� �̰� ������ ����
		 
		for(int n : arr3) {
			System.out.print(n +",");
		}
		*/
		
		//�迭 �����
		//1. �迭�� ���� ������Ÿ���� �����Ѵ�.
		//2. �迭�� ũ�⸦ �����Ѵ�. => ArrayIndexOfBoundsException ���ܹ߻� (�迭��ũ�⸦ �ѱ�)
		//3. �迭 ���� ��� ���� => 1,2,3
		//4. �迭�� ��� �ʱ�ȭ => ���� �ε��� ����, for��, �������ʱ�ȭ
		//5. �迭�� ������ ��� ��� => for��, ���� for��, ���� �ε���
		
		//����> Ű����� �� ���ڿ��� �Է� �޾� �迭�� �߰�����  ��ü�� �������
		// q�� �Է��Ҷ����� �Է� �޴´�.
		// �Է� : ȫ�浿
		// �Է� : �ڱ⵿
		// �Է� : q
		//>��� : ȫ�浿, �ڱ⵿
		
		
		/*
		String name[] = new String[5];
		Scanner sc = new Scanner(System.in);
		int i =0;
		
		while(true) {
			System.out.println("�Է� >>>> ");
			String key = sc.nextLine();

			if(key.equals("q")) break;
			name[i++] = key;
			
			for(int j=0; j<i;j++) {
				System.out.print(name[j]+",");
			}
		}
		*/
		
		
	}

}
