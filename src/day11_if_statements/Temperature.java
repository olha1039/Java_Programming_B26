package day11_if_statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a temperature");
        int temperature = input.nextInt();

        if (temperature >= 70) {
            System.out.println("Go outside but with your laptop to code Java");
        } else {
            System.out.println("It's too cold. Code more Java");
        }
    }
}
