package day60_collections;

import java.util.PriorityQueue;

public class QueueObjects {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.add(10);
        queue.add(8);
        queue.add(1);
        queue.add(1);
        // queue.get(); get method is from he list, it is not accessible here
        System.out.println(queue);

        queue.offer(30); // adding number to the end
        System.out.println(queue);

        // queue.offer(null); // can't accept null

        // System.out.println(new PriorityQueue<>().remove()); causes exception because there is no elements
        System.out.println(new PriorityQueue<>().poll()); // poll means remove, return null
    }
}
