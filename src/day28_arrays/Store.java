package day28_arrays;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jackets", "Gloves", "Airpods", "IPad"};

        //DO we have jackets in stock?
        boolean hasJacket = false;
        for (int i = 0; i < items.length; i++) {

            if (items[i].equalsIgnoreCase("jackets")) {
                hasJacket = true;
                break;
            }

        }
        System.out.println(hasJacket ? "Jackets in stock" : "Jackets are out of stock");

        System.out.println(Arrays.toString(items).toLowerCase().contains("jackets"));

        // use Scanner to ask which item they are looking for, and check if we have it

        Scanner input = new Scanner(System.in);
        System.out.println("Which item you are looking for");
        String lookingFor = input.nextLine();
        boolean inStock = false;

        for (int i = 0; i < items.length; i++) {

            if(items[i].equalsIgnoreCase(lookingFor)){
                inStock = true;
                break;
            }

        }
        System.out.println(lookingFor + (inStock ? " in stock" : "out of stock"));
    }
}
