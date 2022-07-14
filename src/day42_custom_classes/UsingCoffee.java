package day42_custom_classes;

public class UsingCoffee {
    public static void main(String[] args) {

        Coffee coffee1 = new Coffee();
        coffee1.price = 4.99;
        coffee1.size = 16;
        coffee1.brand = "Starbucks";
        coffee1.type = "Latte";

        System.out.println(coffee1);
        System.out.println("----------------");
        coffee1.drink(); // each drink takes 1.5 oz
        coffee1.drink();
        coffee1.drink();

        coffee1.refill(8);
        System.out.println(coffee1);


    }
}
