package day00_Interview_practice.from_joseph;

import java.util.Arrays;

public class Q12_sortArrayDown {
    /*
    Q12
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class

Ex:  int[] arr = {10,20,7, 8, 90};

                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
     */

    public static int[] sortArrayDown(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int temp = 0;

                if (arr[i] > arr[j]) {
                    temp = arr[i]; // 10
                    arr[i] = arr[j]; // 7
                    arr[j] = temp; // 10
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayDown(new int[]{10, 20, 7, 8, 90})));
    }

}

