package set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTutorial2 {
    public static void main(String[] args) {
        // LinkedHashSet is a set that ensures the insertion order
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(231);
        numbers.add(14);
        numbers.add(98);
        numbers.add(76);
        numbers.add(231);

        for (int number: numbers) {
            System.out.println(number); // insertion order is maintained
        }

        System.out.println("Print the numbers using iterator");
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        numbers.remove(14);
        System.out.println("Set after deleting");
        System.out.println(numbers);
    }

}
