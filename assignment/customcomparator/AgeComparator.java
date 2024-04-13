package assignment.customcomparator;

import java.util.Comparator;

class AgeComparator implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		return Integer.compare(s1.getAge(), s2.getAge());
	}
}
