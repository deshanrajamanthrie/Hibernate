package lk.ijse.hibernate.enitity.OnetoOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity (name="Laptop")
public class Laptop {
    @Id
    private String lid;
    private String description;
    @OneToOne
    private Student sId;


    public Laptop(String lid, String lname, Student sid) {
        this.lid = lid;
        this.description = lname;
        this.sId = sid;
    }



    public Laptop() {
    }


    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Student getSid() {
        return sId;
    }

    public void setSid(Student sid) {
        this.sId = sid;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lid='" + lid + '\'' +
                ", lname='" + description + '\'' +
                ", sId=" + sId +
                '}';
    }
}
