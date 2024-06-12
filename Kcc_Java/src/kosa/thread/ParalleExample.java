package kosa.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ParalleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		
		List<Integer> scores = new ArrayList<Integer>();
		for(int i=0;i<100000;i++) {
			scores.add(random.nextInt(101));
		}
		
		double avg =0.0;
		long startTime = 0;
		long endTime = 0;
		long time = 0;
		
		Stream<Integer> stream = scores.stream();
		startTime = System.nanoTime();
		avg = stream.mapToInt(i->i.intValue()).average().getAsDouble();
		endTime = System.nanoTime();
		time = endTime -startTime;
		System.out.println("avg : "+ avg +"time"+time);
	
		Stream<Integer> pall = scores.parallelStream();
		startTime = System.nanoTime();
		avg = pall.mapToInt(i->i.intValue()).average().getAsDouble();
		endTime = System.nanoTime();
		
		time = endTime - startTime;
		System.out.println("avg : "+ avg +" time"+time);
	}

}
