package kosa.api;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("ȫ�浿",20);
		Person p2 = new Person("ȫ�浿",20);
		
		// new ���ο� �޸� ������ �ޱ� ������  �ٸ���.
//		if(p1 == p2) {
//			System.out.println("����");
//		}else {
//			System.out.println("�ٸ���");
//		}
		
		// Object equals -> �ּҰ������Ѵ�.
		if(p1.equals(p2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		String str = "abc";
		
		// ObjectŬ������ toString�� �ִµ� �ּҰ��� ����ִ� ������ �ϴ� �� ���ƿ� 
		System.out.println(p1);
		System.out.println(p1.toString());
		
	}

}