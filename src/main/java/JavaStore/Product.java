package JavaStore;

import java.util.UUID;

public class Product extends  Object {
    UUID id;
    private String product_name;
    String display_name;
    private Double price;
    private Double sale_percent;
    public Boolean on_sale;

    public Product(String product_name, String display_name, Double price, Double sale_percent, Boolean on_sale) {
        this.id = UUID.randomUUID();
        this.setProduct_name(product_name);
        this.display_name = display_name;
        this.setPrice(price);
        this.setSale_percent(sale_percent);
        this.on_sale = on_sale;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name.toLowerCase().replace(" ", "");
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if(price > 0) this.price = price;
        else this.price = 0D;
    }

    public Double getSale_percent() {
        return sale_percent;
    }

    public void setSale_percent(Double sale_percent) {
        this.sale_percent = sale_percent;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_name='" + product_name + '\'' +
                ", display_name='" + display_name + '\'' +
                ", price=" + price +
                ", sale_percent=" + sale_percent +
                '}';
    }
}
