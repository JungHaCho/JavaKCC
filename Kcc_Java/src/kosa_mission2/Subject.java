package kosa_mission2;

public class Subject {

	String name;
	int price;
	int total, r1;
	
	public Subject() {}
	
	public Subject(String name, int price) {

			this.name =name;
			this.price = price;
	}
	
	public double sale(int sum) {
		
		double result=0;	

		if(sum >= 30000) {
			result = sum * 0.75 ;
			total +=result;
		}else if(sum >= 20000){
			result = sum * 0.8 ;
			total +=result;
		}else {
			result = sum * 0.85 ;
			total +=result;
		}
		
		return (int)result;
	}
	
	
	
	public void printbooks(){
		
		
		System.out.println(name+" "+price);
		
		System.out.println(total);
	}

}
