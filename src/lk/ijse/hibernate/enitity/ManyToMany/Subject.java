package lk.ijse.hibernate.enitity.ManyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Subject {
    @Id
   private String sid;

    public Subject(String sid, String name, List<Lectures> leclist) {
        this.sid = sid;
        this.name = name;
        this.leclist = leclist;
    }

    public Subject() {
    }

    private String name;
   @ManyToMany
   private List<Lectures> leclist=new ArrayList<>();

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Lectures> getLeclist() {
        return leclist;
    }

    public void setLeclist(List<Lectures> leclist) {
        this.leclist = leclist;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", leclist=" + leclist +
                '}';
    }
}
