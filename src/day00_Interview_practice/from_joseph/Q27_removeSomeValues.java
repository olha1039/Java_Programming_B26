package day00_Interview_practice.from_joseph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q27_removeSomeValues {

    // Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 123, 5, 789, 56, 123, 4, 453, 1));

        System.out.println("=== Approach 1 ===");

        list.removeIf(p -> p > 100);
        System.out.println(list);


        System.out.println("=== Approach 2 ===");

        for (Integer each : list) {
            if(each > 100){
                list.remove(each);
            }
        }
        System.out.println(list);


        System.out.println("=== Approach 3 ===");

        List<Integer> list2 = new ArrayList<>();
        for (Integer each : list) {
            if(each < 100){
                list2.add(each);
            }
        }
        System.out.println(list2);
    }


}
