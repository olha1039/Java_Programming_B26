package day11_03_22_2022;

import java.util.Arrays;

public class P05_MergeArrays {
    /*
    Create a method that can print out the combination of two integer arrays
                int[] array1 = {1,2,3,4};
                int[] array2 = {5,6,7,8,9,10};

                Output:   [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     */
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8, 9, 10};
        mergeToArray(array1, array2);
    }

    public static void mergeToArray(int[] array1, int[] array2) {

        int[] arr3 = new int[array1.length + array2.length];
        int i = 0;
        for (int each : array1) {
            arr3[i++] = each; // arr3[i] = each; i++;
        }
        for (int each : array2) {

            arr3[i] = each;
            i++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
