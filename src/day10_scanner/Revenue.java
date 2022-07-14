package day10_scanner;
import java.util.Scanner;
public class Revenue {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //make a scanner variable

        //popular names for Scanner: scan, input, scanner, keyboard

        System.out.println("Enter the price of the item");
        double price = scan.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = scan.nextInt();

        double revenue = price * quantity;
        System.out.println("The revenue is : $" + revenue);

        // System.out.println("The revenue is: $" + (price * quantity));
//         System.out.println ("The revenue is: $" + (scan.nextDouble() * scan.nextInt()));







    }
}
