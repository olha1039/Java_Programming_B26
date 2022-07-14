package day59_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObjects {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>(); // does not keep an order, random order. don't have indexes. Have to interact with it with the loop (can't guarantee the order fot hash set
        set.add(null);
        set.add("hello");
        set.add("$4.5");
        set.add("400");
        set.add("hello"); // will not print duplicates, so there is no second hello
        set.add("%");
        System.out.println(set);

        Set<String> set2 = new LinkedHashSet<>(); // this one maintains the order, still no duplicates,
        set2.add(null);
        set2.add("hello");
        set2.add("$4.5");
        set2.add("400");
        set2.add("hello"); // will not print duplicates, so there is no second hello
        set2.add("%");
        System.out.println(set2);

        Set<String> set3 = new TreeSet<>(); // sorts in aski order
        // set3.add(null); not allowed in tree step
        set3.add("hello");
        set3.add("WORLD");
        set3.add("$4.5");
        set3.add("400");
        set3.add("hello"); // will not print duplicates, so there is no second hello
        set3.add("%");
        System.out.println(set3);
    }
}
