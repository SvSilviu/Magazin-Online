package Magazin;

import java.util.Objects;

public class Orders {

    private int id;
    private int customer_id;
    private int ammount;
    private String shipping_adress;
    private String other_adress;
    private String order_email;
    private String order_date;
    private String order_status;

    public Orders(int id, int customer_id, int ammount, String shipping_adress,
                  String other_adress, String order_email, String order_date,
                  String order_status) {
        this.id = id;
        this.customer_id = customer_id;
        this.ammount = ammount;
        this.shipping_adress = shipping_adress;
        this.other_adress = other_adress;
        this.order_email = order_email;
        this.order_date = order_date;
        this.order_status = order_status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public String getShipping_adress() {
        return shipping_adress;
    }

    public void setShipping_adress(String shipping_adress) {
        this.shipping_adress = shipping_adress;
    }

    public String getOther_adress() {
        return other_adress;
    }

    public void setOther_adress(String other_adress) {
        this.other_adress = other_adress;
    }

    public String getOrder_email() {
        return order_email;
    }

    public void setOrder_email(String order_email) {
        this.order_email = order_email;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", customer_id=" + customer_id +
                ", ammount=" + ammount +
                ", shipping_adress='" + shipping_adress + '\'' +
                ", other_adress='" + other_adress + '\'' +
                ", order_email='" + order_email + '\'' +
                ", order_date='" + order_date + '\'' +
                ", order_status='" + order_status + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Orders)) return false;
        Orders orders = (Orders) o;
        return getId() == orders.getId() && getCustomer_id() == orders.getCustomer_id() && getAmmount() == orders.getAmmount() && Objects.equals(getShipping_adress(), orders.getShipping_adress()) && Objects.equals(getOrder_email(), orders.getOrder_email());
    }


}
