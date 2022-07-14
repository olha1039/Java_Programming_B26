package day09_scanner.homeworkPractice_day09;

import java.util.Scanner;

public class AgeNumberBook {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter you age: ");
        byte age = input.nextByte();
        System.out.println("Enter your favorite number: ");
        long number = input.nextLong();
        System.out.println("Enter you favorite book: ");
        String book = input.next();

    }
}
