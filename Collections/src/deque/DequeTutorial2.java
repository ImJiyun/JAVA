package deque;

import java.util.*;

public class DequeTutorial2 {
    public static void main(String[] args) {
        Deque<Client> deque = new ArrayDeque<>();
        deque.offerLast(new Client("Herny", 34));
        deque.offerLast(new Client("Emma", 86));
        deque.offerFirst(new Client("Taylor", 67));
        deque.offerFirst(new Client("William", 89));

        System.out.println(deque);

        List<Client> clients = new ArrayList<>(deque);
        Collections.sort(clients);
        System.out.println(clients);
    }
}
