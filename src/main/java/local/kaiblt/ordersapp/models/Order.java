package local.kaiblt.ordersapp.models;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ordernum;

    private double ordamount;
    private double advanceamaount;
    private long custcode;
    private String orderdescription;

    public Order() {
        //default constructor for JPA
    }

    public Order(double ordamount, double advanceamaount, long custcode, String orderdescription) {
        this.ordamount = ordamount;
        this.advanceamaount = advanceamaount;
        this.custcode = custcode;
        this.orderdescription = orderdescription;
    }

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
