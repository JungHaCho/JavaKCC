package kosa.oop3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st = new Student();
		Work work = new Work();

		Person p1 = new Person("학생",new Role() {
			
			@Override
			public void doing() {
				// TODO Auto-generated method stub
				System.out.println("드라이브");
			}
		});

		
//		Person p2 = new Person("노동자", work);
//
		p1.doit();
//		p2.doit();

	}

}
