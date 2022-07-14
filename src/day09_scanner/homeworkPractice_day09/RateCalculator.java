package day09_scanner.homeworkPractice_day09;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your salary?");
        double salary = input.nextDouble();
        System.out.println("How many hours did you work in a week?");
        int hoursInWeek = input.nextInt();
        double hourlyRate = salary / (hoursInWeek * 52);
        System.out.println("With the salary of " + salary + " and working for " + hoursInWeek + " hours, your hourly rate is: " + hourlyRate);

    }
}
