package assignment.customcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Angel", 20));
		students.add(new Student("lawrence", 18));
		students.add(new Student("kevin", 22));

		System.out.println("Before sorting:");
		for (Student student : students) {
			System.out.println(student);
		}
		Collections.sort(students, new AgeComparator());

		System.out.println("\nAfter sorting based on age:");
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
