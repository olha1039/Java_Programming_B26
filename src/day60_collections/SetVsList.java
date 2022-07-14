package day60_collections;

import java.util.*;

public class SetVsList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(-5);
        list.add(10);
        list.add(4);
        System.out.println(list);
        System.out.println("first: " + list.get(0));
        System.out.println("last: " + list.get(list.size()-1));

        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(10);
        set.add(1);
        set.add(2);
        set.add(-5);
        set.add(10);
        set.add(4);
        System.out.println(set);
  //    System.out.println("first: " + set.get(0)); //the order is not guaranteed, also it removed duplicates, so it is not possible to run, because there is no indexes
  //       System.out.println("last: " + set.get(list.size()-1));


        // because set does not have indexes, we can use loop to go through the elements
        for(int each : set){
            System.out.println(each);
        }

        // sort my HashSet
        System.out.println(new TreeSet<>(set));

        // convert List to Set
        System.out.println(new LinkedHashSet<>(list));

        System.out.println(new HashSet<>(Arrays.asList(1, 5, 2, 1, 4, 2, 5, 1)));

        String s = "aaaabbbbcccccddddeee";
        System.out.println(new HashSet<>(Arrays.asList(s.split("")))
                .toString()
                .replace(", ", "")
                .replace("[", "")
                .replace("]", ""));

        /* above we convert the String s to an array
        that array is the argument of the Arrays.asList method()
        that array is converted to as List type which is allowed in the HashSet constructor
        because List is a Collection and Collection is the parameter type
        convert the HashSet - which removed the duplicate, to a String and did String manipulation

         */



    }
}
