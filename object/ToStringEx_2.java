package object;

class MyStudent{
	String studentName;
	int studentNum;
	
	MyStudent(String studentName, int studentNum) {
		this.studentName = studentName;
		this.studentNum = studentNum;
	}
	
	@Override
	public String toString() {
		return studentName + ", " + studentNum;
	}
}
public class ToStringEx_2 {

	public static void main(String[] args) {
		MyStudent OSY = new MyStudent("오세연", 2121055);
		
		System.out.println(OSY.toString());
	}

}
