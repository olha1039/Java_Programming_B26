package day01_my_practice;

public class PrimeNumbers {
    /*[IQ] Prime in range
    Given a number. Print out all the prime numbers from 2 to that number A prime number is a number that is only divisible by 1 and itself.
    Ex:  Input:
      50
         Output:
      2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47              */
    public static void main(String[] args) {


        for (int i = 2; i <= 50; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) { //5/2 5/3 5/4

                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(i + ", ");
            }

        }

    }
}
