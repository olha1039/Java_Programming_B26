package day00_Interview_practice.from_joseph;

public class Q24_armstrongNumber {

    // Write a method that can check if a number is Armstrong number
    // Armstrong number is a number that is equal to the sum of cubes of its digits. For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.

    public static void isArmstrong (int n){
        int lastDigit = 0;
        String len = "" + n;
        int totalDigits = 0;
        int digit = n;

        while (n > 0) {
            lastDigit = n % 10;    // to find last digit
            n /= 10;
            totalDigits += (int)(Math.pow(lastDigit, len.length()));

        }
        System.out.println(totalDigits == digit);
    }

    public static void main(String[] args) {
       isArmstrong(9474);
    }

    }







