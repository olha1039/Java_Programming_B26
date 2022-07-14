package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words: ");
        String wordOne = input.next().toLowerCase();
        String wordTwo = input.next().toLowerCase();
        String wordThree = input.next().toLowerCase();

        int oneLen = wordOne.length();
        int twoLen = wordTwo.length();
        int threeLen = wordThree.length();

        if (wordOne.contains("a") && oneLen > twoLen && oneLen > threeLen) {
            System.out.println(wordOne + " is the biggest with a");
        } else if (wordTwo.contains("a") && twoLen > oneLen && twoLen > threeLen) {
            System.out.println(wordTwo + " is the biggest word with a");
        } else if (wordThree.contains("a") && threeLen > oneLen && threeLen > twoLen){
            System.out.println(threeLen + " is the biggest with a");
        } else {
            System.out.println("No single largest word with a");
        }
    }
}
