package lesson_7;

import java.util.List;

public class HotDrinksMachine extends Machine {


    public HotDrinksMachine(List<Product> products) {
        super(products);
    }


    public HotDrink getProduct(String name, Integer volume, Integer temperature) {

        for (Product item : this.list) {
            if (item instanceof HotDrink product) {
                if ( name.equals(product.getName())
                && temperature.equals(((HotDrink) item).getTemperature())
                && volume.equals(product.getVolume())) {
                    return product;
                }
            }

        }

        throw new IllegalStateException("Product not found");
    }
}

