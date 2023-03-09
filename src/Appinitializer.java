import lk.ijse.hibernate.enitity.ManyToMany.Lectures;
import lk.ijse.hibernate.enitity.ManyToMany.Subject;
import lk.ijse.hibernate.enitity.OnetoMany.Owner;
import lk.ijse.hibernate.enitity.OnetoMany.Pet;
import lk.ijse.hibernate.util.Factoryconfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class Appinitializer {
    public static void main(String[] args) {

     /*  Name name = new Name();
        name.setFname("Sandami");
        name.setMname("Thathsari");
        name.setLname("De silva");


        Customer c2 = new Customer("C004", name, 70000, "Nagoda");

        //Customer c3 = new Customer("C005", "Gunadasa", 80000, "Nagoda");

        Customer c4 = new Customer("C006", name, 80000, "Beruwala");

        Customer c5 = new Customer("C007", name, 80000, "Horana");

       Customer c = new Customer("C002",name,60000,"Horana");


        Session session = Factoryconfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

         session.save(c);
         transaction.commit();
         session.close();

       session.update(c4);


        Customer c3=session.get(Customer.class,"C005");
        System.out.println(c3);
        session.delete(c3);

        transaction.commit();
        session.close();
//=======================================================================
        Item i= new Item("I002","Soup",1000,50);
        Session session1 = Factoryconfiguration.getInstance().getSession();
        Transaction transaction1 = session1.beginTransaction();
        session1.save(i);
        transaction1.commit();*/
      /*  //==============Relational=====================
      //=========One two oNe
        Student s1 = new Student();
        s1.setsId("S001");
        s1.setSname("Sachini");

        //==============
        Laptop l1 = new Laptop();
        l1.setLid("L001");
        l1.setDescription("Dell");
        l1.setSid(s1);
        //=================================================================================

        Student s2 = new Student();
        s2.setsId("S002");
        s2.setSname("Malindu");

        //==============
        Laptop l2 = new Laptop();
        l2.setLid("L002");
        l2.setDescription("HP");
        l2.setSid(s2);*/

//==============One to Many
/*
        Owner o1 = new Owner();
        o1.setOwnerId("O002");
        o1.setOname("Supun");


        Pet p1 = new Pet();
        p1.setpId("P004");
        p1.setPname("fish");
        p1.setOwner(o1);

        Pet p2 = new Pet();
        p2.setpId("P005");
        p2.setPname("Parrot");
        p2.setOwner(o1);

        Pet p3 = new Pet();
        p3.setpId("P006");
        p3.setPname("Ant");
        p3.setOwner(o1);

        //1st methology
       *//* ArrayList<Pet> pets = new ArrayList<>();
        pets.add(p1);
        pets.add(p2);
        pets.add(p3);
        o1.setPetlist(pets);*//*

        //=====================
        //2nd Methology
        o1.getPetlist().add(p1);
        o1.getPetlist().add(p2);
        o1.getPetlist().add(p3);*/

        //=====================Many to Many
        Lectures l1 = new Lectures();
        l1.setLid("T001");
        l1.setLname("Niroth Sir");


        Lectures l2 = new Lectures();
        l2.setLid("T002");
        l2.setLname("Prasad Sir");

        //=================
        Subject s1 = new Subject();
        s1.setSid("S001");
        s1.setName("Prf");


        Subject s2 = new Subject();
        s2.setSid("S002");
        s2.setName("DBMS");

        //===========Added sub for lectuers
       /* ArrayList<Subject> sub1 = new ArrayList<>();// Niroth Sir
        sub1.add(s1);
        sub1.add(s2);
        l1.setSublist(sub1);

        ArrayList<Subject> sub2 = new ArrayList<>();  //Prasad Sir
        sub2.add(s1);
        sub2.add(s2);
        l2.setSublist(sub2);

        //===========Added Subject
        ArrayList<Lectures> lec1 = new ArrayList<>();
        lec1.add(l1);
        lec1.add(l2);
        s1.setLeclist(lec1);

        ArrayList<Lectures> lec2 = new ArrayList<>();
        lec2.add(l1);
        lec1.add(l2);
        s2.setLeclist(lec2);*/

        l1.getSublist().add(s1);
        l1.getSublist().add(s2);

        l2.getSublist().add(s1);
        l2.getSublist().add(s2);

        //===================================

        s1.getLeclist().add(l1);
        s1.getLeclist().add(l2);

        s2.getLeclist().add(l1);
        s2.getLeclist().add(l2);


        Session session = Factoryconfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(l1);
        session.save(l2);
        session.save(s1);
        session.save(s2);


        transaction.commit();
        session.close();

    }
}
