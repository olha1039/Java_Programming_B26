package day00_Interview_practice.from_joseph;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Q32_UniqueCharFromString {
    //Map -- Unique character from String: take the unique characters of a String and save them into a map. Like {d=1,e=1} so keys will be unique letters values will be 1

    public static Map<String,Integer> uniqueChars(String str) {
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String each : str.split("")) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each));
            } else {
                map.put(each, 1);
            }
        }
      for(Map.Entry<String, Integer> each: map.entrySet()){
          map.put(each.getKey(), each.getValue());
      }

      return map;
    }

    public static void main(String[] args) {
        System.out.println(uniqueChars("aaaaabbbbccccddddeeeggghhhkk"));
    }


    }
