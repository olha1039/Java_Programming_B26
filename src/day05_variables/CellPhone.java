package day05_variables;

public class CellPhone {
    public static void main(String[] args) {

        String brand = "Apple";
        String model = "IPhone 10";
        String color = "Rose Gold";
        double price = 1000.99;
        int storage = 128;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("I have an " + brand);
        System.out.println("I have an " + model + " from " + brand);
        System.out.println("color = " + color);
        System.out.println("price = " + price);
        System.out.println("storage = " + storage + " GB");
        System.out.println("hasCamera = " + hasCamera);
        System.out.println("sim = " + sim);
        System.out.println("_____________________________\n");
        System.out.println("It came in the color " + color + " and it has " + storage + " GB storage");
        System.out.println("For the sim type " + sim + " with a camera " + hasCamera + " the total price was $ " + price);

        // approach 2 with String variable;

        String fullMessage = "\nI have an " + model + " from " + brand + "\nIt came in the color " + color + " and it has " + storage + " GB storage" + "\nFor the sim type " + sim + " with a camera " + hasCamera + " the total price was $ " + price;
        System.out.println(fullMessage);



    }
}
