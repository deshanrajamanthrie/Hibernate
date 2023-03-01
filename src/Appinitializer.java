import lk.ijse.hibernate.enitity.Customer;
import lk.ijse.hibernate.util.Factoryconfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Appinitializer {
    public static void main(String[] args) {
        Customer c = new Customer("C001", "Gunapala", 56000, "Panadura");

        Customer c1 = new Customer("C003", "Pasan", 20000, "Kaluthara");

        Session session = Factoryconfiguration.getInstance().getSession();          //Open in Sesstion

        Transaction transaction = session.beginTransaction();       //Open in Transaction
        session.update(c1);
        transaction.commit();
        session.close();


    }
}
