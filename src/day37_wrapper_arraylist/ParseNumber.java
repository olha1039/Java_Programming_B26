package day37_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumber {

    public static void main(String[] args) {

        String year = "2022";

        // normal concatenation
        System.out.println("This year " + year);
        System.out.println("Next yer will be " + (year + 1));

        int numYear = Integer.parseInt(year); // converting to the primitive

        System.out.println("This year " + numYear);
        System.out.println("Next yer will be: " + (numYear + 1));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message: I am x years old");
        String str = input.nextLine(); // I am x years old
        // in 5 years you will be $ageIn5Years

        String agePart = str.split(" ")[2]; // split this to ArrayList and get age index 2
        int age = Integer.parseInt(agePart); // convert from arraylist to primitive
        System.out.println("In 5 years you will be " + (age + 5));

    }
}
