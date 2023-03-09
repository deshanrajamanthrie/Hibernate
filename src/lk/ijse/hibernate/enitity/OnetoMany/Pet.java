package lk.ijse.hibernate.enitity.OnetoMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "Pet_Name")
public class Pet {
    @Id
    private String pId;
    private String pname;

    @ManyToOne
    private Owner owner;

    public Pet() {
    }
    public Pet(String pId, String pname, Owner owner) {
        this.pId = pId;
        this.pname = pname;
        this.owner = owner;
    }


    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "pId='" + pId + '\'' +
                ", pname='" + pname + '\'' +
                ", owner=" + owner +
                '}';
    }
}
