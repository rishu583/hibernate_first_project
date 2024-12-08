package com.tut.ProjectWithMaven;

import java.io.FileInputStream;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Project started!!!!" );
         
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf= cfg.buildSessionFactory();
        Session s=sf.openSession();
        //creating student object
        Student s1= new Student();
        s1.setId(109);
        s1.setName("Durgesh Tiwari");
        s1.setCity("Lucknow");
        System.out.println(s1);
        s.save(s1);
        
        //creating address object
        
        Address a=new Address();
        a.setStreet("STREET1");
        a.setCity("DELHI");
        a.setOpen(true);
        a.setAdded_date(new Date());
        a.setX(1234.4);
        
        //reading an image
        FileInputStream fis=new FileInputStream("src/main/java/myflag.png");
        byte[] data=new byte[fis.available()];
        fis.read(data);
        a.setImage(data);
        System.out.println(a);
        s.save(a);
        
       
        
        Transaction t=s.beginTransaction();
        t.commit();
        s.close();
        sf.close();
       
    }
}
