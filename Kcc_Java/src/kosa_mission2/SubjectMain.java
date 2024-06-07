package kosa_mission2;

public class SubjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subject sub1 = new Subject("JAVA",30000);
		Subject sub2 = new Subject("JSP",20000);
		Subject sub3 = new Subject("JAVA",15000);
		
		sub1.sale(sub1.price);
		sub2.sale(sub2.price);
		sub3.sale(sub3.price);
		
		sub1.printbooks();
		sub2.printbooks();
		sub3.printbooks();
		
		
	}	

}
