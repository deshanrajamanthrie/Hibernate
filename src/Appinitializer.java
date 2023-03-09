import lk.ijse.hibernate.enitity.Laptop;
import lk.ijse.hibernate.enitity.Student;
import lk.ijse.hibernate.util.Factoryconfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
        l2.setSid(s2);


        Session session = Factoryconfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(s2);
        session.save(l2);

        transaction.commit();
        session.close();

    }
}
