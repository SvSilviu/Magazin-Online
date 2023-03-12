package Magazin;

import java.util.Objects;

public class OrderDetails {
    private int id;
    private int order_id;
    private int product_id;
    private double price;
    private int quantity;

    public OrderDetails(int id, int order_id, int product_id, double price, int quantity) {
        this.id = id;
        this.order_id = order_id;
        this.product_id = product_id;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "id=" + id +
                ", order_id=" + order_id +
                ", product_id=" + product_id +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderDetails)) return false;
        OrderDetails that = (OrderDetails) o;
        return getId() == that.getId() && getOrder_id() == that.getOrder_id() &&
                getProduct_id() == that.getProduct_id() && Double.compare(that.getPrice(), getPrice()) == 0 && getQuantity() == that.getQuantity();
    }

}
