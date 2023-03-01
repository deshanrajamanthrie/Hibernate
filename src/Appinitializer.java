import lk.ijse.hibernate.enitity.Customer;
import lk.ijse.hibernate.util.Factoryconfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Appinitializer {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.setId("C001");
        c.setName("Kamal");
        c.setSalary(30000);
        c.setAddress("Panadura");

        Session session = Factoryconfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(c);
        transaction.commit();
        session.close();

    }
}
