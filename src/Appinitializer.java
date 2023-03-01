import lk.ijse.hibernate.enitity.Customer;

public class Appinitializer {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.setId("C001");
        c.setName("Kamal");
        c.setSalary(30000);
        c.setAddress("Panadura");


        session.save(c);

    }
}
