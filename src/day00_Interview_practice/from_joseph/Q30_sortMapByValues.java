package day00_Interview_practice.from_joseph;

import java.util.*;

public class Q30_sortMapByValues {
    // Map -- Sort the map by values: Write a method that can sort the Map by values

    public static void sortMapByValue(Map<Integer, Integer> map){
     //   map.forEach((k,v)->System.out.println(k+"="+v));

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        map = new LinkedHashMap<>();
        for(Map.Entry<Integer, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(2, 45);
        map.put(3, 53);
        map.put(1, 34);
        map.put(5, 12);
       sortMapByValue(map);


    }

}
