package day32_arrays;

import java.util.Arrays;

public class BinarySearchArray {
    public static void main(String[] args) {

        int[] nums = {4, 10, 30, 100};

        System.out.println(Arrays.binarySearch(nums, 4));
        System.out.println(Arrays.binarySearch(nums, 100));
        System.out.println(Arrays.binarySearch(nums, 200));
        System.out.println(Arrays.binarySearch(nums, 6));
    }
}
