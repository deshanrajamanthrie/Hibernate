package lk.ijse.hibernate.enitity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Student_Table")
public class Student {
    @Id
    private String sId;
    private String sname;


    public Student() {
    }



    public Student(String sId, String sname) {
        this.sId = sId;
        this.sname = sname;
    }


    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId='" + sId + '\'' +
                ", sname='" + sname + '\'' +
                '}';
    }
}
