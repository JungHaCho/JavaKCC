package test_p1;

public class MainStudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sub_name = "hi";
		String sub_teacher ="hi2";
		int sub_time=10;
		
		Subject sub = new Subject(sub_name,sub_teacher,sub_time);
		
		System.out.println(sub.sub_name);
		System.out.println(sub.sub_teacher);
		System.out.println(sub.sub_time);
	}

}
