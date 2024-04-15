package set;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTutorial3 {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("Canada");
        countries.add("America");
        countries.add("United Kingdom");
        countries.add("Japan");
        countries.add("Korea");
        countries.add("Netherlands");

        System.out.println(countries); // elements are ordered by natural order

        Iterator itr = countries.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();
        System.out.println(countries.headSet("Japan")); // returns a part of set that is smaller than argument
        System.out.println(countries.tailSet("Japan")); // returns a part of set that is bigger than argument

        countries.pollLast();
        countries.pollFirst();
    }
}
