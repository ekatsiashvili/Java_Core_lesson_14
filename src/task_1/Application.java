package task_1;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {

		Set<Student> setofStudents = new LinkedHashSet<>();
		setofStudents.add(new Student("Daryna", 18));
		setofStudents.add(new Student("Fill", 19));
		setofStudents.add(new Student("Jonny", 30));
		setofStudents.add(new Student("Sashko", 22));
		setofStudents.add(new Student("Rita", 27));
		setofStudents.add(new Student("Elvira", 22));
		setofStudents.add(new Student("Pheophan", 21));
		setofStudents.add(new Student("Gerry", 19));

		for (Student student : setofStudents) {
			System.out.println(student);
		}
		System.out.println();
		System.out.println("==================================");
		System.out.println();

		TreeSet<Student> sortedStudents = new TreeSet<>(new AllFieldsComparator());
		sortedStudents.addAll(setofStudents);

		for (Student student : sortedStudents) {
			System.out.println(student);
		}

	}

}
