package day00_Interview_practice.from_joseph;

import java.util.ArrayList;

public class Q29_SortArrayInDescending {
//29.  ArrayList -- sorting in descending order:  Write a method that can sort the ArrayList in descending order without using the sort method

    public static void sortInDescendingOrder(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(i) < list.get(j)) {
                    int tmp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,tmp);
                }
            }
        }
        System.out.println("Sorted Descending ArrayList: " + list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(6);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        System.out.println("Unsorted ArrayList: " + list);
        sortInDescendingOrder(list);


    }

}



