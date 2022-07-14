package day00_Interview_practice.from_joseph;

import java.util.Arrays;

public class Q6_SortString {
    /*
    Q6
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"
     */

    public static String sortString(String str) {

        String sorted = "";

        for (int i = 0; i < str.length(); i++) {

            sorted += "" + str.charAt(i);

            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isDigit(str.charAt(i + 1))) {
                    sorted += ",";
                }
            }

            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isAlphabetic(str.charAt(i + 1))) {
                    sorted += ",";
                }
            }
        }

        String[] arr = sorted.split(",");// ----> [DC, 501, GCCCA, 098911]
        str = "";

        for (String each : arr) {
            char[] chars = each.toCharArray(); // ---> [[D, C], [5, 0, 1], [G, C, C, C, A], [0, 9, 8, 9, 11]]
            Arrays.sort(chars); // --> [[C, D], [0, 1, 5], [A, C, C, C, G], [0, 8, 9, 9, 11]]

            for (char eachChar : chars) {
                str += "" + eachChar;
            }
        }


        return str;

    }

    public static void main(String[] args) {
        System.out.println(sortString("DC501GCCCA098911"));
    }
}






