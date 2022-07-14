package day01_my_practice;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] words = str.split(", ");
        int shortest = words[0].length();
        String shortWord = "";
        for (int i = 0; i < words.length; i++) {

            if (words[i].length() < shortest) {
                shortest = words[i].length();

            }
        }
        for (int i = 0; i < words.length; i++) {
            if (shortest == words[i].length()) {
                shortWord += words[i] + " ";
            }
        }
        String[] word2 = shortWord.split(" ");
        System.out.println(Arrays.toString(word2));


    }
}
