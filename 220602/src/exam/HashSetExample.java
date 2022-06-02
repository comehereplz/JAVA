package exam;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<Student> set = new HashSet();
		set.add(new Student(202201, "홍길동"));
		set.add(new Student(202202, "이순신"));
		set.add(new Student(202201, "조우진"));

		Iterator<Student> iterator = set.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + ", " + student.name);
		}

	}

}
