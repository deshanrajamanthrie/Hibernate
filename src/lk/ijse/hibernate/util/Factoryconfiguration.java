package lk.ijse.hibernate.util;

import lk.ijse.hibernate.enitity.ManyToMany.Lectures;
import lk.ijse.hibernate.enitity.ManyToMany.Subject;
import lk.ijse.hibernate.enitity.OnetoMany.Owner;
import lk.ijse.hibernate.enitity.OnetoMany.Pet;
import lk.ijse.hibernate.enitity.OnetoOne.Laptop;
import lk.ijse.hibernate.enitity.OnetoOne.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Factoryconfiguration {
    private static Factoryconfiguration factoryconfiguration;
    private SessionFactory sessionFactory;


    private Factoryconfiguration() {
        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(Owner.class).addAnnotatedClass(Pet.class).addAnnotatedClass(Subject.class).addAnnotatedClass(Lectures.class);
        sessionFactory = configuration.buildSessionFactory();

    }

    public static Factoryconfiguration getInstance() {
        return (factoryconfiguration == null) ? factoryconfiguration = new Factoryconfiguration() : factoryconfiguration;
    }

    public Session getSession() {
        return sessionFactory.openSession();

    }
}
