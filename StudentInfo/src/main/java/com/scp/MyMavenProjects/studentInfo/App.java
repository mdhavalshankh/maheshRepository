package com.scp.MyMavenProjects.studentInfo;

public class App {
    public static void main( String[] args ) throws MyException
    {
    	StudentImpl si = new StudentImpl();
       
    	/*StudentBean s = new StudentBean(1, "Guru", "Chikhali");
        System.out.println(si.getStudent(1));
        System.out.println(si.addStudent(s));*/
        
        System.out.println(si.searchStudentsWithCriteria(new StudentBean(5, "Akshay", "Pune"), App.SearchParam.STUDENT_ADDRESS));
    }
    
    enum SearchParam{
    	STUDENT_ID,
    	STUDENT_NAME,
    	STUDENT_ADDRESS;
    }
}
