package kosa.oop3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st = new Student();
		Work work = new Work();

		Person p1 = new Person("�л�",new Role() {
			
			@Override
			public void doing() {
				// TODO Auto-generated method stub
				System.out.println("����̺�");
			}
		});

		
//		Person p2 = new Person("�뵿��", work);
//
		p1.doit();
//		p2.doit();

	}

}