package kosa.api;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("홍길동",20);
		Person p2 = new Person("홍길동",20);
		
		// new 새로운 메모리 공간을 받기 때문에  다르다.
//		if(p1 == p2) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
		// Object equals -> 주소값을비교한다.
		if(p1.equals(p2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		String str = "abc";
		
		// Object클래스의 toString이 있는데 주소값을 찍어주는 역할을 하는 것 같아요 
		System.out.println(p1);
		System.out.println(p1.toString());
		
	}

}
