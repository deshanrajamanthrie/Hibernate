package lk.ijse.hibernate.enitity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
    private String id;
    private  String itemname;
    private int qty;
  private   double cost;

    public Item() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Item(String id, String itemname, int qty, double cost) {
        this.id = id;
        this.itemname = itemname;
        this.qty = qty;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", itemname='" + itemname + '\'' +
                ", qty=" + qty +
                ", cost=" + cost +
                '}';
    }
}
