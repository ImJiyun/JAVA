package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTutorial {
    public static void main(String[] args) {
        // Deque = Double Ended Queue
        // it is able to insert and remove data at both ends
        // combination of stack and queue
        // Deque is interface, so implementing classes are needed to
        // make instance
        Deque<String> products = new ArrayDeque<>();

        System.out.println(products);

        products.offerLast("Macbook Air");
        products.offerLast("Apple Watch");
        products.offerFirst("iPhone");
        products.offerFirst("Airpods");
        products.offer("Macbook Pro"); // offer = offerLast

        System.out.println(products); // [Airpods, iPhone, Macbook Air, Apple Watch, Macbook Pro]

        products.poll(); // remove the first data
        System.out.println(products); // [iPhone, Macbook Air, Apple Watch, Macbook Pro]
        System.out.println(products.peek()); // examine the first data // iPhone
        System.out.println(products.pollLast()); // Macbook Pro

        System.out.println(products); // [iPhone, Macbook Air, Apple Watch]
    }
}
