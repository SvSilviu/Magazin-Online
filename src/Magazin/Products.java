package Magazin;

import java.util.Objects;

public class Products {
    private int id;
    private String sku;
    private String name;
    private double price;
    private double weight;
    private String descriptions;
    private String category;
    private String create_date;
    private double stock;

    public Products(int id, String sku, String name, double price, double weight,
                    String descriptions, String category, String create_date,
                    double stock) {
        this.id = id;
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.descriptions = descriptions;
        this.category = category;
        this.create_date = create_date;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", sku='" + sku + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", descriptions='" + descriptions + '\'' +
                ", category='" + category + '\'' +
                ", create_date='" + create_date + '\'' +
                ", stock=" + stock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Products)) return false;
        Products products = (Products) o;
        return getId() == products.getId() && Objects.equals(getName(), products.getName()) && Objects.equals(getDescriptions(), products.getDescriptions());
    }

}
