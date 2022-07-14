package day09_scanner;

import java.util.Scanner;

public class CompareClasses {
    /*
    create a Scanner object
    ask the user to enter 2 numbers
    check if the numbers are equal to each other
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1");
        int numberOne = input.nextInt();
        System.out.println("Enter number 2");
        int numberTwo = input.nextInt();
        System.out.println("The numbers are equal " + (numberOne == numberTwo));
    }

}
