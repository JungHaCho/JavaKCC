package kosa.video;

public class Main {

	
	public static void main(String[] args) {
		
			Comment cm1 = new Comment("w1","c1");
			Comment cm2 = new Comment("w2","c2");
			
			
			Board b1 = new Board("t1","c1");
			Board b2 = new Board("t2","c2");
			
			
			

			b1.addComment(cm1);
			b1.addComment(cm2);
			
			b2.addComment(cm1);
			b2.addComment(cm2);
			
			
			cm1.PrintComment();
			
	}
	

	
	

	
}
