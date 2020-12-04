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

    public Order(double ordamount, double advanceamaount, Customer customer, String orderdescription) {
        this.ordamount = ordamount;
        this.advanceamaount = advanceamaount;
        this.orderdescription = orderdescription;
        this.customer = customer;
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

    public String getOrderdescription() {
        return orderdescription;
    }

    public void setOrderdescription(String orderdescription) {
        this.orderdescription = orderdescription;
    }

    public Set<Payment> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
