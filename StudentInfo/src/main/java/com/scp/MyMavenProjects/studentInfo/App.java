package com.scp.MyMavenProjects.studentInfo;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class App {
    public static void main( String[] args )
    {
    	StudentImpl si = new StudentImpl();
        //si.addStudent(s);
        /*System.out.println(si.getStudent(1));
        System.out.println(si.updateStudent(s));
        System.out.println(si.searchStudentsWithCriteria(s, s.getStudName()));*/
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        System.out.println(si.searchStudentsWithCriteria("Akshay"));
    }
}
