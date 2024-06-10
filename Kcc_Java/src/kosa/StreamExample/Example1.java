package kosa.StreamExample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student("ȫ�浿",10),
				new Student("���浿",20),
				new Student("���浿",30)
		);
		Stream<Student> stream = list.stream();
		
		list.stream().map(Student::getName).forEach(name->System.out.println(name));
		double avg = list.stream().mapToInt(student->student.getScore()).average().getAsDouble();
		System.out.println("���"+avg);
		
		list.stream().filter(s->s.getName().startsWith("ȫ")).forEach(name->System.out.println(name.getName()));
		
	}
	
	
}
