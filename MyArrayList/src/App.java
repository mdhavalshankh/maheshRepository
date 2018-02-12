
public class App {

	public static void main(String[] args) {

		MyArrayList<Object> myArrayList = new MyArrayList<>();
		Student s1 = new Student(1, "Mahesh");
		Student s2 = new Student(2, "Guru");
		Student s3 = new Student(3, "Akshay");
		Student s4 = new Student(4, "Akshay");
		Student s5 = new Student(5, "Akshay");
		myArrayList.add(s1);
		myArrayList.add(s2);
		myArrayList.add(s3);
		
		System.out.println("3 elements added.");
		System.out.println(myArrayList);

		myArrayList.add(s4);
		myArrayList.add(s5);
		System.out.println("\n\n2 more elements added and hence capacity increased.");
		System.out.println(myArrayList);
		
		myArrayList.remove(s2);
		System.out.println(" \n\n2nd element removed.");
		System.out.println(myArrayList);
		
		System.out.println("\n\nGet 2nd element");
		System.out.println(myArrayList.getElement(2));
		
		myArrayList.update(2, s2);
		System.out.println("\n\n2nd element updated.");
		System.out.println(myArrayList);
	}

}
