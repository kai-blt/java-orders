package local.kaiblt.ordersapp.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "payments")
public class Payment {
    //***** Primary Key *****//
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long paymentid;

    private String type;

    //***** Table Relationships *****//
    @ManyToMany(mappedBy = "payments")
    private Set<Order> orders = new HashSet<>();


    //***** Constructors *****//
    public Payment() {
        //default constructor for JPA
    }

    public Payment(String type) {
        this.type = type;
    }

    //***** Getters and Setters *****/
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
