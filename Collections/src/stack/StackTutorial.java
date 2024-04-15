package stack;

import java.util.Iterator;
import java.util.Stack;

public class StackTutorial {
    public static void main(String[] args) {
        // stack
        // last-in-first-out (LIFO)
        Stack<Integer> stack = new Stack<>();
        stack.push(12); // insert data
        stack.push(34);
        stack.push(21);
        stack.push(54);

        System.out.println("Print the data");
        Iterator<Integer> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Remove data");
        while (!stack.empty()) {
            System.out.println(stack.pop()); // remove data
        }
    }
}
