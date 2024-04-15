package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTutorial {
    public static void main(String[] args) {
        // queue is like people waiting in line
        // the earlier inserted, the faster removed
        // queue is an interface, so we need other class which implements it.
        Queue<Integer> queue = new LinkedList<>(); // LinkedList implements deque which implements queue

        queue.offer(34); // insert data
        queue.offer(24);
        queue.offer(76);
        queue.offer(12);
        queue.offer(24);

        System.out.println(queue); // insertion order is maintained

        System.out.println("print queue using iterator");
        Iterator<Integer> itr = queue.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.print("The first data: ");
        System.out.println(queue.peek()); // examine the first data, but not remove

        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // remove data
        }

        System.out.println(queue);
    }
}
