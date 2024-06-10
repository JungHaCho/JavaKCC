package kosa.StreamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example2 {
	
	public static void main(String[] args) {
		List<Integer> list2 = IntStream.rangeClosed(1,10)
				.boxed()
				.collect(Collectors.toList());
		
		list2.stream().forEach(System.out::println);
		
		IntStream.of(2,4,6,8,10).boxed().collect(Collectors.toList());
	
		String arr[] = {"BB","CC","AA"};
		List<String> list3 = Arrays.asList(arr);
		
		list3.stream().sorted().forEach(System.out::println);
	}
	
}

