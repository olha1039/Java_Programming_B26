package day33_methods;

import java.util.Scanner;

public class Greetings {

    public static void hello(String name){
        System.out.println("Hello " + name + ", how are you?");

    }

    public static void main(String[] args) {

        hello("James");
        hello("Jamie");
        System.out.println("--------------");

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        hello(name);
        // hello(input.nextLine());
    }
}
