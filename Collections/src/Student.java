import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Student {

	static int option;

	//static int index = 0;
	//int number;
	int studentId;
	String name;
	ArrayList<Student> studentList = new ArrayList<Student>();
	Scanner input = new Scanner(System.in);

	@Override
	public String toString() {
		return "\n[Student Id=" + studentId + ", Student name=" + name + "]";
	}

	public static void main(String[] args) {
		Student s = new Student();

		while (true) {
			try {
				s.getOption();
			} catch (InvalidOptionException e) {//Checked Exception which is rerunning the loop from that point
				 e.printStackTrace();
			} catch (InputMismatchException e) {//UnChecked Exception which is rerunning the loop from that loop
				// e.printStackTrace();
				s.input = new Scanner(System.in);
				System.out.println("Option not valid.\n");
				//option = Integer.valueOf(option);
			}
			//option = 0;
		}
	}

	void getOption() throws InvalidOptionException {

		System.out.println("1.View students record");
		System.out.println("2.Add new student record");
		System.out.println("3.Delete student record");
		System.out.println("4.Find student record");
		System.out.println("\n Please enter your option:");
		   
		//option = Integer.valueOf(input.next());
		option = input.nextInt();

		switch (option) {
		case 1:
			viewRecords();
			break;
		case 2:
			try {
				addRecord();
				return;
			} catch (InvalidOptionException e) {
				e.printStackTrace();
			}
			break;
		case 3:
			deleteRecord();
			break;
		case 4:
			try {
				findRecord();
			} catch (Exception e) {
				findRecord();
			}
			// e.printStackTrace();
			break;

		default:
			throw new InvalidOptionException("Please enter valid option");
		}
	}

	/*
	 * if (option == 1) { viewRecords(); } else if (option == 2) { try {
	 * addRecord(); return; } catch (InvalidOptionException e) { //
	 * e.printStackTrace(); option = 0; } } else if (option == 3) {
	 * deleteRecord(); } else if (option == 4) { try { findRecord(); } catch
	 * (Exception e) { findRecord(); // e.printStackTrace(); } }
	 * 
	 * else { System.out.println("Enter valid option from 1-4"); return; throw
	 * new InvalidOptionException("Please enter valid option"); } }
	 */

	void addRecord() throws InvalidOptionException {

		option = 1;
		while (option == 1) {
			Student a = new Student();
			System.out.println("Enter student id:");
			a.studentId = input.nextInt();
			System.out.println("Enter student name:");
			a.name = input.next();
			studentList.add(a);
			System.out.println("Record added successfully");
			System.out.println("Enter 0 to go back\nEnter 1 to add new record");
			option = input.nextInt();
			if (option == 0)
				return;
			if (option != 1)
				throw new InvalidOptionException("Invalid option");
		}
	}

	void viewRecords() {

		System.out.println(studentList);
	}

	void findRecord() throws InvalidOptionException {

		int key = 0, status = 0;
		System.out.println("Enter student id whose record you want to find:");
		
		key = input.nextInt();
		/*try {
			// Scanner input = null;
			key = input.nextInt();
		} catch (InputMismatchException e) {
			throw new InvalidOptionException("Enter correct student id");
		}*/
		Iterator<Student> itr = studentList.iterator();
		while (itr.hasNext()) {
			Student a = itr.next();
			if (key == a.studentId) {
				System.out.println(a);
				status = 1;
			}
		}
		if (status == 0) {
			System.out.println("Record not found");
		}

	}

	void deleteRecord() {
		int key = 0, status = 0;

		System.out.println("Enter student id whose record you want to delete:");
		// Scanner input = null;
		key = input.nextInt();
		Iterator<Student> itr = studentList.iterator();
		while (itr.hasNext()) {
			Student a = itr.next();
			if (key == a.studentId) {
				itr.remove();
				System.out.println("Record deleted successfully.");
				status = 1;
			}
			if (status == 1)
				return;
		}
		if (status == 0)
			System.out.println("No such record exist");
	}

}
