package lk.ijse.hibernate.util;

import lk.ijse.hibernate.enitity.Customer;
import lk.ijse.hibernate.enitity.Item;
import lk.ijse.hibernate.enitity.Laptop;
import lk.ijse.hibernate.enitity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Factoryconfiguration {
    private  static Factoryconfiguration factoryconfiguration;
    private SessionFactory sessionFactory;



    private  Factoryconfiguration(){
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class)
                .addAnnotatedClass(Laptop.class);
         sessionFactory=configuration.buildSessionFactory();

    }

    public static Factoryconfiguration getInstance(){
        return (factoryconfiguration==null) ? factoryconfiguration=new Factoryconfiguration():factoryconfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();

    }
}
