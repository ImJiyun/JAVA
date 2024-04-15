package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTutorial {
    public static void main(String[] args) {
        // Map: a collection with pairs of a key and a value
        // HashMap: a map that doesn't maintain the insertion order
        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("constitution", "the set of political principles by which a state or organization is governed");
        dictionary.put("law", "a rule, usually made by a government, that is used to order the way in which a society behaves");
        dictionary.put("act", "a law or formal decision made by a parliament ");
        dictionary.put("right", "is allowed to have it or do it, often legally or officially");
        dictionary.put("law", "a rule defining correct procedure or behavior in a sport.");
        // a map cannot have the same value as a key

        System.out.println("Print the map using keySet");
        for (String word: dictionary.keySet()) {
            System.out.println(word);
            System.out.println(dictionary.get(word));
            System.out.println();
        }

        System.out.println("\nPrint the map using entrySet");
        for (Map.Entry<String, String> entry: dictionary.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();
        }

        System.out.println("\nUsing iterator....");
        Iterator<String> itr = dictionary.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("After sorting...");

    }
}
