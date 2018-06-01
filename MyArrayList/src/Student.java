
public class Student {

	int id;
	String name;
	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + "]";
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
