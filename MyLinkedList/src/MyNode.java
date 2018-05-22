
/**
 * @author Mahesh
 *
 */
public class MyNode {

	Object data;
	MyNode next;
	
	public MyNode(Object data, MyNode next) {
		super();
		this.data = data;
		this.next = next;
	}

	@Override
	public String toString() {
		return "\nMyNode [data=" + data + ", next=" + next + "]";
	}
	
	
}
