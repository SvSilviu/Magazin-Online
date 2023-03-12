package Magazin;

import java.util.Objects;

public class Customers {
    private int id;
    private String email;
    private String password;
    private String full_name;
    private String billing_adress;
    private String default_shipping_adress;
    private String country;
    private String phone;

    public Customers(int id, String email, String password, String full_name,
                     String billing_adress, String default_shipping_adress,
                     String country, String phone) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.full_name = full_name;
        this.billing_adress = billing_adress;
        this.default_shipping_adress = default_shipping_adress;
        this.country = country;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getBilling_adress() {
        return billing_adress;
    }

    public void setBilling_adress(String billing_adress) {
        this.billing_adress = billing_adress;
    }

    public String getDefault_shipping_adress() {
        return default_shipping_adress;
    }

    public void setDefault_shipping_adress(String default_shipping_adress) {
        this.default_shipping_adress = default_shipping_adress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", full_name='" + full_name + '\'' +
                ", billing_adress='" + billing_adress + '\'' +
                ", default_shipping_adress='" + default_shipping_adress + '\'' +
                ", country='" + country + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customers)) return false;
        Customers customers = (Customers) o;
        return getId() == customers.getId() && Objects.equals(getEmail(), customers.getEmail()) && Objects.equals(getPassword(), customers.getPassword()) && Objects.equals(getFull_name(), customers.getFull_name()) && Objects.equals(getBilling_adress(), customers.getBilling_adress());
    }

}
