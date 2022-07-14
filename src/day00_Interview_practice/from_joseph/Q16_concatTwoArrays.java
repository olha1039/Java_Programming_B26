package day00_Interview_practice.from_joseph;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Q16_concatTwoArrays {
//    Q16:Array -- Concat two arrays
//    Write a return method that can concatenate two arrays

    public static int[] concatTwoArrays (int[] a, int[] b){

       int lengthA = a.length;
       int lengthB = b.length;

       int[] result = new int[lengthA+lengthB];
        int count = 0;
        for (int eachA : a) {
            result[count] = eachA;
            count++;
        }
        for (int eachB : b) {
            result[count] = eachB;
            count++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(concatTwoArrays(new int[]{1, 2, 3, 4}, new int[] {5,6,7,8})));
    }





}
