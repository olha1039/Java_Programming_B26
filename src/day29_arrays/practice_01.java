package day29_arrays;

import java.util.Arrays;

public class practice_01 {
    public static void main(String[] args) {
        int [] nums = new int[100];
        for (int i = 0; i < 100; i++) {
            nums [i] = i+1;
        }
        System.out.println(Arrays.toString(nums));
    }
}
