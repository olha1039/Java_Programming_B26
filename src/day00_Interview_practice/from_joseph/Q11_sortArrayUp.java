package day00_Interview_practice.from_joseph;

import java.util.Arrays;

public class Q11_sortArrayUp {
    /*
        Q11
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
            int[] arr = {10, 9, 8, 7};
             arr = Sort(arr);         ==>{ 7, 8, 9, 10};
     */

        public static int[] sortArray (int [] arr) {

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    int temp = 0;

                    if(arr[i] < arr[j]){
                        temp = arr[i]; // 2
                        arr[i] = arr[j]; // 3
                        arr[j] = temp; // 2
                    }
                }
            }

                return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{2, 3, 1, 8, 6, 4, 9, 5})));
    }

}
