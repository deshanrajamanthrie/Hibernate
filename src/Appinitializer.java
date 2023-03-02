import lk.ijse.hibernate.enitity.Customer;
import lk.ijse.hibernate.util.Factoryconfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Appinitializer {
    public static void main(String[] args) {

        Customer c2 = new Customer("C004", "Malan", 70000, "Nagoda");

        //Customer c3 = new Customer("C005", "Gunadasa", 80000, "Nagoda");

        Customer c4 = new Customer("C006", "Pala", 80000, "Beruwala");

        Customer c5 = new Customer("C007", "Janaki", 80000, "Horana");

        Session session = Factoryconfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        // session.save(c4);

        session.update(c4);


        Customer c3=session.get(Customer.class,"C005");
        System.out.println(c3);
        session.delete(c3);

        transaction.commit();
        session.close();


    }
}
