package practice;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Deque<Integer> line = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();

        while (input1 != -1) {
            if (input1 == 2) {
                line.pollFirst();
            } else {
                int input2 = scanner.nextInt();
                if (input1 == 0) {
                    line.offerLast(input2);
                }
                if (input1 == 1) {
                    line.offerFirst(input2);
                }
            }
            input1 = scanner.nextInt();
        }
        scanner.close();
        while (!line.isEmpty()) {
            System.out.print(line.pollFirst() + " ");
        }
    }

}
