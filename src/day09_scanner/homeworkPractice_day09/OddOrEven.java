package day09_scanner.homeworkPractice_day09;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number below: ");
        int number = input.nextInt();

        boolean oddNumber = number % 2 == 0;
        boolean evenNumber = number % 2 != 0;

        System.out.println(number + " is odd number " + oddNumber);
        System.out.println(number + " is even number " + evenNumber);
    }
}
