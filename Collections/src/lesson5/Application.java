package lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {
    public static void main(String[] args) {
        // Map: it's like a dictionary, key-value structure
        // key(word in a dictionary) points to value(definition in a dictionary)
        // every row in data is considered as entry which contains key and value
        // map implements the Map interface
        // 1st argument -> key, 2nd argument -> value
        HashMap<String, String> dictionary = new HashMap<String, String>();
        // insert data
        dictionary.put("Brave", "ready to face and endure danger or pain; showing courage."); // each entry refers to entry set
        dictionary.put("Brilliant", "exceptionally clever or talented.");
        dictionary.put("Joy", "a feeling of great pleasure and happiness.");
        dictionary.put("Confidence", "the feeling or belief that one can rely on someone or something; firm trust.");

        // loop (for each) over key
        // dictionary.keySet() = dictionary.values()
        for (String word: dictionary.keySet()) {
            System.out.println(word); // there is no order in key
            System.out.println(dictionary.get(word)); // get value using key
        }
        // LinkHashMap preserves the order in which the data was inserted

        // loop over key and value
        // entrySet is both key and value together
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // TreeMap: maintains the natural order (Strings -> alphabetic, numbers -> 0 to 10)
        TreeMap<String, String> dictionary2 = new TreeMap<String, String>();
        // sort the keys based on alphabetic order
        dictionary2.put("Brave", "ready to face and endure danger or pain; showing courage."); // each entry refers to entry set
        dictionary2.put("Brilliant", "exceptionally clever or talented.");
        dictionary2.put("Joy", "a feeling of great pleasure and happiness.");
        dictionary2.put("Confidence", "the feeling or belief that one can rely on someone or something; firm trust.");

        for (Map.Entry<String, String> entry : dictionary2.entrySet()) {
            System.out.println(entry.getKey());
        }

        // all maps cannot prevent duplicates
        // when putting the same key already existing in the Map,
        // the value is overridden with new value
    }
}
