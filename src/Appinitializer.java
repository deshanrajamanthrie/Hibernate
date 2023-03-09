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

        Owner o1 = new Owner();
        o1.setOwnerId("O001");
        o1.setOname("Jagath");


        Pet p1 = new Pet();
        p1.setpId("P001");
        p1.setPname("Cat");
        p1.setOwner(o1);

        Pet p2 = new Pet();
        p2.setpId("P002");
        p2.setPname("Dog");
        p2.setOwner(o1);

        Pet p3 = new Pet();
        p3.setpId("P003");
        p3.setPname("Dog");
        p3.setOwner(o1);

        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(p1);
        pets.add(p2);
        pets.add(p3);
        o1.setPetlist(pets);



        Session session = Factoryconfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(p1);
        session.save(p2);
        session.save(p3);
        session.save(o1);


        transaction.commit();
        session.close();

    }
}
