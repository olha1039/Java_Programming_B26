package day31_arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {

        String [] arr = {" java", "Hello", "$Dollar", "4four", "Zell", "five5", "Zebra", "SIX", "6six", "six", "Hi"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
