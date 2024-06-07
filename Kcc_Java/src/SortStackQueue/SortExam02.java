package SortStackQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> list = new ArrayList<Person>();

		list.add(new Person("ȫ�浿", 80));
		list.add(new Person("�ڱ浿", 10));
		list.add(new Person("���浿", 20));
		list.add(new Person("���浿", 30));
		list.add(new Person("���浿", 70));

		// �⺻ ���� : 
		Collections.sort(list);
		// ������ �� �������
		
		// new Comparator ���ο� ��ü�� �����ؼ� ���ο� ���ı����� �ش�.
		Collections.sort(list, new Comparator<Person>() {

//			public int compare(Person o1, Person o2) {
//				// �̸����� ��������
//				// String : ���� ���ڿ�.compareTo(���� ���ڿ�)
//				// 0 (�Ȱ���) => ����(AAA) == ���� (AAA)
//				// -1 (�ٲ۴�) => ����(AAA) < ���� (ABB) , 
//				// 1 (�� �ٲ۴�)=> ����(ABB) > ���� (AAA)
//
//				if (o1.getName().compareTo(o2.getName()) > 0) {
//					return 1;
//				} else if (o1.getName().compareTo(o2.getName()) < 0) {
//					return -1;
//				}
//				return 0;
//			}
//			
//			
			// �⺻ ��������
			// 
			// �̸����� ��������
			public int compare(Person o1,Person o2) {
				if(o1.getName().compareTo(o2.getName())<0) {
					return 1;
				}else if(o1.getName().compareTo(o2.getName())>0) {
					return -1;
				}
				return 0;
				
			}
		}); // �⺻����
		System.out.println(list);

	}

}
