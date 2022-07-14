package day10_scanner;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year");
        int year = input.nextInt();
        boolean isLeapYear = year % 4 == 0 || (year % 100 == 0 && year % 400 !=0);
        System.out.println("Is it a leap year? " + isLeapYear);
    }
}
