package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Example3 {
    public static void main(String[] args) {
        Set<String> tasks = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        scanner.nextLine();
        while (num > 0) {
            String task = scanner.nextLine();
            tasks.add(task);
            num--;
        }
        System.out.println(tasks.size());
        scanner.close();
    }
}
