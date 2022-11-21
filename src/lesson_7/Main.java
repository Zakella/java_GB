package lesson_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>(
                Arrays.asList(
                        new Product("Mars", 10.5),
                        new Product("Twix", 20.00)
                )
        );

        Machine machine = new Machine(list);
        String key = "Mars";
        System.out.println(machine.getProductByName(key));

        List<Product> listBottle = new ArrayList<>(
                Arrays.asList(
                        new Bottle("Coca Cola", 1.00, 0.5),
                        new Bottle("Sprite", 20.00, 1.00)
                )
        );

        Machine bottleMachine = new BottleMachine(listBottle);
        String keyBottle = "Sprite";
        System.out.println(bottleMachine.getProductByName(keyBottle));


        List<Product> hotDrinks = new ArrayList<>(
                Arrays.asList(
                        new HotDrink("Coffee", 1, 25, 0.15),
                        new HotDrink("Tea", 2, 30, 0.45)
                ));

        HotDrinksMachine hotMachine = new HotDrinksMachine(hotDrinks);
        System.out.println(hotMachine.getProduct("Coffee", 1, 25));
        System.out.println(hotMachine.getProduct("Beer", 1, 25));


    }

}
