

/**
 * @author Mahesh
 *
 */
public class Employee {

	int id;
	String name;
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
