package day23_loops;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        /*
        write a program that asks user to enter 5 numbers and returns the biggest and smallest number from those
        repeated steps:
            check is it the biggest
            check is it the smallest
         */

        Scanner input = new Scanner(System.in);

        int max = -2147483648;
        int min = 2147483647;
        int n = 0;

        while(n < 5){
            n++;

            System.out.println("Enter a number");
            int number = input.nextInt();

            if(number > max){
                max = number;
            }
            if(number < min){
                min = number;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
