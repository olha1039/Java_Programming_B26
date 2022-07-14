package day33_methods;

import java.util.Scanner;

public class Age {
    /*
        make a method that calculates and prints the age
        takes the birth year as an input
     */
    public static void getAge(int birthYear){
        System.out.println("What is your age? " + (2022 - birthYear));
    }

    public static void main(String[] args) {
        getAge(1995);
        int year = 1990;
        getAge(year);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birth year");
        getAge(input.nextInt());
    }




}
