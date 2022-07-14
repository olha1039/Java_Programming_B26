package day01_my_practice;

import java.util.Scanner;

public class PrimeNumbersScanner {
    /* [IQ] Prime number [Loops]
   Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.
       Ex:  Input:
           11
           Output:
           prime
       Ex: Input:
           10
           Output:
           not prime
        */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int prime = input.nextInt(); // 6
        boolean isPrime = prime >= 2; // true

        for (int i = 2; i < prime; i++) { // 6/2 true
            if (prime % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(prime + " is prime number");
        } else {
            System.out.println(prime + " is not prime number");
        }

    }
}
