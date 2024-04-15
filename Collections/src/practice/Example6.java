package practice;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;

class Rider {
    private String name;
    private boolean isVIP;

    public Rider(String name, boolean isVIP) {
        this.name = name;
        this.isVIP = isVIP;
    }

    public String getName() {
        return name;
    }

    public boolean isVIP() {
        return isVIP;
    }

    @Override
    public String toString() {
        return name + " (VIP: " + isVIP + ")";
    }
}

class RollerCoasterDeque {
    private Deque<Rider> deque;

    public RollerCoasterDeque() {
        deque = new ArrayDeque<>();
    }

    // addRider 메소드를 작성하세요.
    public void addRider(Rider rider) {
        if (rider.isVIP()) {
            deque.addFirst(rider);
        } else {
            deque.addLast(rider);
        }
    }

    // callNextRider 메소드를 작성하세요.
    public Rider callNextRider() {
        return deque.pollFirst();
    }

    // printWaitingRiders 메소드를 작성하세요.
    public void printWaitingRiders() {
        System.out.println("대기중인 승객들:");
        Iterator<Rider> itr = deque.iterator();
        if (!deque.isEmpty()) {
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
    }

}

public class Example6 {
    public static void main(String[] args) {
        RollerCoasterDeque deque = new RollerCoasterDeque();

        deque.addRider(new Rider("Alice", false));
        deque.addRider(new Rider("Bob", true));
        deque.addRider(new Rider("Charlie", false));
        deque.addRider(new Rider("Dave", true));

        deque.printWaitingRiders();

        Rider nextRider = deque.callNextRider();
        System.out.println("다음 차례: " + nextRider);

        deque.printWaitingRiders();
    }
}
