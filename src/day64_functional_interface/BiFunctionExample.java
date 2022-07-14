package day64_functional_interface;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

        // compare two numbers, find the biggest one

        // first two types are parameter types, last one is return type
        BiFunction<Integer, Integer, Integer> maxNumber = (one, two) -> {
            return one > two ? one : two;
        };
        System.out.println(maxNumber.apply(5, 9));

        /*
        List <Integer> --> keys -> first parameter
        List <String> --> values --> second parameter
        Map<Integer, String> --> final map that will be returned
         */

        BiFunction<List<Integer>, List<String>, Map<Integer, String>> createMap = (keys, value) -> {
            Map<Integer, String> map = new HashMap<>();
            // can't do for each, because has to work with two arrays list at the time, using traditional
            for (int i = 0; i < keys.size(); i++) {
                map.put(keys.get(i), value.get(i));
            }
            return map;
        };

        List<Integer> keys = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<String> values = new ArrayList<>(Arrays.asList("James", "Ana", "Emre", "Gina"));

        System.out.println(createMap.apply(keys, values));

    }
}
