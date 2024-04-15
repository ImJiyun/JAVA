package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTutorial2 {
    public static void main(String[] args) {
        // LinkedHashMap is a map that maintains the insertion order
        Map<String, Integer> clients = new LinkedHashMap<>();

        clients.put("Jay", 5);
        clients.put("Oliver", 3);
        clients.put("Amy", 8);
        clients.put("Kirsten", 9);

        System.out.println(clients);

        System.out.println(clients.keySet());
        System.out.println(clients.entrySet());
    }
}
