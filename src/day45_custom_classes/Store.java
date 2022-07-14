package day45_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Store {
    /*Create a separate class to create and test the Food objects
        try making an array of Food objects
        find all the Food objects that start with 'a'
        find all the Food objects that have a total price over 20
  */

    public static void main(String[] args) {

        Food apples = new Food("Apples"); // see below for more
        System.out.println(apples);

        Food chips = new Food("Lays", 2);
        System.out.println(chips);

        Food chicken = new Food("Chicken", 3, 5.99);
        System.out.println(chicken);

        chips.unitPrice = 1.99;
        chips.calculatePrice();

        apples.quantity = 10;
        apples.unitPrice = 1.99;
        apples.calculatePrice();
        System.out.println(apples);
        System.out.println(apples.totalPrice);

        String[] strs = {"one", "two", "three"};

        System.out.println("===================");
        Food[] allFood = {apples, chips, chicken, null};
        System.out.println(allFood[2]);

        allFood[3] = new Food("Fish", 4, 3.55);

        System.out.println(Arrays.toString(allFood));


        // calculate the total price of shopping list
        System.out.println();
        double totalPriceAll = 0;

        for (Food each : allFood) { //each == allFood[i]
            System.out.println(each); // to see each price
           totalPriceAll += each.totalPrice;
        }
        System.out.println(totalPriceAll);
    }

}
