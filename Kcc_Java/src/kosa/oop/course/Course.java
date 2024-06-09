package kosa.oop.course;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String name;
	private List<Student> students;

	public Course() {
	}

	public Course(String name) {
		this.name = name;
		students = new ArrayList();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printCourse() {
		System.out.println("�����: " + name);
		for (Student student : students) {
			System.out.println("�л��̸�: " + student.getName());
		}
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void removeStudent(Student student) {
		students.remove(student);
	}

}
