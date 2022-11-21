package lesson_7;

import java.util.ArrayList;
import java.util.List;

public class Machine {
    final List<Product> list;

    public Machine(List<Product> list) {
        this.list = list;
    }

    public Product getProductByName (String name) {
        for (Product item:this.list) {
            if (name.equals(item.getName())){
               return item;
            }

        }
        throw new IllegalStateException("Product not found");
    }


}
