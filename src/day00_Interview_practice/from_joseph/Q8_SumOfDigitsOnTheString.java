package day00_Interview_practice.from_joseph;

public class Q8_SumOfDigitsOnTheString {
    /*
    Q8
         Write a method that can return the sum of the digits in a string
     */

    public static int sumOfDigits (String s){

        int sum = 0;
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){ // s.charAt(i) >= '0' && s.charAt(i) <= '9'
               number = Integer.parseInt(String.valueOf(s.charAt(i)));
                sum += number;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sumOfDigits("123"));
    }
}
