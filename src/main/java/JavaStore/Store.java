package JavaStore;

import java.util.ArrayList;
import java.util.UUID;
import java.util.stream.Collectors;

public class Store {
    ArrayList<Product> listOfProducts;
    public Store(){
        this.listOfProducts = new ArrayList<>();
    }
    public void add(Product p){
        this.listOfProducts.add(p);
    }
    public void remove(UUID product_id ){
        this.listOfProducts = new ArrayList<>(this.listOfProducts.stream().filter( p -> {
            return p.id != product_id;
        }).collect(Collectors.toList()));
    }

    @Override
    public String toString() {
        String out = "";
        for (Product p: this.listOfProducts) {
            out += p.toString() + "\n";
        }
        return  out;
    }
}
