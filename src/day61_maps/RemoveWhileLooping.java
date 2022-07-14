package day61_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveWhileLooping {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 6, 12, 6, 35, 6, 2, 5, 6, 2, 3, 1, 4, 5));

//        for (int i = 0; i < list.size(); i++) { this won't word to remove less than 5 numbers
//            if(list.get(i) < 5){
//                list.remove(i);
//
//            }
//        }      for each loop will be invalid as well
        System.out.println(list);


        Iterator <Integer> it = list.iterator();

        while(it.hasNext()){ // checks if there is a next element to it to keep running
          if (it.next() <= 5){ // move to the next element and then return it
              it.remove();
          }
        }

        System.out.println(list);
    }
}
