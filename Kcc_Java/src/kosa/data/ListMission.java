package kosa.data;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListMission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		List<String> list =new LinkedList<String>();
		int idx =-1;
		
		while(true) {
			System.out.println("1.�������߰� 2.������ ���� 3. ������ ��� 4. ����");
			System.out.print("�Է� >>");
			String menu = sc.nextLine();
			switch(menu) {
			case "1":
				System.out.print("������ �Է��Ͻÿ�");
				list.add(sc.nextLine());	
				break;				
			case "2":
				System.out.print("������ ������ �Է��Ͻÿ�");
				String str1= sc.nextLine();
				idx= list.indexOf(str1);
				
				if(idx != -1) {
					list.remove(str1);		
				}else {
					System.out.println("���������ʽ��ϴ�.");
				}
				break;
			case "3":
//				for(int i=0;i<list.size();i++) {
//					System.out.print(list.get(i));	
//				}
//				System.out.println();
				Iterator<String> iterator = list.iterator();
				while(iterator.hasNext()) {
					String str = iterator.next();
					System.out.println(str);
				}
				break;
			case "4":
				System.out.println("����");
				return;	
			}
		}
	}

}