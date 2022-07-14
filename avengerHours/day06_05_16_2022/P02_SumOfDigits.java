package day06_05_16_2022;

public class P02_SumOfDigits {
    /*
     Write a program that can return the sum of digits of an integer. Do not use any string manipulations.

                 Ex;
                 Input: 123
                 Output: 6
     */
    public static void main(String[] args) {

        int number = 12345; // 15

        System.out.println(number % 10); // always gives us the last digit
        System.out.println(number / 10); // removes the last digit since we are using integer
        System.out.println(1 / 10); // gives zero

        System.out.println();
        System.out.println(sunOfDigits(number));
    }

    public static int sunOfDigits(int number) {
        int sum = 0;
        number = Math.abs(number); // makes the number positive, gets the absolute value
        while (number > 0){
            sum += number % 10; // add the last digit
            number = number / 10; // removed the last digit
             // number /= 10
                    }
        return sum;
    }
}
