package day07_unary_opperations;

public class Shopping {
    public static void main(String[] args) {

        int numberOfItems = 0;
        double price = 0.0;

        System.out.println("we pick up 1 water");
        System.out.println(" How many items in the cart: " + ++numberOfItems);
        price = price + 2.5;

        System.out.println("We pick up 2 eggs");
        System.out.println(" How many items in the cart: " + ++numberOfItems);
        System.out.println(" How many items in the cart: " + ++numberOfItems);

 //---------------------------------------------------------------------------------

        System.out.println(numberOfItems++);




    }
}
