package day09_03_15_22;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        /*
            what is array?
            array is a data structure, can hold multiple values
            ordered data structure( has index numbers)
            Size is fixed (disadvantage)

            Default Values
            String -> null
            int    -> 0
            double -> 0.0
            boolean-> false
         */

        String[] colors = {"Yellow", "Blue", "Pink" };

        //colors[3] = "Purple";  --> we cant add element after init

        // 2

        int[] numbers = new int[3];
        System.out.println(Arrays.toString(numbers));
        numbers[0] = 1;
        numbers[1] = 1;
        numbers[2] = 1;

        // how can we retrieve data from array
        System.out.println(colors[0]); // Yellow

        // how can we reassign data from array
        colors[0] = "Red";
        System.out.println(colors[0]); //Red

        /*
        ARRAYS UTILITY

        Arrays class is presented "java.util"
        -to String
         */
        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(colors).replace("]", "").replace("[", "").toLowerCase().trim());

        //length

        System.out.println(colors.length);

        // What is the difference between length() VS length?

            // length --> This is for arrays. This is property
            // length() -> This is for Strings. This is method

        // get me last element of colors
        System.out.println(colors[colors.length - 1]);


        //Sting Methods

        //toCharArray

        String name = "Cydeo";

        char[] chars = name.toCharArray();
        // ALT + ENTER ----> Introduce local variable
        System.out.println(Arrays.toString(chars));
        //(chars[0] + "")   to use String methods
        // split

        String[] split = name.split("");
        System.out.println(Arrays.toString(split));
        // split[0], you can use String method without any concat

        String a = "a b c a b c a b c";
        String[] abc = a.split(" ");
        System.out.println(Arrays.toString(abc));

        // Hint for interview task
        /*
            Real Interview Task-->  Longest Repetitive Substring


    Write a program if some substring K that can be repeated N>1 times to produce the input string exactly as it appears.
    Your program should return longest substring K, and
    if there is none it should be return "There is no repetitive substring"

         */

        a = "abcabcabc";
        String[] abcs = a.split("abc");
        System.out.println(Arrays.toString(abcs));
        System.out.println(abcs.length);

    }
}
