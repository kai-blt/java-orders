package local.kaiblt.ordersapp.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {
    //***** Primary Key *****//
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ordernum;

    private double ordamount;
    private double advanceamaount;
    private long custcode;
    private String orderdescription;

    //***** Table Relationships *****//

    //Many to one relationship with the Customer Table
    @ManyToOne
    @JoinColumn(name = "custcode", nullable = false)
    private Customer customer;

    //Many to many rel with Payments Table
    @ManyToMany
    @JoinTable(name = "orderspayments",
        joinColumns = @JoinColumn(name = "ordernum"),
        inverseJoinColumns = @JoinColumn(name = "custcode"))
    private Set<Payment> payments = new HashSet<>();


    //***** Constructors *****//
    public Order() {
        //default constructor for JPA
    }

    public Order(double ordamount, double advanceamaount, long custcode, String orderdescription) {
        this.ordamount = ordamount;
        this.advanceamaount = advanceamaount;
        this.custcode = custcode;
        this.orderdescription = orderdescription;
    }

    //***** Getters and Setters *****//
    public long getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(long ordernum) {
        this.ordernum = ordernum;
    }

    public double getOrdamount() {
        return ordamount;
    }

    public void setOrdamount(double ordamount) {
        this.ordamount = ordamount;
    }

    public double getAdvanceamaount() {
        return advanceamaount;
    }

    public void setAdvanceamaount(double advanceamaount) {
        this.advanceamaount = advanceamaount;
    }

    public long getCustcode() {
        return custcode;
    }

    public void setCustcode(long custcode) {
        this.custcode = custcode;
    }

    public String getOrderdescription() {
        return orderdescription;
    }

    public void setOrderdescription(String orderdescription) {
        this.orderdescription = orderdescription;
    }
}
