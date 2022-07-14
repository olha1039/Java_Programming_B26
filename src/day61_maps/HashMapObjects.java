package day61_maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapObjects {
    public static void main(String[] args) {
        // keys are integer types and values are String type
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(3, "three");
        map.put(10, "ten");
        map.put(5, "five");
        System.out.println(map); //HashMap element order is random, not sorted

        // read the key/value from map

        System.out.println(map.get(10)); // argument is the key, not index

        String value = map.get(5);
        System.out.println();

        map.remove(1); // removes the whole pair, not just a key
        System.out.println(map);

        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(3));

        System.out.println(map.containsValue("five"));
        System.out.println(map.containsValue("10"));

        map.put(null, null);
        System.out.println(map);

        map.put(null, "hello world"); // reassigns value to the null key, since duplicates are not allowed
        System.out.println(map);

        map.put(3, "March");
        System.out.println(map);


    }
}
