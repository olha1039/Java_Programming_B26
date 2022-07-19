package day00_Interview_practice.from_joseph;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Q28_sortArrayInAscending {
    //ArrayList -- sorting in ascending: Write a method that can sort the ArrayList in Ascending order without using the sort method

    public static void sortInAscending(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(i) > list.get(j)) {
                    int tmp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,tmp);
                }
            }
        }
        System.out.println("Sorted Ascending ArrayList: " + list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        arr.add(6);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(1);
        System.out.println("Unsorted ArrayList: " + arr);
        sortInAscending(arr);


    }


}
