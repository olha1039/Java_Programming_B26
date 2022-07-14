package day30_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        char [] letters = {'j', 'a', 'v', 'a'};

        String word = "java";
    // converting a String to a char []
        char[] java = word.toCharArray();

        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(java));

//        System.out.println(letters);
        for (char eachChar : java){    // for(char eachChar : word.toCharArray()){
            System.out.println(eachChar);
        }

        // convert a char array to the string

        char [] day = {'m', 'o', 'n', 'd', 'a', 'y'};
        System.out.println(day.length);

        String strDay = new String(day);
        System.out.println(strDay);
    }
}
