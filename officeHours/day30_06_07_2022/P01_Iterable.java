package day30_06_07_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01_Iterable {
    public static void main(String[] args) {

         /*
        Remove names from list if the length smaller than 6 or  name startswith M
         */

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Mehmet", "Toghrul", "Olga", "John", "Erjon", "Daniel", "Emre", "Kamil"
        ));

    }
}
