package Magazin;

public class ProductOprions {
    private int id;
    private int option_id;
    private int product_id;

    public ProductOprions(int id, int option_id, int product_id) {
        this.id = id;
        this.option_id = option_id;
        this.product_id = product_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOption_id() {
        return option_id;
    }

    public void setOption_id(int option_id) {
        this.option_id = option_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

}
