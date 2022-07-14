package day29_05_31_2022;

import com.sun.jdi.request.InvalidRequestStateException;
import com.sun.source.tree.Tree;
import day57_exceptions.webelement.Link;

import java.util.*;

public class P02_SetPractice {
    public static void main(String[] args) {

        String[] browsers = {"Chrome", "Firefox", "Chrome", "Edge", "IE", "Safari", "Remote-Chrome"};

        System.out.println("------- HASHSET ---------");
        Set<String> hashSet = new HashSet<>(Arrays.asList(browsers));
        System.out.println(hashSet); // [Safari, Chrome, Remote-Chrome, IE, Edge, Firefox]
        hashSet.add(null);
        System.out.println(hashSet); //[null, Safari, Chrome, Remote-Chrome, IE, Edge, Firefox]

        System.out.println("------- LINKEDHASHSET ---------");
        Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(browsers));
        System.out.println(linkedHashSet); //[Chrome, Firefox, Edge, IE, Safari, Remote-Chrome]
        linkedHashSet.add(null);
        System.out.println(linkedHashSet); //[Chrome, Firefox, Edge, IE, Safari, Remote-Chrome, null]

        System.out.println("------- TREESET ---------");
        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList(browsers));
        System.out.println(treeSet); //[Chrome, Edge, Firefox, IE, Remote-Chrome, Safari]
        treeSet.add("null"); // does not accept null as a null
        System.out.println(treeSet); //[Chrome, Edge, Firefox, IE, Remote-Chrome, Safari, null]


        Integer[] a = {1, 2, 3, 44, 3, 67, 43, 2, 78, 9, 8};
        List<Integer> list = Arrays.asList(a);
        System.out.println("---------");
        // remove duplicates from all cases
        // keep insertion order

        System.out.println(new LinkedHashSet<>(list)); //[1, 2, 3, 44, 67, 43, 78, 9, 8]

        // return fifth element after remove

        System.out.println(new ArrayList<>(new LinkedHashSet<>(list)).get(4)); // 67

        // sort in ascending order

        System.out.println(new TreeSet<>(list));

        // sort in desc order
        ArrayList<Integer> sortedList = new ArrayList<>(new TreeSet<>(list));
        Collections.reverse(sortedList);
        System.out.println(sortedList);
    }
}
