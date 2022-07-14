package day29_05_31_2022;

import java.util.*;

public class P01_ListPractice {
    public static void main(String[] args) {

        Integer[] nums = {1, 2, 3, 4, 5, 4, 3, 2, 1};

        System.out.println("---- ARRAY LIST ----");

      ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(nums));
        System.out.println(arrayList); //[1, 2, 3, 4, 5, 4, 3, 2, 1]
        System.out.println(arrayList.get(0)); // 1
        System.out.println(arrayList.size()); // 9


        System.out.println("---- LINKED LIST ----");
        // the difference is execution time and also LinkedList has some different methods that ArrayList doesn't have
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(nums));
        System.out.println(linkedList); //[1, 2, 3, 4, 5, 4, 3, 2, 1]
        linkedList.addFirst(0);
        linkedList.addLast(100);
        System.out.println(linkedList); // [0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 100]
        System.out.println("linkedList.getFirst() = " + linkedList.getFirst());
        System.out.println("linkedList.getLast() = " + linkedList.getLast());


        System.out.println("---- VECTOR ----");
        // is thread safe,
        Vector<Integer> vector = new Vector<>(Arrays.asList(nums));
        System.out.println(vector); //[1, 2, 3, 4, 5, 4, 3, 2, 1]
        System.out.println("vector.get(0) = " + vector.get(0));
        System.out.println(vector.size());
        vector.add(9);
        vector.remove(8);
        vector.remove(7);
        System.out.println(vector);


        System.out.println("---- STACK ----");
        // new Stack<>(Arrays.asList(nums)) there is no  constructor that accepts list
        // stack follows LIFO, the difference between vector

        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(nums));
        System.out.println(stack); //[1, 2, 3, 4, 5, 4, 3, 2, 1]
        System.out.println(stack.get(0));  // 1
        System.out.println(stack.size());  // 9
        System.out.println(stack.search(5));  // 5

        List<Integer> list = new Stack<>();
        //((Stack<Integer>) list).pop();
       // ((Stack<Integer>) list).push();
        // reference type will decide which methods to use, need to dowcast in order to use stack methods
        System.out.println("------");
        // push()
        stack.push(10);
        System.out.println(stack); //[1, 2, 3, 4, 5, 4, 3, 2, 1, 10]
        // pop()
        Integer a = stack.pop(); // remove last element from stack and returns it
        System.out.println(a); // 1

        System.out.println(stack.add(11)); // true
        System.out.println(stack.push(12)); // 12


        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();

        int size = stack.size();

        for (int i = 0; i < size; i++) { // it should run 11 times, but it does not when I use stack.size with pop(). pop is removing variable each time, so it mens the size decreases each time the loop runs
            System.out.print(stack.pop() + " ");
        }

    }
}
