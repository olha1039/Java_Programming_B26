package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {
    public static void main(String[] args) {

        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("hello");
        listOne.add("bye");
        System.out.println(listOne);

        ArrayList<String> listTwo = new ArrayList<>(listOne); //adds the elements from the listOne to listTwo
        listTwo.add("Hola");
        System.out.println(listOne);
        System.out.println(listTwo);

        ArrayList<String> listThree = new ArrayList<>(Arrays.asList("one", "two", "three"));
        System.out.println(listThree);

        ArrayList<String> listFour = new ArrayList<>(Arrays.asList("hello", "bye", "Hola"));
        System.out.println(listFour);

    }
}
