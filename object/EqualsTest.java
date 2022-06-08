package object;

class Student {
	int studentID;
	String studentName;

	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentID + ", " + studentName;
	}

	@Override
	public boolean equals(Object obj) { // equals() 메서드 재정의
		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (this.studentID == std.studentID) // 재정의한 equals() 메서드는 학생의 학번이 같으면
				return true; // true 반환
			else
				return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentID;	// 해시 코드 값으로 학번을 반환하도록 메서드 재정의
	}
}

public class EqualsTest {

	public static void main(String[] args) {
		Student studentPark = new Student(205, "박지원");
		Student studentPark2 = studentPark;
		Student studentWon = new Student(205, "박지원");

		if (studentPark == studentPark2)
			System.out.println("studentPark와 studentPark2의 주소는 같습니다.");
		else
			System.out.println("studentPark와 studentPark2의 주소는 다릅니다.");

		if (studentPark.equals(studentPark2))
			System.out.println("studentPark와 studentPark2는 동일합니다.");
		else
			System.out.println("studentPark와 studentPark2는 동일하지 않습니다.");

		if (studentPark == studentWon)
			System.out.println("studentPark와 studentWon의 주소는 같습니다.");
		else
			System.out.println("studentPark와 studentWon의 주소는 다릅니다.");
		if (studentPark.equals(studentWon))
			System.out.println("studentPark와 studentWon은 동일합니다.");
		else
			System.out.println("studentPark와 studentWon은 동일하지 않습니다.");
		
		System.out.println("studentPark의 hashCode :" + studentPark.hashCode());
		System.out.println("studentWon의 hashCode :" + studentWon.hashCode());
		
		System.out.println("studentPark의 실제 주소값 :" + System.identityHashCode(studentPark));
		System.out.println("studentWon의 실제 주소값: " + System.identityHashCode(studentWon));
	}

}
