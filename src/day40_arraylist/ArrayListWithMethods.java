package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithMethods {
    public static void main(String[] args) {
        System.out.println(getDaysOfWeek()); // this one doesn't have an access

        ArrayList<String> days = getDaysOfWeek(); // reference to have an access for this array
        System.out.println(days.get(0)); // could reuse line 10
        System.out.println(getDaysOfWeek().get(0));

        System.out.println(printList(getDaysOfWeek()));

        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
        System.out.println(printList(list)); // using print method to print nice line 16


    }
    public static String printList(ArrayList<String> list){ // could word with arraylist
        String str = "LIST: ";
        for(String each : list){
            str += "\n~\t" + each;

        }
        return str; // printing days list from another method to print as a String
    }

    public static ArrayList<String> getDaysOfWeek() {
        ArrayList<String> days = new ArrayList<>(Arrays.asList(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        ));
        return days;
    }

    /*
          String a = "abc"
          a = a.toUpperCase()
          .replace("a", "d")
          .trim()
,     */

}
