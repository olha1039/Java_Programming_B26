package day62_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfChars {

    /*
        Given a String count how many times each character is in the string
     */
    public static void frequencyOfChars(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (map.containsKey(key)) {// the char was found before, this is a duplicate occurrence, so we will need to update the counter for it, which is the value in our map

                map.put(key, map.get(key) + 1); // method from the map to get the previous counter, then we add 1 to that number

            } else { // the map does not contain the character -> which means this is the first time the char was found, so we should add it to the map

                map.put(key, 1);
            }

        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        frequencyOfChars("banana");
    }
}
