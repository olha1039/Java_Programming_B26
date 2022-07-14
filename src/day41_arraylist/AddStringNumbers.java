package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class AddStringNumbers {
    /*
    String numbers to sum
Create a method that will accept an ArrayList of numbers in String
format, add each digit of each element and store into a different
ArrayList. Return the ArrayList of summed numbers
Ex:
Input:
“123”, “34”, “513”
Output:
[ 6, 7, 9 ]
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "1111", "34", "513"));
        System.out.println(sumFromString(list));
    }
    public static ArrayList<Integer> sumFromString(ArrayList<String> list) {

        ArrayList<Integer> sums = new ArrayList<>(); // store me results first

        for (String each : list) { // goes through every element of the ArrayList from params

            int currentSum = 0; // reset the sum

            for (String eachDigit : each.split("")) { // converting the String each to the Array by splitting with an empty space, it means the each String will be separated with each character as separate String elements ["1", "2", "3"]  <--- "123"

                currentSum += Integer.parseInt(eachDigit); // converting from the string to the number

            }
            sums.add(currentSum);

        }
        return sums;
    }
}
/* I highlighted from int currentSum to Return current sum }, right clicked -> refactor -> method..

 */