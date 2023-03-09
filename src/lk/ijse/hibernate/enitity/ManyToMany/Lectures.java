package lk.ijse.hibernate.enitity.ManyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Lectures {
    @Id
   private String Lid;
   private String Lname;
   @ManyToMany(mappedBy ="leclist" )
   private
   List<Subject> sublist=new ArrayList<>();

    public Lectures(String lid, String lname, List<Subject> sublist) {
        Lid = lid;
        Lname = lname;
        this.sublist = sublist;
    }

    public Lectures() {
    }

    public String getLid() {
        return Lid;
    }

    public void setLid(String lid) {
        Lid = lid;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public List<Subject> getSublist() {
        return sublist;
    }

    public void setSublist(List<Subject> sublist) {
        this.sublist = sublist;
    }

    @Override
    public String toString() {
        return "Lectures{" +
                "Lid='" + Lid + '\'' +
                ", Lname='" + Lname + '\'' +
                ", sublist=" + sublist +
                '}';
    }
}
