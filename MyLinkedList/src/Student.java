
public class Student {

	int studentId;
	String studentName;
	
	
	public Student(int studentId, String name) {
		super();
		this.studentId = studentId;
		this.studentName = name;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + studentName + "]";
	}
}
