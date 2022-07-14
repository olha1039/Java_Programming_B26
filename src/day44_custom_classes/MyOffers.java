package day44_custom_classes;

import day44_custom_classes.Offer;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer first = new Offer("Google", "Texas", 200_000, true, 15);
        System.out.println(first);

        ArrayList<Offer> allOffers = new ArrayList<>();
        allOffers.add(first);
        System.out.println("==================");
        allOffers.add(new Offer("Amazon", "New York", 180_000, true, 15));

        System.out.println(allOffers);
        System.out.println("==================");
        Offer[] moreOffers = {
                new Offer("Apple", "Chicago", 230_000, false, 10),
                new Offer("Tesla", "Texas", 250_000, false, 20),
                new Offer("Facebook", "Florida", 120_000, true, 10)
        };

        allOffers.addAll(Arrays.asList(moreOffers));
        System.out.println(allOffers);

        allOffers.addAll(Arrays.asList(
                new Offer("Discort", "Chicago", 100_000, false, 13),
                new Offer("Netflix", "Canada", 170_000, true, 12)
        )); // added Offer obj using the var args of the asList method to add multiple Offer objects at the same time

        System.out.println("=================");
        System.out.println(allOffers);

        // create ArrayList to filter the offers
        ArrayList<Offer> salaries = new ArrayList<>(allOffers);
        salaries.removeIf( each ->  each.salary < 170_000);
        System.out.println("Salaries above 170,000");
        System.out.println(salaries);

        System.out.println();

        ArrayList<Offer> fullTime = new ArrayList<>(allOffers);
        fullTime.removeIf( each -> !each.isFullTime); // each.isFullTime == false

        System.out.println("Only full time offers");
        System.out.println(fullTime);


    }
}
