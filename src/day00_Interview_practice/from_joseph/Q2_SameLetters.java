package day00_Interview_practice.from_joseph;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q2_SameLetters {
    /*
    Q2
Write a return method that check if a string is build out of the same letters as another string.

Ex:  same("abc",  "cab"); -> true

same("abc",  "abb"); -> false
     */

    public static boolean sameLetters (String a, String b){

        char [] A = a.toCharArray();
        char [] B = b.toCharArray();
        Arrays.sort(A);
        Arrays.sort(B);

        return Arrays.equals(A, B);
    }



    public static void main(String[] args) {
        System.out.println(sameLetters("abc", "bca"));
    }
}
