package day00_Interview_practice.from_joseph;

import java.util.Arrays;

public class Q9_maxNumber {
    /*
    Q9
            Write a method that can find the maximum number from an int Array
     */

    public static int maxNumber (int [] arr){

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxNumber(new int[] {1, 2, 5, 6, 4, 5, 6, 54}));
    }
}
