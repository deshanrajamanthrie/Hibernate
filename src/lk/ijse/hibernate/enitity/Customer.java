package lk.ijse.hibernate.enitity;

import lk.ijse.hibernate.embeded.Name;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name ="Customer_Detail")
public class Customer {
    @Id
    private String id;
    private Name name;
    private double salary;
    private String address;

    public Customer() {

    }

    public Customer(String id, Name name, double salary, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name=" + name +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }
}
