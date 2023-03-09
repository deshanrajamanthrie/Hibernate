package lk.ijse.hibernate.enitity.OnetoMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Owner_Name")
public class Owner {
    @Id
    private String OwnerId;
    private String oname;

    @OneToMany(mappedBy = "owner")

     //Only 2 tables thava table epa
     private List<Pet> petlist = new ArrayList<>();

    public Owner() {
    }

    public Owner(String id, String oname, List<Pet> petlist) {
        this.OwnerId = id;
        this.oname = oname;
        this.petlist = petlist;
    }

    public String getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(String ownerId) {
        this.OwnerId = ownerId;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public List<Pet> getPetlist() {
        return petlist;
    }

    public void setPetlist(List<Pet> petlist) {
        this.petlist = petlist;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "OwnerId='" + OwnerId + '\'' +
                ", oname='" + oname + '\'' +
                ", petlist=" + petlist +
                '}';
    }
}
