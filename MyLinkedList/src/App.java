
public class App {

	public static void main(String[] args) {

		MyLinkedList myList = new MyLinkedList();
		Student s1 = new Student(1, "Mahesh");
		Student s2 = new Student(2, "Guru");
		Student s3 = new Student(3, "Akshay");

		myList.add(new MyNode(s1, null));
		myList.add(new MyNode(s2, null));
		myList.add(new MyNode(s3, null));

		System.out.println(myList);
	}

}
