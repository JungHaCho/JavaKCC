package SortStackQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> list = new ArrayList<Person>();

		list.add(new Person("홍길동", 80));
		list.add(new Person("박길동", 10));
		list.add(new Person("조길동", 20));
		list.add(new Person("가길동", 30));
		list.add(new Person("나길동", 70));

		// 기본 정렬 : 
		Collections.sort(list);
		// 원래는 들어간 순서대로
		
		// new Comparator 새로운 객체를 생성해서 새로운 정렬기준을 준다.
		Collections.sort(list, new Comparator<Person>() {

//			public int compare(Person o1, Person o2) {
//				// 이름으로 오름차순
//				// String : 앞쪽 문자열.compareTo(뒷쪽 문자열)
//				// 0 (똑같다) => 앞쪽(AAA) == 뒷쪽 (AAA)
//				// -1 (바꾼다) => 앞쪽(AAA) < 뒷쪽 (ABB) , 
//				// 1 (안 바꾼다)=> 앞쪽(ABB) > 뒷쪽 (AAA)
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
			// 기본 오름차순
			// 
			// 이름으로 내림차순
			public int compare(Person o1,Person o2) {
				if(o1.getName().compareTo(o2.getName())<0) {
					return 1;
				}else if(o1.getName().compareTo(o2.getName())>0) {
					return -1;
				}
				return 0;
				
			}
		}); // 기본정렬
		System.out.println(list);

	}

}
