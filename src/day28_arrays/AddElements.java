package day28_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {
        /*
            declare and assign an array of numbers
            sum all the numbers
         */

        int [] numbers = {3, 6, 10};
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];

        }
        System.out.println(sum);




    }
}
