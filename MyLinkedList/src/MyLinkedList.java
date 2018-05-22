
public class MyLinkedList {

	MyNode head = new MyNode(null, null);
	MyNode tail = new MyNode(null, null) ;

	void add(MyNode lastNode) {
		
		if (head.data == null) {
			
			head = lastNode;
			tail = lastNode;

		} else {
			tail.next=lastNode;
			tail=lastNode;

		}
	}



	@Override
	public String toString() {
		return "MyLinkedList [" + head +"]";
	}

	

}
