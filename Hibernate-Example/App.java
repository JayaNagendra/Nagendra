package com.hibernet.demo;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.hibernet.entity.Student;
import com.hibernet.util.HybernateUtil;

public class App 
{
    public static void main( String[] args ) {
     Session session=HybernateUtil.getSessionFactory().openSession();
    
    Student s=new Student();
    s.setSno(1);
    s.setSname("Nagendra");
    s.setCourse("SQL");
    
    Student s2=new Student();
   s2.setSno(2);
   s2.setSname("JAYA NAGENDRA");
   s2.setCourse("JAVA");
   
   Student s3 = new Student(3,"XYZ","Hibernate");
   
   List<Student> sList = Arrays.asList(new Student(4,"ABC","JAVA"), new Student (5,"NAG", "SQL"));
   
    Transaction tr=session.beginTransaction();
    
    // Change or and update the data.....
    
    s3.setSname("Nag");
    
    
    //save the object
    session.save(s);
    session.save(s2);
    session.save(s3);
    session.saveOrUpdate(s3);
    sList.forEach(ss->session.save(ss));
    
 // Delete data...
   // session.delete(s);
    
    tr.commit();
    // close the session
    session.close(); }}
   