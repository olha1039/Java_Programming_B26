package day09_scanner.homeworkPractice_day09;

import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        boolean divBy2 = number % 2 == 0;
        System.out.println(number + " is divisible by 2: " + divBy2);
        boolean divBy3 = number % 3 ==0;
        System.out.println(number + " is divisible by 3: " + divBy3);
        boolean divBy5 = number % 5 ==0;
        System.out.println(number + " is divisible by 5: " + divBy5);

    }
}
