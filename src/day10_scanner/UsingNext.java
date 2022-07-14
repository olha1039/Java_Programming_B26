package day10_scanner;

import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is today?");
        String day = input.nextLine();

        System.out.println("Enter you fist name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        input.nextLine();

        System.out.println("What is you address?");
        String address = input.nextLine();

        System.out.println("Today: " + day);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Address: " + address);
}
}
