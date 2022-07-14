package day00_Interview_practice.from_joseph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q26_removeName {

    // Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    //Write a java operation to remove all the names named Ahmed

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Ben"));

        System.out.println("=== Approach 1 ===");

        names.removeIf(each -> each.equals("Ahmed"));
        System.out.println(names);

        System.out.println("=== Approach 2 ===");

        for (String each : names) {
            if (each.equals("Ahmed")) {
                names.remove(each);
            }
        }
        System.out.println(names);

        System.out.println("=== Approach 3 ===");

        names.removeAll(Arrays.asList("Ahmed"));
        System.out.println(names);




        }

}
