package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3};

        Arrays.asList(arr);

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr));
        System.out.println(nums);

            // Creating an ArrayList with some initial values

        ArrayList<Integer> other = new ArrayList<>(Arrays.asList(4, 5, 6, 7));
        System.out.println(other);



    }
}
