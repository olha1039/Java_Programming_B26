package day62_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseExample {
    public static void main(String[] args) {
/*
    People
        FIRST_NAME : James
        LAST_NAME  : Bond
        BATCH      : 7
 */
        Map<String, String> map = new HashMap<>();
        map.put("FIRST_NAME", "James");
        map.put("LAST_NAME", "Bond");
        map.put("BATCH", "7");

        System.out.println(map);

        //  List< String > data list of string elements

        List<Map<String, String>> list = new ArrayList<>();
        list.add(map);
        list.add(makeMap("Shina", "Alhusaini", "18"));
        list.add(makeMap("Olha", "Diachkova", "26"));
        list.add(makeMap("Siarhei", "Dosta", "20"));
        list.add(makeMap("Kamilla", "Holubieva", "16"));
        list.add(makeMap("Jennifer", "Aniston", "18"));

        // how can I check the last name of the map I just added
        System.out.println(list.get(1).get("FIRST_NAME")); // first get is from the list by index, then we have the get method from map to give the value by the key
        System.out.println(list.get(0).get("LAST_NAME"));

        System.out.println();
        // Go through the Array list of Map elements - the map elements are the information for each person

        for (Map<String, String> each : list) {
            System.out.println(each);
        }
        System.out.println();

        // print only first names
        for (Map<String, String> each : list) {
            System.out.println(each.get("FIRST_NAME"));
        }
        System.out.println();

        // find all the people who are at batch 20 and above
        for (Map<String, String> each : list) {
            if (Integer.parseInt(each.get("BATCH")) >= 20) {
                System.out.println(each.get("LAST_NAME"));
            }
        }
        System.out.println();

        // print the information of the last person in my list
        System.out.println("First name: " + list.get(list.size()-1).get("FIRST_NAME"));
        System.out.println("Last name: " + list.get(list.size()-1).get("LAST_NAME"));







    }

    public static Map <String, String> makeMap (String ... values){
        Map <String, String> map = new HashMap<>();
        map.put("FIRST_NAME", values[0]);
        map.put("LAST_NAME", values[1]);
        map.put("BATCH", values[2]);

        return map;
    }
}
