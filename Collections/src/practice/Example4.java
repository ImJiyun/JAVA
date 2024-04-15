package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfInstruction = sc.nextInt();

        for (int i = 0; i < numberOfInstruction; i++) {
            int instruction = sc.nextInt();
            String key = sc.next();
            int value = sc.nextInt();

            Menu.execute(instruction, key, value);
        }
    }
}

class Menu {
    static private final Map<String, Integer> menuMap = new HashMap<>();

    static public void execute(int instruction, String key, Integer value) {
        if (instruction == 0) {
            menuMap.put(key, value);
        } else if (instruction == 1) {
            menuMap.remove(key);
        } else if (instruction == 2) {
            if (!menuMap.containsKey(key)) {
                System.out.println(0);
                return;
            }
            int price = menuMap.get(key);
            System.out.println(price * value);
        }
    }

    private Menu() {}
}
